package com.springcrud.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data// getter setterleri ozu generasiya edir
@AllArgsConstructor//butun arqumentleri olan constructor yaradir
@NoArgsConstructor//default constructor yaradir
@ToString//tostring generasiya edir
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    @ToString.Exclude// tostringden mueyyen fieldi yigishdirmaq uchundu
    private String password;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "position")
    private Integer position;
}
