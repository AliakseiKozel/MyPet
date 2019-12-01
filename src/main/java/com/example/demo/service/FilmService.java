package com.example.demo.service;

import com.example.demo.entity.Film;
import com.example.demo.repository.FilmsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class FilmService implements BaseCrudService{

    @Autowired
    FilmsRepository filmsRepository;

    @Override
    public Optional<Film> getById(Integer id) {
        return filmsRepository.findById(id);
    }

    @Override
    public void save(Entity film) {
        filmsRepository.save(film);
    }

    @Override
    public void delete(Integer id) {
        filmsRepository.deleteById(id);

    }

    @Override
    public List<Object> getAll() {
        return null;
    }
}
