package com.unam.colmenat.controllers;

import com.unam.colmenat.entities.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController<E extends Base,ID extends Serializable> {
    ResponseEntity<?> findAll() throws Exception;
    ResponseEntity<?> findById(@PathVariable ID id) throws Exception;
    ResponseEntity<?> save(@RequestBody E entity) throws Exception;
    ResponseEntity<?> update(@RequestBody E entity) throws Exception;
    ResponseEntity<?> delete(@PathVariable ID id) throws Exception;
}
