package com.Moody.spring.Moody2_pokemon.service;

import com.Moody.spring.Moody2_pokemon.model.PokemonApiResponse;
import com.Moody.spring.Moody2_pokemon.model.PokemonName;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class PokemonService {
    private final RestTemplate restTemplate;
    private static final String POKEMON_API_URL = "https://pokeapi.co/api/v2/pokemon";
    // In-memory storage for CRUD operations
    private final Map<String, PokemonName> localPokemonStorage = new HashMap<>();

    public PokemonService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String addPokemon(PokemonName pokemonName) {
        localPokemonStorage.put(pokemonName.getName(), pokemonName);
        return "Added Pokémon: " + pokemonName.getName();
    }

    public Collection<PokemonName> getAllLocalPokemon() {
        return localPokemonStorage.values();
    }

    public String updatePokemon(String name, PokemonName updatedPokemon) {
        if (localPokemonStorage.containsKey(name)) {
            localPokemonStorage.put(name, updatedPokemon);
            return "Updated Pokémon: " + name;
        }
        return "Pokémon not found: " + name;
    }

    public String deletePokemon(String name) {
        if (localPokemonStorage.remove(name) != null) {
            return "Deleted Pokémon: " + name;
        }
        return "Pokémon not found: " + name;
    }

    // Fetch names from Poke API
    public List<PokemonName> fetchPokemonNames(int limit) {
        String url = POKEMON_API_URL + "?limit=" + limit;
        PokemonApiResponse response = restTemplate.getForObject(url, PokemonApiResponse.class);

        return response.getResults().stream()
                .map(result -> new PokemonName(result.getName()))
                .collect(Collectors.toList());
    }
}