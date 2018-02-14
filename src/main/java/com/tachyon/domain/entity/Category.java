package com.tachyon.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/*
 *   Category Entity
 *   Each category is unique
 */

@Getter
@Setter
@Entity
@Table(name = "Categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "category")
    private Transaction transaction;

    protected Category() {
    }

    public Category(String name) {
        this.name = name;
    }
}
