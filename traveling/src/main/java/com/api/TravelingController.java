package com.api;

import com.manager.TravelManager;
import com.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/country")
@RestController
public class TravelingController {

	private final TravelManager travelManager;

	@Autowired
	public TravelingController(TravelManager travelManager) {
		this.travelManager = travelManager;
	}

	@PostMapping
	public void addCountry(@RequestBody Country country){
		travelManager.addCountry(country);
	}
}
