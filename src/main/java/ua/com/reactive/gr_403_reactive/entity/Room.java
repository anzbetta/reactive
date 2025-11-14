package ua.com.reactive.gr_403_reactive.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    private Long id;
    private String type;
    private double pricePerNight;
    private boolean available;
}