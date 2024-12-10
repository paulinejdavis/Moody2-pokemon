package com.Moody.spring.Moody2_pokemon.controller;

import com.Moody.spring.Moody2_pokemon.model.PokemonName;
import com.Moody.spring.Moody2_pokemon.service.PokemonService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PokemonControllerUnitTest {

    @Test
    void getPokemonNames_shouldReturnListOfPokemonNames() {
        // Mock the PokemonService with inline test data
        PokemonService pokemonService = new PokemonService(null) {
            @Override
            public List<PokemonName> fetchPokemonNames(int limit) {
                return Arrays.asList(
                        new PokemonName("bulbasaur"),
                        new PokemonName("charmander"),
                        new PokemonName("squirtle")
                );
            }
        };

        // Create an instance of the controller
        PokemonController pokemonController = new PokemonController(pokemonService);

        // Call the method and assert the results
        List<PokemonName> result = pokemonController.getPokemonNames(10);
        assertEquals(
                Arrays.asList(
                        new PokemonName("bulbasaur"),
                        new PokemonName("charmander"),
                        new PokemonName("squirtle")
                ),
                result
        );
    }
}
