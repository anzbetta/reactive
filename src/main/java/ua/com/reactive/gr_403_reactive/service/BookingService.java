package ua.com.reactive.gr_403_reactive.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.gr_403_reactive.entity.Booking;
import ua.com.reactive.gr_403_reactive.repository.BookingRepository;

@Service
@RequiredArgsConstructor
public class BookingService {

    private final BookingRepository repo;

    public Flux<Booking> list() {
        return repo.findAll();
    }

    public Mono<Booking> get(Long id) {
        return repo.findById(id);
    }

    public Mono<Booking> create(Booking booking) {
        return repo.save(booking);
    }

    public Mono<Booking> update(Long id, Booking booking) {
        booking.setId(id);
        return repo.save(booking);
    }

    public Mono<Void> delete(Long id) {
        return repo.deleteById(id);
    }
}
