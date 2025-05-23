
package local.kaline.airports.repositories;

import java.util.List;
import local.kaline.airports.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ppjata
 */
public interface AirportRepository extends JpaRepository<Airport, Long> {
    List<Airport> findByCityIgnoreCase(String city);
}
