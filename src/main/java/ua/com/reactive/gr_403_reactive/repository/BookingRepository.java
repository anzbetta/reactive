package ua.com.reactive.gr_403_reactive.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.com.reactive.gr_403_reactive.entity.Booking;
import ua.com.reactive.gr_403_reactive.entity.Message;

public interface BookingRepository extends ReactiveCrudRepository<Booking, Long> {
}


