package com.example.demo.service;

import javax.persistence.Entity;
import java.util.List;

public interface BaseCrudService {

    Object getById(Integer id);

    void create( Entity entity);

    void delete(Integer id);

    List<Object> getAll();
}
