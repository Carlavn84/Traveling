package com.dao;

import com.model.Country;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakeCountryDataAccessService implements CountryDao {

    private static List<Country> countries = new ArrayList<>();

    @Override
    public int insertCountry(UUID id, Country country) {
        countries.add(new Country(id, country.getName()));
        return 1;
    }

    @Override
    public List<Country> selectAllCountries() {
        return countries;
    }

    @Override
    public Optional<Country> selectCountryById(UUID id) {
        return countries.stream()
                .filter(country -> country.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteCountryById(UUID id) {
        Optional<Country> countryMaybe = selectCountryById(id);
        if (countryMaybe.isEmpty()){
            return 0;
        }
        countries.remove(countryMaybe.get());
        return 1;
    }

    @Override
    public int updateCountryById(UUID id, Country countryUpdate) {
        return selectCountryById(id)
                .map(country -> {
                    int indexOfCountryToUpdate = countries.indexOf(country);
                    if(indexOfCountryToUpdate >= 0){
                        countries.set(indexOfCountryToUpdate, new Country(id, countryUpdate.getName()));
                        return 1;
                    }
                    return  0;
                })
                .orElse(0);
    }
}
