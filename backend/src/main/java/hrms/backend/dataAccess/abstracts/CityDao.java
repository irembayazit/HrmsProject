package hrms.backend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {

}
