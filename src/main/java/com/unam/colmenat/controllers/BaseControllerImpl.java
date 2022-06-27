package com.unam.colmenat.controllers;

import com.unam.colmenat.entities.Base;
import com.unam.colmenat.services.BaseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class BaseControllerImpl<E extends Base, S extends BaseServiceImp<E,Long>> implements BaseController<E, Long> {
    @Autowired
    protected S service;

    @GetMapping("/")
    public ResponseEntity<?> findAll() throws Exception {
        return (ResponseEntity<?>) service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) throws Exception {
        return service.findById(id);
    }

    @PostMapping("/")
    public ResponseEntity<?> save(@RequestBody E entity) throws Exception {
        return service.save(entity);
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody E entity) throws Exception {
        return service.update(entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) throws Exception {
        return service.delete(id);
    }
}
