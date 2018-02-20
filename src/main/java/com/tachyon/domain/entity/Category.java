package com.tachyon.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/*
 *   Category Entity
 *   Each category is unique
 */

@Getter
@Setter
@Entity
@Table(name = "Categories")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String name;

    @OneToOne(mappedBy = "category")
    private Transaction transaction;

    protected Category() {
    }

    public Category(String name) {
        this.name = name;
    }
}
