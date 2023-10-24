package org.hibernate.controller;

import org.hibernate.DAO.AdminDB;
import org.hibernate.DAO.GenericRepoImp;
import org.hibernate.Service.GeneralServices;
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

       /* ////////////////////////////////
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
        ///////////////////////////////*/

        /*/////////////////////////////////
        AdminDB adminDB=new AdminDB();
        Admin admin=new Admin("admin1" , "admin1pass");
        Admin admin2=new Admin("admin2" , "admin2pass");
        adminDB.insertAdmin(admin , em);
        adminDB.insertAdmin(admin2 , em);
        Admin admin3= adminDB.findAdmin(1000L,em);
        System.out.println(admin3.getName() +" "+ admin3.getPassword());
        Admin admin4= adminDB.findAdmin(1009L,em);
        System.out.println(admin4.getName());
       // adminDB.deleteAdmin(admin , em);
        ////////////////////////////////*/

        ////////////////////////////////
        Admin admin=new Admin("admin1" , "admin1pass");
        Admin admin2=new Admin("admin2" , "admin2pass");
        GenericRepoImp <Admin> genericRepoImp=new GenericRepoImp<>();
        GeneralServices<Admin>generalServices=new GeneralServices<>(em ,genericRepoImp );
        generalServices.insert(admin);
        generalServices.insert(admin2);
        /*Admin admin3=generalServices.findById(1001L);
        System.out.println(admin3.getName()+"  "+admin3.getPassword());*/
        generalServices.delete(admin);
        ///////////////////////////////

        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();
    }
}