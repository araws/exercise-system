package com.exercise.system.exercisesystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "ROOM_ID", referencedColumnName = "ID")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "POST_ID", referencedColumnName = "ID")
    private Post posts;
}
