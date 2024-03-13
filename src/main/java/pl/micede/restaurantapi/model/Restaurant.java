package pl.micede.restaurantapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.List;
@Entity
@Data
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Address address;

    private LocalTime openHour;
    private LocalTime closeHour;

    private List<ImageEntity> images;

    private CuisineType cuisineType;

    private List<Table> tables;




}
