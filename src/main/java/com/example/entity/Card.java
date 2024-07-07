package com.example.entity;

import com.example.enums.CardType;
import jakarta.persistence.*;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cardNumber;

    @Temporal(TemporalType.DATE)
    private Date expirationDate;

    @Enumerated(EnumType.STRING)
    private CardType cardType;

    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
