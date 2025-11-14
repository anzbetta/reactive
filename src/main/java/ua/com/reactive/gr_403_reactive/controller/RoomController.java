package ua.com.reactive.gr_403_reactive.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.gr_403_reactive.entity.Room;
import ua.com.reactive.gr_403_reactive.service.RoomService;

@RestController
@RequestMapping("/rooms")
@RequiredArgsConstructor
public class RoomController {

    private final RoomService service;

    @GetMapping
    public Flux<Room> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Mono<Room> get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public Mono<Room> create(@RequestBody Room room) {
        return service.create(room);
    }

    @PutMapping("/{id}")
    public Mono<Room> update(@PathVariable Long id,
                             @RequestBody Room room) {
        return service.update(id, room);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
