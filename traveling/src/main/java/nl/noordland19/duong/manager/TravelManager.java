package nl.noordland19.duong.manager;

import nl.noordland19.duong.dao.CountryDao;
import nl.noordland19.duong.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TravelManager {

    private final CountryDao countryDao;
    private Logger logger = LoggerFactory.getLogger(TravelManager.class);

    @Autowired
    public TravelManager(CountryDao countryDao) {
        this.countryDao = countryDao;
        logger.debug("Travel Manager Class created");
    }

    public List<Country> getAllCountries() {
        logger.debug("Getting all countries");
        return countryDao.selectAllCountries();
    }

    public int addCountry(long id, Country country) {
        return countryDao.insertCountry(id, country);
    }

    public Optional<Country> getCountryById(long id) {
        return countryDao.selectCountryById(id);
    }

    public int deleteCountry(long id) {
        return countryDao.deleteCountryById(id);
    }
}
