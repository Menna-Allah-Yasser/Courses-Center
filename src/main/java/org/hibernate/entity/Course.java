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
@SequenceGenerator(name = "course_generator" , initialValue = 2000)
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY ,generator = "course_generator")
    @Column(name="course_id")
    private Long courseId;

    private String name;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teaher_id")
    private Teacher teacher;


    public Course(String name,  Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

}
