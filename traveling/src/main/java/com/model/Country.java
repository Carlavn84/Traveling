package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Country {

    private final String name;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

