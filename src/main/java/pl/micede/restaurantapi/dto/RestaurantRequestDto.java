package pl.micede.restaurantapi.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jdk.jfr.SettingDefinition;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import pl.micede.restaurantapi.model.Address;
import pl.micede.restaurantapi.model.CuisineType;
import pl.micede.restaurantapi.model.ImageEntity;
import pl.micede.restaurantapi.model.Table;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class RestaurantRequestDto {

    @NotBlank
    private String restaurantName;

    @NotNull
    private Address address;

    @NotNull
    private String openHour;

    @NotNull
    private String closeHour;


    private List<ImageEntity> images;

    @NotNull
    private CuisineType cuisineType;

    @NotNull
    private List<Table> tables;
}
