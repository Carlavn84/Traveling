package com.dao;

import com.model.Country;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakeCountryDataAccessService implements CountryDao {

    private static List<Country> DB = new ArrayList<>();

    @Override
    public int insertCountry(UUID id, Country country) {
        DB.add(new Country(id, country.getName()));
        return 1;
    }
}
