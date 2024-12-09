package com.Moody.spring.Moody2_pokemon.service;

import com.Moody.spring.Moody2_pokemon.model.PokemonApiResponse;
import com.Moody.spring.Moody2_pokemon.model.PokemonResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PokemonService {
    private static final String POKEMON_API_URL = "https://pokeapi.co/api/v2/pokemon?limit=10";

    private final RestTemplate restTemplate;

    public PokemonService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<String> fetchPokemonNames() {
        // Call the API and map the response
        PokemonApiResponse response = restTemplate.getForObject(POKEMON_API_URL, PokemonApiResponse.class);

        // Extract and return Pokémon names
        return response.getResults().stream()
                .map(PokemonResult::getName)
                .collect(Collectors.toList());
    }
}
