package pl.micede.restaurantapi.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@jakarta.persistence.Table(name = "TABLES")
public class Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer numberOfSeats;

    private Float x;

    private Float y;

    private boolean available;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

}
