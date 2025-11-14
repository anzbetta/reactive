package ua.com.reactive.gr_403_reactive.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.gr_403_reactive.entity.Guest;
import ua.com.reactive.gr_403_reactive.service.GuestService;

@RestController
@RequestMapping("/guests")
@RequiredArgsConstructor
public class GuestController {

    private final GuestService service;

    @GetMapping
    public Flux<Guest> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Mono<Guest> get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public Mono<Guest> create(@RequestBody Guest guest) {
        return service.create(guest);
    }

    @PutMapping("/{id}")
    public Mono<Guest> update(@PathVariable Long id,
                              @RequestBody Guest guest) {
        return service.update(id, guest);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
