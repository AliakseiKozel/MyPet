package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class Film
{
    @Positive
    private Integer id;

    @NotBlank
    @Size( min = 2, max = 40)
    private String name;

    @Size( min = 2, max = 1000)
    private String description;
    private double mark;

}

