package nl.noordland19.duong.config;

import nl.noordland19.duong.manager.TravelManager;
import nl.noordland19.duong.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("database")
public class TravelConfigJPA {

    @Autowired
    private CountryRepository countryRepository;

    @Bean
    public TravelManager travelManager(){
        return new TravelManager(countryRepository);
    }
}
