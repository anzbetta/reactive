package ua.com.reactive.gr_403_reactive.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("rooms")
public class Room {

    @Id
    private Long id;

    private int number;

    private String type;

    @Column("price_per_night")
    private double pricePerNight;
}
