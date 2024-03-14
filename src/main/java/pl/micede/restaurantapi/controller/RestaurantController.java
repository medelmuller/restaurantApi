package pl.micede.restaurantapi.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.micede.restaurantapi.dto.RestaurantRequestDto;
import pl.micede.restaurantapi.model.Restaurant;
import pl.micede.restaurantapi.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
@RequiredArgsConstructor
public class RestaurantController {


    private final RestaurantService restaurantService;
    @PostMapping("/add")
    public ResponseEntity<Restaurant> addRestaurant(@Valid @RequestBody RestaurantRequestDto requestDto) {
        Restaurant restaurant = restaurantService.addRestaurant(requestDto);
        return new ResponseEntity<>(restaurant, HttpStatus.CREATED);
    }

}
