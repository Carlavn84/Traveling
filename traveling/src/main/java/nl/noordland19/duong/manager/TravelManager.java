package nl.noordland19.duong.manager;

import nl.noordland19.duong.model.Country;
import nl.noordland19.duong.repositories.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TravelManager {

    private final CountryRepository countryRepository;
    private Logger logger = LoggerFactory.getLogger(TravelManager.class);

    @Autowired
    public TravelManager(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;

        logger.debug("Travel Manager Class created");
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country getCountryById(final Long id) {
        return countryRepository.findById(id).get();
    }

    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    public void deleteCountryById(final Long id) {
        countryRepository.deleteById(id);
    }


    }

