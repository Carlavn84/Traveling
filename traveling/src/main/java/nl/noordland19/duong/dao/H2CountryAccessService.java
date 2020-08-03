package nl.noordland19.duong.dao;

import nl.noordland19.duong.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository("H2")
public class H2CountryAccessService implements CountryDao{

    private List<Country> countries;

    private Logger logger = LoggerFactory.getLogger(H2CountryAccessService.class);

    public H2CountryAccessService(List<Country> countries) {
        this.countries = countries;
        logger.debug("H2CountryAccessService Class created");
    }

    @Override
    public int insertCountry(long id, Country country) {
        countries.add(new Country(country.getName()));
        return 1;
    }

    @Override
    public List<Country> selectAllCountries() {
        return countries;
    }

    @Override
    public Optional<Country> selectCountryById(long id) {
        return countries.stream()
                .filter(country -> Objects.equals(country.getId(), id))
                .findFirst();
    }

    @Override
    public int deleteCountryById(long id) {
        Optional<Country> countryMaybe = selectCountryById(id);
        if (countryMaybe.isEmpty()){
            return 0;
        }
        countries.remove(countryMaybe.get());
        return 1;
    }
}
