package com.huseyink.spring.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table( name = "users" )
@Data
@EqualsAndHashCode
@ToString
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    @Column( name = "firstName" )
    private String firstName;
    @Column( name = "lastName" )
    private String lastName;
    @Column( name = "email" )
    private String email;
    @Column( name = "password" )
    private String password;
}
