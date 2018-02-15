package com.tachyon.domain.entity;

import com.tachyon.domain.enums.AccountCategory;
import com.tachyon.domain.enums.Currency;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/*
 *  Accounts Entity
 *
 */


@Getter
@Setter
@ToString
@Entity
@Table(name = "Accounts")
public class Account implements Serializable{

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private AccountCategory accountCategory;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    private String name;
    private BigInteger balance;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL) //To self: find how to use relations in spring
    private List<Transaction> transactions = new ArrayList<>();

    protected Account() {
    }

}
