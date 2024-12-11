package com.Moody.spring.Moody2_pokemon.controller;

import com.Moody.spring.Moody2_pokemon.model.PokemonName;
import com.Moody.spring.Moody2_pokemon.service.PokemonService;
import org.springframework.web.bind.annotation.*;


import java.util.Collection;
import java.util.List;
@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {
    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @PostMapping
    public String addPokemon(@RequestBody PokemonName pokemonName) {
        return pokemonService.addPokemon(pokemonName);
    }

    @GetMapping("/local")
    public Collection<PokemonName> getAllLocalPokemon() {
        return pokemonService.getAllLocalPokemon();
    }

    @PutMapping("/{name}")
    public String updatePokemon(@PathVariable String name, @RequestBody PokemonName updatedPokemon) {
        return pokemonService.updatePokemon(name, updatedPokemon);
    }

    @DeleteMapping("/{name}")
    public String deletePokemon(@PathVariable String name) {
        return pokemonService.deletePokemon(name);
    }

    // Fetches names from Poke API
    @GetMapping("/names")
    public List<PokemonName> getPokemonNames(@RequestParam(defaultValue = "10") int limit) {
        if (limit <= 0) {
            throw new IllegalArgumentException("Limit must be greater than 0");
        }

        return pokemonService.fetchPokemonNames(limit);
    }
}