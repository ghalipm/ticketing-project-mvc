package com.cydeo.service;

import java.util.List;

public interface CrudService<T, ID> {
    T save(T t);
    List<T> findByID(ID id);
    List<T> findAll();
    void delete(T t);
    void deleteById(ID id);
}
