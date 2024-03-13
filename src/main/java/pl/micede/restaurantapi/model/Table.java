package pl.micede.restaurantapi.model;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.bind.annotation.InitBinder;

@Entity
@Data
public class Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer numberOfSeats;

    private Integer x;

    private Integer y;

    private boolean available;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

}
