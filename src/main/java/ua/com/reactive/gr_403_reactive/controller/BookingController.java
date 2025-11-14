package ua.com.reactive.gr_403_reactive.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.gr_403_reactive.entity.Booking;
import ua.com.reactive.gr_403_reactive.service.BookingService;

@RestController
@RequestMapping("/bookings")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService service;

    @GetMapping
    public Flux<Booking> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Mono<Booking> get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public Mono<Booking> create(@RequestBody Booking booking) {
        return service.create(booking);
    }

    @PutMapping("/{id}")
    public Mono<Booking> update(@PathVariable Long id,
                                @RequestBody Booking booking) {
        return service.update(id, booking);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
