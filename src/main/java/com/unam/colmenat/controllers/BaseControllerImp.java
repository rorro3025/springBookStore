package com.unam.colmenat.controllers;

import com.unam.colmenat.entities.Base;
import com.unam.colmenat.services.BaseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class BaseControllerImp<E extends Base,S extends BaseServiceImp<E,Long>> implements BaseController<E,Long> {

   @Autowired
   protected S service;

    @Override
    public List<E> findAll() throws Exception {
        return service.findAll();
    }

    @Override
    public E findById(Long aLong) throws Exception {
        return service.findById(aLong);
    }

    @Override
    public E save(E entity) throws Exception {
        return service.save(entity);
    }

    @Override
    public E update(E entity) throws Exception {
        return service.update(entity);
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return service.delete(aLong);
    }
}
