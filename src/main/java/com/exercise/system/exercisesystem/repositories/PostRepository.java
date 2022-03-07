package com.exercise.system.exercisesystem.repositories;

import com.exercise.system.exercisesystem.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
