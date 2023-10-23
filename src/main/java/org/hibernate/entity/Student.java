package org.hibernate.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue
    private Long studentId;

    private String fname;
    private  String lname;
    private String email;
    private String gender;
    @ManyToMany(mappedBy = "students" , cascade = CascadeType.ALL)
    private List<Course> courses;

    public Student(String fname, String lname, String email, String gender) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.gender = gender;
    }
}
