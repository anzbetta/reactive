package ua.com.reactive.gr_403_reactive.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guest {
    private Long id;
    private String name;
    private String phone;
}