
package ua.com.reactive.gr_403_reactive.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.gr_403_reactive.entity.Room;
import ua.com.reactive.gr_403_reactive.repository.RoomRepository;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository repo;

    public Flux<Room> list() { return repo.findAll(); }

    public Mono<Room> get(Long id) { return repo.findById(id); }

    public Mono<Room> create(Room r) { return repo.save(r); }

    public Mono<Room> update(Long id, Room r) {
        r.setId(id);
        return repo.save(r);
    }

    public Mono<Void> delete(Long id) { return repo.deleteById(id); }
}
