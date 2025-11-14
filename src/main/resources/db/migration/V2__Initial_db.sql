-- rooms --
CREATE TABLE rooms (
                       id BIGSERIAL PRIMARY KEY,
                       number INTEGER NOT NULL,
                       type VARCHAR(100) NOT NULL,
                       price_per_night NUMERIC(10,2) NOT NULL
);

-- guests --
CREATE TABLE guests (
                        id BIGSERIAL PRIMARY KEY,
                        name VARCHAR(255) NOT NULL,
                        phone VARCHAR(50) NOT NULL
);

-- bookings --
CREATE TABLE bookings (
                          id BIGSERIAL PRIMARY KEY,
                          room_id BIGINT NOT NULL,
                          guest_id BIGINT NOT NULL,
                          check_in DATE NOT NULL,
                          check_out DATE NOT NULL,
                          status VARCHAR(50) NOT NULL,

                          CONSTRAINT fk_booking_room
                              FOREIGN KEY (room_id) REFERENCES rooms(id),

                          CONSTRAINT fk_booking_guest
                              FOREIGN KEY (guest_id) REFERENCES guests(id)
);
