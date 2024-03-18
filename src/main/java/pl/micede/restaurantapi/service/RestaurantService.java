package pl.micede.restaurantapi.service;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.micede.restaurantapi.dto.RestaurantRequestDto;
import pl.micede.restaurantapi.model.Restaurant;
import pl.micede.restaurantapi.model.Table;
import pl.micede.restaurantapi.repository.RestaurantRepository;
import pl.micede.restaurantapi.repository.TableRepository;
import pl.micede.restaurantapi.utils.exception.NoSuchTableException;

import java.time.LocalTime;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final TableRepository tableRepository;

    public Restaurant addRestaurant(RestaurantRequestDto requestDto) {
        Restaurant restaurant = new Restaurant();
        restaurant.setName(requestDto.getRestaurantName());
        restaurant.setAddress(requestDto.getAddress());
        restaurant.setOpenHour(LocalTime.parse(requestDto.getOpenHour()));
        restaurant.setCloseHour(LocalTime.parse(requestDto.getCloseHour()));
        restaurant.setImages(requestDto.getImages());
        restaurant.setCuisineType(requestDto.getCuisineType());
        restaurant.setTables(requestDto.getTables());
        return restaurantRepository.save(restaurant);
    }


    public Table updateTableLocation(@Valid Long id, Float x, Float y, boolean available) {
        Table table = tableRepository.findById(id).orElseThrow(() -> new NoSuchTableException("Table not found"));
        table.setX(x);
        table.setY(y);
        table.setAvailable(available);
        return tableRepository.save(table);
    }
}
