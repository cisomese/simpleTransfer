package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long fromAcc;
    private Long toAcc;
    private double amount;
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setFromAcc(Long fromAcc) {
        this.fromAcc = fromAcc;
    }
    public void setToAcc(Long toAcc) {
        this.toAcc = toAcc;
    }
    public Long getId() {
        return id;
    }
    public Long getFromAcc() {
        return fromAcc;
    }
    public Long getToAcc() {
        return toAcc;
    }
    public double getAmount() {
        return amount;
    }
}
