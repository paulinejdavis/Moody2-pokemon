package com.Moody.spring.Moody2_pokemon.model;

import java.util.Objects;

public class PokemonName {
    private String name;

    public PokemonName() {
    }
    // Constructor for convenience
    public PokemonName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Override equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PokemonName that = (PokemonName) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

