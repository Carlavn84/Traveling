package com.manager;

import com.dao.CountryDao;
import com.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelManager {

private final CountryDao countryDao;
@Autowired
    public TravelManager(@Qualifier("fakeDao") CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    public int addCountry(Country country){
        return countryDao.insertCountry(country);
    }
}



