package pl.micede.restaurantapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TableReqDto {

    @NotNull
    private Float x;

    @NotNull
    private Float y;

    private boolean available;
}
