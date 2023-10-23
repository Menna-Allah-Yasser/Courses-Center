package org.hibernate.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue
    private Long teacherId;
    private String name;
    private String email;
    private String gender;
    @OneToMany
    private List<Course> courses;

    public Teacher(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Teacher(String name, String email, String gender, List<Course> courses) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.courses = courses;
    }
}
