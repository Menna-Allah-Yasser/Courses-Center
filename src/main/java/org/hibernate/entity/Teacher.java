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
@SequenceGenerator(name = "teacher_denerator" , initialValue = 3000)
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY , generator = "teacher_denerator")
    private Long teacherId;
    private String name;
    private String email;
    private Gender gender;
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
