package com.example.demo.entity;

import lombok.Data;

@Data
public class Comment
{
    private Integer id;
    private String text;
    private Integer mark;

    public Comment( String text)
    {
        this.text = text;

    }
}