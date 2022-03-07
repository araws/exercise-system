package com.exercise.system.exercisesystem.services.springdatajpa;

import com.exercise.system.exercisesystem.model.Customer;
import com.exercise.system.exercisesystem.model.Room;
import com.exercise.system.exercisesystem.repositories.RoomRepository;
import com.exercise.system.exercisesystem.services.RoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
public class RoomSDJpaService implements RoomService {

    private final RoomRepository roomRepository;

    public RoomSDJpaService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public Set<Room> findAll() {
        Set<Room> rooms = new HashSet<>();
        roomRepository.findAll().forEach(rooms::add);
        return rooms;
    }

    @Override
    public Optional<Room> findById(Long id) {
        return roomRepository.findById(id);
    }

    @Override
    public Room save(Room room) {
        log.debug("Saving a room...");
        return roomRepository.save(room);
    }

    @Override
    public void delete(Room room) {
        log.debug("Deleting a room...");
        roomRepository.delete(room);
    }

    @Override
    public void deleteById(Long id) {
        log.debug("Deleting a room...");
        roomRepository.deleteById(id);
    }
}
