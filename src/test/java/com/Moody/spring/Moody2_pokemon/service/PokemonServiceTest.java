package com.Moody.spring.Moody2_pokemon.service;

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
        List<String> pokemonNames = pokemonService.fetchPokemonNames();

        assertNotNull(pokemonNames);
        assertTrue(pokemonNames.size() > 0);
        assertTrue(pokemonNames.contains("bulbasaur"));
    }
}
