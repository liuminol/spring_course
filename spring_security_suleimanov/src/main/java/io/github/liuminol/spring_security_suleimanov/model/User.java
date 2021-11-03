package io.github.liuminol.spring_security_suleimanov.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="role")
    @Enumerated(value = EnumType.STRING)
    private Role role;

    @Column(name="status")
    @Enumerated(value = EnumType.STRING)
    private Status status;
}
