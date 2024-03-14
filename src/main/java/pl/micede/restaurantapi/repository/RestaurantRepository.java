package pl.micede.restaurantapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.micede.restaurantapi.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
