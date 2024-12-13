package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accNum;
    private double balance;
    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getAccNum() {
        return accNum;
    }
    public double getBalance() {
        return balance;
    }
    public Long getId() {
        return id;
    }
    public Account get() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
    
}
