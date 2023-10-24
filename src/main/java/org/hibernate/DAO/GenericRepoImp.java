package org.hibernate.DAO;

import org.hibernate.entity.Admin;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;

public class GenericRepoImp <T> implements GenericRepo<T>{
    private EntityManager em;
    private Class<T> entityClass;

    public GenericRepoImp() {
    }

    public GenericRepoImp(EntityManager em, Class<T> entityClass) {
        this.em = em;
        this.entityClass = entityClass;
    }

    @Override
    public T findById(Long id, EntityManager em) {
        T entity = em.find(entityClass, id);
        if (entity == null){
            throw new EntityNotFoundException("Can't find entity for ID " + id);
        }
        return entity;
    }

    @Override
    public void insert(T entity, EntityManager em) {
        em.persist(entity);
    }

    @Override
    public void delete(T entity, EntityManager em) {
        em.remove(entity);
    }
}
