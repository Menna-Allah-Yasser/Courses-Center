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
@SequenceGenerator(name = "admin_denerator" , initialValue = 1000)
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY , generator = "admin_denerator")
    private Long adminId;
    private String name;
    @NonNull
    private String password;

    public Admin(String name, @NonNull String password) {
        this.name = name;
        this.password = password;
    }
}
