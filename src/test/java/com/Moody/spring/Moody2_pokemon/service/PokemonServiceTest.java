package com.Moody.spring.Moody2_pokemon.service;

import com.Moody.spring.Moody2_pokemon.model.PokemonName;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PokemonServiceTest {

    @Test
    void fetchPokemonNames_shouldReturnListOfPokemonNames() {
        RestTemplate restTemplate = new RestTemplate();
        PokemonService pokemonService = new PokemonService(restTemplate);
        List<PokemonName> pokemonNames = pokemonService.fetchPokemonNames(10);

        assertNotNull(pokemonNames);
        assertTrue(pokemonNames.size() > 0);
        assertTrue(pokemonNames.stream().anyMatch(name -> name.getName().equals("bulbasaur")));
    }
}
