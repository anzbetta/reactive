package ua.com.reactive.gr_403_reactive.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("guests")
public class Guest {

    @Id
    private Long id;

    private String name;

    private String phone;
}
