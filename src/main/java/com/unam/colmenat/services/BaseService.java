package com.unam.colmenat.services;

import com.unam.colmenat.entities.Base;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base,ID extends Serializable> {
    List<E> findAll() throws Exception;
    E findById(ID id) throws Exception;
    E update(E entity) throws Exception;
    E save(E entity) throws Exception;
    boolean delete(ID id) throws Exception;
}
