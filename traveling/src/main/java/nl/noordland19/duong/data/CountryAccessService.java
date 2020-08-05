package nl.noordland19.duong.data;

import nl.noordland19.duong.model.Country;

import java.util.List;
import java.util.Optional;


public interface CountryAccessService {

    long insertCountry(Country country);

    List<Country> selectAllCountries();

    Optional<Country> selectCountryById(long id);

    void deleteCountryById(long id);




}