package com.manager;

import com.example.traveling.Country;

import java.util.List;

public class TravelManager {
    private List<Country> countries;

    public List<Country> getCountries(){
        return  countries;
    }

    public void setCountries(List<Country> countries){
        this.countries = countries;
    }
}
