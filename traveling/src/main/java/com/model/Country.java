package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.lang.NonNull;
import org.springframework.lang.NonNullFields;

import java.util.UUID;

public class Country {

    private final UUID id;

    private final String name;

    public Country(@JsonProperty("id") UUID id,
                   @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }
}

