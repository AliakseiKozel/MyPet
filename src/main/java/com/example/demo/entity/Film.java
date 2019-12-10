package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "films")
@NoArgsConstructor
@AllArgsConstructor
@Entity
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

