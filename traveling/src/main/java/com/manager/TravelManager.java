package com.manager;

import com.dao.CountryDao;
import com.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TravelManager {

    private final CountryDao countryDao;

    @Autowired
    public TravelManager(@Qualifier("fakeDao") CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    public int addCountry(Country country) {
        return countryDao.insertCountry(country);
    }

    public List<Country> getAllCountries() {
        return countryDao.selectAllCountries();
    }

    public Optional<Country> getCountryById(UUID id) {
        return countryDao.selectCountryById(id);
    }

    public int deleteCountry(UUID id) {
        return countryDao.deleteCountryById(id);
    }

    public int updateCountry(UUID id, Country newCountry) {
        return countryDao.updateCountryById(id, newCountry);
    }
}



