package org.hibernate.Service;

import org.hibernate.DAO.AdminDB;
import org.hibernate.DAO.GenericRepoImp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeneralServices <T> implements BasicServices<T>{
     private EntityManager em;
    private GenericRepoImp<T> genericRepoImp;
    public GeneralServices() {
    }

    public GeneralServices(EntityManager em, GenericRepoImp<T> genericRepoImp) {
        this.em = em;
        this.genericRepoImp = genericRepoImp;
    }

    @Override
    public T findById(Long id) {
       return genericRepoImp.findById(id,em);
    }

    @Override
    public void insert(T entity) {
        genericRepoImp.insert(entity,em);
    }

    @Override
    public void delete(T entity) {
        genericRepoImp.delete(entity , em);
    }
}
