package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Table(name = "portfolio_records")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PortfolioRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(lombok.AccessLevel.NONE)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "security_id", nullable = false)
    private Security security;

    @Column(name = "purchase_date",nullable = false)
    private LocalDateTime purchaseDate;

    @Column(name = "purchase_price", nullable = false)
    private LocalDateTime purchasePrice;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "created_date", nullable = false)
    private LocalDateTime createdDate;


}
