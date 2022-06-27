package com.unam.colmenat.services;

import com.unam.colmenat.entities.Base;
import com.unam.colmenat.repositories.BaseRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Transactional
public abstract class BaseServiceImp<E extends Base,ID extends Serializable> implements BaseService<E,ID> {
    protected BaseRepository<E,ID> repository;

    public BaseServiceImp(BaseRepository<E, ID> repository) {
        this.repository = repository;
    }
    @Override
    public List<E> findAll() throws Exception {
        try {
            return repository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public E findById(ID id) throws Exception {
        try {
            Optional<E> person = repository.findById(id);
            return person.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public E update(E entity) throws Exception {
        try{
            if(repository.existsById((ID) entity.getId())) {
                return repository.save(entity);
            } else {
                throw new Exception("Person not found");
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public E save(E entity) throws Exception {
        try{
            return repository.save(entity);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public boolean delete(ID id) throws Exception {
        try{
            if(repository.existsById(id)) {
                repository.deleteById(id);
                return true;
            } else {
                throw new Exception("Person not found");
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
