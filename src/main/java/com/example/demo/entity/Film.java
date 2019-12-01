package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Table(name = "films")
@NoArgsConstructor
public class Film extends BaseEntity
{
    @Column(name = "name")
    @NotBlank
    @Size( min = 2, max = 40)
    private String name;

    @Column(name = "description")
    @Size( min = 2, max = 1000)
    private String description;

    @Column(name = "mark")
    private double mark;

}

