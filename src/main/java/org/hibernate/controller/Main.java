package org.hibernate.controller;

import org.hibernate.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Main {
   static EntityManagerFactory emf= Persistence.createEntityManagerFactory("edu.mum.cs");
    public static void main(String[] args) {
        EntityManager em=emf.createEntityManager();

        ////////////////////////////////
        Admin admin=new Admin("admin1" , "admin1pass");
        em.persist(admin);

        Admin admin2=new Admin("admin2" , "admin2pass");
        em.persist(admin2);
        ///////////////////////////////
        Teacher teacher=new Teacher("menna" , "menna@gmail.com",Gender.female);
        Course course=new Course("math1" ,teacher );
        teacher.addCourseToTeacher(course);
        em.persist(course);
        ////////////////////////////////
        Student student=new Student("salma" , "yasser" , "salma@gmail.com" , Gender.female);
        student.addCourseToStudent(course);
        em.persist(student);
        ///////////////////////////////

        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();
    }
}