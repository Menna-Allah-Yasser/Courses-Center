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
@SequenceGenerator(name = "teacher_generator" , initialValue = 3000)
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY , generator = "teacher_generator")
    private Long teacherId;
    private String name;
    @Column(unique = true)
    private String email;
    private Gender gender;
    @NonNull
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Course> courses=new ArrayList<>();

    public Teacher(String name, String email, Gender gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Teacher(String name, String email, Gender gender, List<Course> courses) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.courses = courses;
    }
    public void addCourseToTeacher(Course course){
        courses.add(course);
        course.setTeacher(this);
    }
}
