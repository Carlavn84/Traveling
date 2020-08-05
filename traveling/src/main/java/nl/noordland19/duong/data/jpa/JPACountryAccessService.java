package nl.noordland19.duong.data.jpa;

import nl.noordland19.duong.data.CountryAccessService;
import nl.noordland19.duong.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public class JPACountryAccessService implements CountryAccessService {

    private Logger logger = LoggerFactory.getLogger(JPACountryAccessService.class);

    public JPACountryAccessService() {
        logger.debug(getClass().getSimpleName() + " instance created");
    }

    @Override
    public long insertCountry(Country country) {
return 0;
    }

    @Override
    public List<Country> selectAllCountries() {
        return null;
    }

    @Override
    public Optional<Country> selectCountryById(long id) {
        return null;
    }

    @Override
    public void deleteCountryById(long id) {
    }
}
