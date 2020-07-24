package com.config;

import com.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CountryConfig {

    @Bean
    @Qualifier("businessCountries")
    public Country meomap() {
        return new Country("Meo Map Country");
    }

    @Bean
    @Qualifier("vacationCountries")
    public Country germany() {
        return new Country("Germany");
    }

    @Bean
    @Qualifier("businessCountries")
    @Autowired
    public Country germanyForBusiness(Country germany) {
        return germany;
    }

    @Bean
    @Qualifier("vacationCountries")
    public Country vietnam() {
        return new Country("Vietnam");
    }

    @Bean
    @Qualifier("vacationCountries")
    public Country netherlands() {
        return new Country("The Netherlands");
    }
}
