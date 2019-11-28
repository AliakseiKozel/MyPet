package com.example.demo.controllers;

import com.example.demo.entity.Film;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping( "/films" )
public class FilmController
{
    @PostMapping( "/add" )
    public ResponseEntity addFilm( @Valid @RequestBody Film film )
    {
        Film newFilm = film;
        return new ResponseEntity<>(newFilm, HttpStatus.OK );
    }

    @GetMapping( "{id}/{name}" )
    public ResponseEntity<Film> getFilm( @PathVariable Integer id, @PathVariable String name )
    {

        if( id == null )
        {
            return new ResponseEntity<Film>( HttpStatus.BAD_REQUEST );
        }

        Film film = new Film();
        film.setId( id );
        film.setName( name );
        return new ResponseEntity<>( film, HttpStatus.OK );

    }

    @GetMapping("/save")
    public ResponseEntity saveFilm( @RequestParam(value = "param1", required = true) String param1){


        Film film = new Film();
        film.setId( 2 );
        film.setName( param1 );

        return new ResponseEntity<>( film, HttpStatus.OK );

    }

    }
