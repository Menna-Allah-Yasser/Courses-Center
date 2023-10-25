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

        /*/////////////////////////////////
        Student student1=new Student("menna" , "allah" , "menna@menna@",Gender.female);
        Student student2=new Student("salma" , "yasser" , "menna@menna@",Gender.female);
        em.persist(student1);
        em.persist(student2);

        /////////////////////////////////*/


        /*/////////////////////////////////
         Admin admin1=new Admin("eslam" , "123" , "eslam@");
         Admin admin2=new Admin("eslam" , "123456" , "eslam1@");
         em.persist(admin1);
         em.persist(admin2);

         Teacher teacher1=new Teacher("salma" , "salma@" , Gender.female);
         Teacher teacher2=new Teacher("menna" , "menna@" , Gender.female);
         em.persist(teacher1);
         em.persist(teacher2);

         Student student=new Student("mo" , "yasser" , "mo@" , Gender.male);
         em.persist(student);

         Course course = new Course("CO" , teacher1);
         teacher1.addCourseToTeacher(course);
         em.persist(course);

        /////////////////////////////////*/

        /////////////////////////////////
        Student student1=new Student("menna" , "yasser" , "menna@" , Gender.female , "mennapass");
        Student student2=new Student("salma" , "yasser" , "salma@" , Gender.female , "salmapass");
        Teacher teacher=new Teacher("eslam" , "eslam@" , Gender.male ,"eslampass");
        Course course1=new Course("CO",teacher);
        em.persist(student1);
        em.persist(student2);
        em.persist(teacher);
        em.persist(course1);
        StudentCoursesId studentCoursesId=new StudentCoursesId(course1.getCourseId() , student1.getStudentId());
        StudentCourses studentCourses=new StudentCourses(studentCoursesId , 90);
        em.persist(studentCourses);
        ////////////////////////////////




        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();
    }
}