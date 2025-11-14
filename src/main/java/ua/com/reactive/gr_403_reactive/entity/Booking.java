package ua.com.reactive.gr_403_reactive.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("bookings")
public class Booking {

    @Id
    private Long id;

    @Column("room_id")
    private Long roomId;

    @Column("guest_id")
    private Long guestId;

    @Column("check_in")
    private LocalDate checkIn;

    @Column("check_out")
    private LocalDate checkOut;

    private String status;
}
