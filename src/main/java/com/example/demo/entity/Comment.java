package com.example.demo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "comment")
@Entity
public class Comment extends BaseEntity
{
    @Column(name = "text")
    @Size(max = 1000)
    private String text;

    @Column(name = "mark")
    private Integer mark;

}