package pl.micede.restaurantapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.micede.restaurantapi.dto.RestaurantRequestDto;
import pl.micede.restaurantapi.model.Restaurant;
import pl.micede.restaurantapi.repository.RestaurantRepository;

import java.time.LocalTime;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

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



}
