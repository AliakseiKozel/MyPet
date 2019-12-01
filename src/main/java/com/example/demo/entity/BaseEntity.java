package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Entity
@Data
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
