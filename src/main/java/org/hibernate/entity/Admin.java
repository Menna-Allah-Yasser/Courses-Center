package org.hibernate.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Admin {
    @Id
    @GeneratedValue
    private Long adminId;
    private String name;
    @NonNull
    private String password;

    public Admin(String name, @NonNull String password) {
        this.name = name;
        this.password = password;
    }
}
