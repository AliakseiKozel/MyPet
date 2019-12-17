package com.example.demo.entity;

import org.modelmapper.ModelMapper;

public class FilmDTOMapper
{
  ModelMapper modelMapper = new ModelMapper();

  public FilmDTO toResponseDTO(Film film){

      return modelMapper.map(film, FilmDTO.class);
  }
}
