package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Data
@Table(name = "commit")
public class Comment extends BaseEntity
{
    @Column(name = "text")
    @Size(max = 1000)
    private String text;

    @Column(name = "mark")
    private Integer mark;

}