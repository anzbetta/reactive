package ua.com.reactive.gr_403_reactive.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    private Long id;
    private Long roomId;
    private Long guestId;
    private String checkInDate;
    private String checkOutDate;
    private String status;
}