package org.hibernate.DAO;

import javax.persistence.EntityManager;

public interface GenericRepo <T> {
    T findById(Long id, EntityManager em);
    void insert (T entity, EntityManager em);
    void delete (T entity, EntityManager em);
}
