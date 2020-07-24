package com.manager;

import com.model.Country;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TravelManagerForBusiness implements TravelManager {

    private List<Country> countries;

    @Autowired
    public TravelManagerForBusiness(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> getAllCountries() {
        return countries;
    }
}
