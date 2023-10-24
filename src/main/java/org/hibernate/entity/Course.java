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
@SequenceGenerator(name = "course_denerator" , initialValue = 2000)
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY ,generator = "course_denerator")
    private Long courseId;

    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teaher_id")
    private Teacher teacher;
    @ManyToMany()
    private List<Student> students = new ArrayList<>();

    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }


}
