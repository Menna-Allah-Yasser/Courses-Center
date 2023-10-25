package org.hibernate.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SequenceGenerator(name = "student_generator" , initialValue = 4000)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY , generator = "student_generator")
    @Column(name = "student_id")
    private Long studentId;

    private String fname;
    private  String lname;

    @Column(unique = true)
    @NonNull
    private String email;

    private Gender gender;
    @NonNull
    private String password;


    public Student(String fname, String lname, @NonNull String email, Gender gender, @NonNull String password) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.gender = gender;
        this.password = password;
    }


    /*public void addCourseToStudent(Course course){
        courses.add(course);
       // course.setStudents(this);
        List<Student>studentList=new ArrayList<>();
        studentList.add(this);
        course.setStudents(studentList);

    }*/
}
