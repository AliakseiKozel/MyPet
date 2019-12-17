package com.example.demo.controllers;

import com.example.demo.entity.Film;
import com.example.demo.entity.FilmDTO;
import com.example.demo.repository.FilmsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping( "/films" )
public class FilmController
{
    @Autowired
    private FilmsRepository filmsRepository;

    ModelMapper modelMapper = new ModelMapper();

    @PostMapping( "/add" )
    public ResponseEntity addFilm( @Valid @RequestBody Film film )
    {
        return new ResponseEntity<>(film, HttpStatus.OK );
    }

    @GetMapping( "{id}/{name}" )
    public ResponseEntity<FilmDTO> getFilm( @PathVariable Integer id, @PathVariable String name )
    {

//        if( id == null )
//        {
//            return new ResponseEntity<Film>( HttpStatus.BAD_REQUEST );
//        }

        Film film = new Film();
        film.setId( id );
        film.setName( name );
        film.setDescription( "desc" );
        filmsRepository.save( film );

        return new ResponseEntity<>( modelMapper.map( film, FilmDTO.class ), HttpStatus.OK );

    }

    @GetMapping("/save")
    public ResponseEntity saveFilm( @RequestParam(value = "param1", required = true) String param1){


        Film film = new Film();
        film.setId( 2 );
        film.setName( param1 );

        return new ResponseEntity<>( film, HttpStatus.OK );

    }
    @GetMapping("/{id}")
    public ResponseEntity<FilmDTO> getFilmById(@PathVariable Integer id)
    {
        return new ResponseEntity<>(modelMapper.map( getFilmById( id ), FilmDTO.class ), HttpStatus.OK );

    }

    }
