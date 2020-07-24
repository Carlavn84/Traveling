package com.dao;

import com.model.Country;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CountryDao {

    int insertCountry(UUID id, Country country);

    default int insertCountry(Country country){
        UUID id = UUID.randomUUID();

        return insertCountry(id, country);
    }

    List<Country> selectAllCountries();

    default List<Country> selectAllCountriesDefault(List<Country> countries){
        UUID id = UUID.randomUUID();

        Country country = new Country(id, "Vietnam");
        Country country1 = new Country(id, "German");
        Country country2 = new Country(id, "Netherlands");

        countries.add(country);
        countries.add(country1);
        countries.add(country2);

        return  countries;
    }

    Optional<Country> selectCountryById(UUID id);

    int deleteCountryById(UUID id);

    int updateCountryById(UUID id, Country country);
}
