package com.example.demo.repository;

import com.example.demo.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Film} class.
 */
public interface FilmsRepository extends JpaRepository<Film, Integer> {
}
