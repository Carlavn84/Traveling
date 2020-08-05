package nl.noordland19.duong.config;

import nl.noordland19.duong.data.CountryAccessService;
import nl.noordland19.duong.data.fake.FakeCountryAccessService;
import nl.noordland19.duong.manager.TravelManager;
import nl.noordland19.duong.model.Country;
import nl.noordland19.duong.repositories.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Profile("fake")
public class TravelConfigFake {

    private Logger logger = LoggerFactory.getLogger(TravelConfigFake.class);

    TravelConfigFake() {
        logger.debug("Config Class created");
    }
//
//    @Bean
//    public List<Country> countries() {
//        List<Country> countries = new ArrayList<>();
//
//
//        countries.add(new Country());
//
//        logger.debug("Created list of countries");
//
//        return countries;
//    }
//
//    @Bean
//    public CountryAccessService countryAccessService() {
//        return new FakeCountryAccessService(countries());
//    }




}
