package com.example.entity;

import jakarta.persistence.Id;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date transactionDate;
    private Double amount;
    private String transactionType;
    private String description;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    // Getters and Setters
}
