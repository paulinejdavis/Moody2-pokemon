package com.Moody.spring.Moody2_pokemon.controller;

import com.Moody.spring.Moody2_pokemon.service.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PokemonController {
    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/pokemon/names")
    public List<String> getPokemonNames() {
        return pokemonService.fetchPokemonNames();
    }
}
