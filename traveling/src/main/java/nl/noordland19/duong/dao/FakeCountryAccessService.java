package nl.noordland19.duong.dao;

import nl.noordland19.duong.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository("fakeDao")
public class FakeCountryAccessService implements CountryDao {

    private Logger logger = LoggerFactory.getLogger(FakeCountryAccessService.class);
    private final List<Country> countries;

    public FakeCountryAccessService(List<Country> countries) {
        this.countries = countries;
        logger.debug("FakeService Class created");
    }



    @Override
    public int insertCountry(long id, Country country) {
        return 0;
    }

    @Override
    public List<Country> selectAllCountries() {
        logger.debug("Selecting all countries");
        return countries;
    }

    @Override
    public Optional<Country> selectCountryById(long id) {
        return Optional.empty();
    }

     @Override
    public int deleteCountryById(long id) {
        return 0;
    }


}
