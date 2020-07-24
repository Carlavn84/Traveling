package com.config;

import com.manager.TravelManager;
import com.manager.TravelManagerForBusiness;
import com.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
public class TravelConfig {

    @Autowired
    @Qualifier("businessCountries")
    List<Country> businessCountries;

    @Autowired
    @Qualifier("vacationCountries")
    List<Country> vacationCountries;

    @Bean
    public TravelManager travelManager() {
        Set<Country> setOfCountries = Stream.concat(businessCountries.stream(), vacationCountries.stream()).collect(Collectors.toSet());
        return new TravelManagerForBusiness(new ArrayList<>(setOfCountries));
    }
}
