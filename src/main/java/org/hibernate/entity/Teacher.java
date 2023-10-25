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
    @Column(name = "teacher_id")
    private Long teacherId;

    private String name;

    @Column(unique = true)
    @NonNull
    private String email;

    private Gender gender;

    @NonNull
    private String password;

    public Teacher(String name, @NonNull String email, Gender gender, @NonNull String password) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.password = password;
    }

}
