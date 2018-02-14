package com.tachyon.domain.entity;

import com.tachyon.domain.enums.Operation;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

/*
 * Transaction Entity
 * Each transaction have only one Category
 */


@Getter
@Setter
@ToString
@Entity
@Table(name = "Transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date date;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    private Operation operation;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private BigInteger sum;
    private String comments;

    protected Transaction() {
    }
}
