package nl.noordland19.duong.data.fake;

import nl.noordland19.duong.data.CountryAccessService;
import nl.noordland19.duong.model.Country;
import nl.noordland19.duong.repositories.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface FakeCountryAccessService extends CountryRepository {

}
