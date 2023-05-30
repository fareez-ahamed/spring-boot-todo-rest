package info.fareez.todorest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import info.fareez.todorest.entities.Todo;

public interface TodoRepo extends JpaRepository<Todo, Long> {

    public List<Todo> findAllByCompleted(Boolean completed);
}
