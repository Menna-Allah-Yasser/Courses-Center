package org.hibernate.DAO;

import org.hibernate.entity.Admin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;

public class AdminDB {

    public void insertAdmin(Admin admin , EntityManager em){
        em.persist(admin);
    }

    public void deleteAdmin(Admin admin , EntityManager em){
        em.remove(admin);
    }

    public Admin findAdmin(Long id , EntityManager em){

            Admin admin = em.find(Admin.class, id);
            if (admin == null){
                throw new EntityNotFoundException("Can't find entity for ID " + id);
            }
           return admin;

    }


}
