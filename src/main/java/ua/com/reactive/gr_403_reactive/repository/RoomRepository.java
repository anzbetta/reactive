package ua.com.reactive.gr_403_reactive.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.com.reactive.gr_403_reactive.entity.Message;
import ua.com.reactive.gr_403_reactive.entity.Room;

public interface RoomRepository extends ReactiveCrudRepository<Room, Long> {
}


