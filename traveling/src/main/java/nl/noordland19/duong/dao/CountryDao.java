package nl.noordland19.duong.dao;

import nl.noordland19.duong.model.Country;

import java.util.List;
import java.util.Optional;


public interface CountryDao {

    int insertCountry(long id, Country country);

    List<Country> selectAllCountries();

    Optional<Country> selectCountryById(long id);

    int deleteCountryById(long id);




}