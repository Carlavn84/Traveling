package nl.noordland19.duong.repositories;

import nl.noordland19.duong.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
