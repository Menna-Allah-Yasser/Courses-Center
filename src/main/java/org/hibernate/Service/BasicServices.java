package org.hibernate.Service;

import javax.persistence.EntityManager;

public interface BasicServices<T> {
     T findById(Long id );
     void insert (T entity);
     void delete (T entity );
}
