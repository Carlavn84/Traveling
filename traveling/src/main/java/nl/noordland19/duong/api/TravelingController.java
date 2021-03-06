package nl.noordland19.duong.api;

import nl.noordland19.duong.manager.TravelManager;
import nl.noordland19.duong.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("api/v1/country")
@RestController

public class TravelingController {

    private Logger logger = LoggerFactory.getLogger(TravelingController.class);

    @Autowired
    private TravelManager travelManager;

    TravelingController() {
        logger.debug("Controller Class created");
    }

    @GetMapping
    public List<String> getAllCountries() {
        logger.debug("Getting all countries");
        List<Country> allCountries = travelManager.getAllCountries();
        return allCountries.stream().map(Country::getName).collect(Collectors.toList());
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return travelManager.saveCountry(country);
    }

    @GetMapping(path = "{id}")
    public Country getCountryById(@PathVariable("id") long id) {
        return travelManager.getCountryById(id);

    }

    @DeleteMapping(path = "{id}")
    public void deleteCountryById(@PathVariable("id") long id) {
        travelManager.deleteCountryById(id);
    }
}
