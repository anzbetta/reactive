package ua.com.reactive.gr_403_reactive.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.gr_403_reactive.entity.Guest;
import ua.com.reactive.gr_403_reactive.repository.GuestRepository;

@Service
@RequiredArgsConstructor
public class GuestService {

    private final GuestRepository repo;

    public Flux<Guest> list() {
        return repo.findAll();
    }

    public Mono<Guest> get(Long id) {
        return repo.findById(id);
    }

    public Mono<Guest> create(Guest g) {
        return repo.save(g);
    }

    public Mono<Guest> update(Long id, Guest g) {
        g.setId(id);
        return repo.save(g);
    }

    public Mono<Void> delete(Long id) {
        return repo.deleteById(id);
    }
}
