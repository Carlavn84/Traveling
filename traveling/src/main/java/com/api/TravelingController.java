package com.api;

import com.manager.TravelManager;
import com.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/country")
@RestController
public class TravelingController {

    private final TravelManager travelManager;

    @Autowired
    public TravelingController(TravelManager travelManager) {
        this.travelManager = travelManager;
    }

    @PostMapping
    public void addCountry(@Validated @NonNull @RequestBody Country country) {
        travelManager.addCountry(country);
    }

    @GetMapping
    public List<Country> getAllCountries() {
        return travelManager.getAllCountries();
    }

    @GetMapping(path = "{id}")
    public Country getCountryById(@PathVariable("id") UUID id) {
        return travelManager.getCountryById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteCountryById(@PathVariable("id") UUID id) {
        travelManager.deleteCountry(id);
    }

    @PutMapping(path = "{id}")
    public void updateCountry(@PathVariable("id") UUID id, @Validated @NonNull @RequestBody Country countryToUpdate) {
        travelManager.updateCountry(id, countryToUpdate);
    }
}
