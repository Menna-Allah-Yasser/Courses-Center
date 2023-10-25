package org.hibernate.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Setter
@Getter
@NoArgsConstructor
@SequenceGenerator(name = "admin_generator" , initialValue = 1000)
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY , generator = "admin_generator")
    private Long adminId;

    private String name;

    @NonNull
    private String password;
    @NonNull
    @Column(unique = true)
    private String email;

    public Admin(String name, @NonNull String password, @NonNull String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }
}
