package com.unam.colmenat.controllers;

import com.unam.colmenat.entities.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.List;

public interface BaseController<E extends Base,ID extends Serializable> {
    List<E> findAll() throws Exception;
    E findById(@PathVariable ID id) throws Exception;
    E save(@RequestBody E entity) throws Exception;
    E update(@RequestBody E entity) throws Exception;
    boolean delete(@PathVariable ID id) throws Exception;
}
