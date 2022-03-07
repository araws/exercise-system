package com.exercise.system.exercisesystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDate createdDate;

    @ManyToOne
    @JoinColumn(name = "ROOM_ID", referencedColumnName = "ID")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    private Customer customer;
}
