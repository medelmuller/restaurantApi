package pl.micede.restaurantapi.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.micede.restaurantapi.dto.RestaurantRequestDto;
import pl.micede.restaurantapi.dto.TableReqDto;
import pl.micede.restaurantapi.model.Restaurant;
import pl.micede.restaurantapi.model.Table;
import pl.micede.restaurantapi.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
@RequiredArgsConstructor
public class RestaurantController {


    private final RestaurantService restaurantService;
    @PostMapping("/add")
    public ResponseEntity<Long> addRestaurant(@Valid @RequestBody RestaurantRequestDto requestDto) {
        Restaurant restaurant = restaurantService.addRestaurant(requestDto);
        return new ResponseEntity<>(restaurant.getId(), HttpStatus.CREATED);
    }

    @PutMapping("/updateTable/{id}")
    public ResponseEntity<Table> updateLocationAndAvailabilityOfTablesById(@Valid @PathVariable Long id, @Valid @RequestBody TableReqDto dto) {

        Table table = restaurantService.updateTableLocation(id, dto.getX(), dto.getY(), dto.isAvailable());
        return ResponseEntity.ok(table);

    }




}
