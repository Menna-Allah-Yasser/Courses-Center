package org.hibernate.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SequenceGenerator(name = "student_denerator" , initialValue = 4000)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY , generator = "student_denerator")
    private Long studentId;

    private String fname;
    private  String lname;
    private String email;
    private Gender gender;
    @ManyToMany(mappedBy = "students" , cascade = CascadeType.ALL)
    private List<Course> courses=new ArrayList<>();

    public Student(String fname, String lname, String email, Gender gender) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.gender = gender;
    }
    public void addCourseToStudent(Course course){
        courses.add(course);
       // course.setStudents(this);
        List<Student>studentList=new ArrayList<>();
        studentList.add(this);
        course.setStudents(studentList);

    }
}
