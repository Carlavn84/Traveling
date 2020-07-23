package com.dao;

import com.model.Country;

import java.util.UUID;

public interface CountryDao {

    int insertCountry(UUID id, Country country);

    default int insertCountry(Country country){
        UUID id = UUID.randomUUID();
        return insertCountry(id, country);
    }
}
