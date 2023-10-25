package org.hibernate.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode
public class StudentCoursesId implements Serializable {
    private Long Course_Id;
    private Long Student_Id;

    public StudentCoursesId(Long course_Id, Long student_Id) {
        Course_Id = course_Id;
        Student_Id = student_Id;
    }
}
