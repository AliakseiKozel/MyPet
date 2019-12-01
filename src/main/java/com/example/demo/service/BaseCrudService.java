package com.example.demo.service;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public interface BaseCrudService (Entity entity){

    Object getById(Integer id);

    void save( entity);

    void delete(Integer id);

    List<Object> getAll();
}
