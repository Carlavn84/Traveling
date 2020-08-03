package nl.noordland19.duong.config;

import nl.noordland19.duong.dao.CountryDao;
import nl.noordland19.duong.dao.FakeCountryAccessService;
import nl.noordland19.duong.dao.H2CountryAccessService;
import nl.noordland19.duong.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Configuration
public class TravelConfig {

    private Logger logger = LoggerFactory.getLogger(TravelConfig.class);

    TravelConfig() {
        logger.debug("Config Class created");
    }

    @Bean

    public List<Country> countries() {
        List<Country> countries = new ArrayList<>();


        countries.add(new Country("Meo map"));
        countries.add(new Country("Meo ty hon"));

        logger.debug("Created list of countries");

        return countries;
    }

    @Bean
    public FakeCountryAccessService fakeCountryAccessService() {
        return new FakeCountryAccessService(countries());
    }

    @Bean
    @Primary
    public H2CountryAccessService h2CountryAccessService() {
       List<Country> countries = new ArrayList<>();

        return new H2CountryAccessService(countries);
    }
}
