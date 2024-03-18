package pl.micede.restaurantapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.micede.restaurantapi.model.Table;

import java.util.Optional;

public interface TableRepository extends JpaRepository<Table, Long> {

    Optional<Table> findById(Long id);
}
