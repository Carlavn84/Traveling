package com.api;

import com.manager.TravelManager;
import com.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequestMapping("api/v1/country")
@RestController
public class TravelingController {

    @Autowired
    private TravelManager travelManager;

//    @Autowired
//    public TravelingController(TravelManager travelManager) {
//        this.travelManager = travelManager;
//    }

    @GetMapping
    public List<String> getAllCountries() {
        List<Country> allCountries = travelManager.getAllCountries();
        return allCountries.stream().map(Country::getName).collect(Collectors.toList());
    }
}
