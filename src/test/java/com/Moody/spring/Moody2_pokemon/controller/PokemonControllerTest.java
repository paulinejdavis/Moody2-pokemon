package com.Moody.spring.Moody2_pokemon.controller;

import com.Moody.spring.Moody2_pokemon.service.PokemonService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PokemonControllerUnitTest {

    @Test
    void getPokemonNames_shouldReturnListOfPokemonNames() {
        // Create a real instance of the service with inline test data
        PokemonService pokemonService = new PokemonService(null) {
            @Override
            public List<String> fetchPokemonNames() {
                return Arrays.asList("bulbasaur", "charmander", "squirtle");
            }
        };

        PokemonController pokemonController = new PokemonController(pokemonService);
        List<String> result = pokemonController.getPokemonNames();
        assertEquals(Arrays.asList("bulbasaur", "charmander", "squirtle"), result);
    }
}
