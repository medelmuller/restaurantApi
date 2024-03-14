package pl.micede.restaurantapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;


public enum CuisineType {

    FRENCH,
    POLISH,
    ITALIAN,
    CHINESE,
    THAI,
    STREET_FOOD;



}
