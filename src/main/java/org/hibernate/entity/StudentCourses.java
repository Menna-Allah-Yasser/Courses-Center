package org.hibernate.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="Student_courses")
public class StudentCourses {
    @EmbeddedId
    private StudentCoursesId id;
    private float degree;

    public StudentCourses(StudentCoursesId id, float degree) {
        this.id = id;
        this.degree = degree;
    }

}
