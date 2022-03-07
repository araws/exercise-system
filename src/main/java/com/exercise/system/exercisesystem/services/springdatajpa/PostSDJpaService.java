package com.exercise.system.exercisesystem.services.springdatajpa;

import com.exercise.system.exercisesystem.model.Customer;
import com.exercise.system.exercisesystem.model.Post;
import com.exercise.system.exercisesystem.repositories.PostRepository;
import com.exercise.system.exercisesystem.services.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
public class PostSDJpaService implements PostService {

    private final PostRepository postRepository;

    public PostSDJpaService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Set<Post> findAll() {
        Set<Post> posts = new HashSet<>();
        postRepository.findAll().forEach(posts::add);
//        posts = Collections.unmodifiableSet(postRepository.findAll());
        return posts;
    }

    @Override
    public Optional<Post> findById(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public Post save(Post post) {
        log.debug("Saving a post...");
        return postRepository.save(post);
    }

    @Override
    public void delete(Post post) {
        log.debug("Deleting a post...");
        postRepository.delete(post);
    }

    @Override
    public void deleteById(Long id) {
        log.debug("Deleting a post...");
        postRepository.deleteById(id);
    }
}
