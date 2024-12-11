package com.Moody.spring.Moody2_pokemon.model;

import java.util.List;

public class PokemonApiResponse {
    private List<PokemonResult> results;

    public List<PokemonResult> getResults() {
        return results;
    }

    public void setResults(List<PokemonResult> results) {
        this.results = results;
    }
}

