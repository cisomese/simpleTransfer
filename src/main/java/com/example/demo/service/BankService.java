package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Account;
import com.example.demo.model.Transaction;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.TransactionRepository;

@Service
public class BankService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private TransactionRepository transactionRepository;
    public void transfer(Long fromAccountId,Long toAccountId,double amount){
        Account fromAccount=accountRepository.findById(fromAccountId).orElseThrow(() -> new RuntimeException("Account not found"));
        Account toAccount=accountRepository.findById(toAccountId).orElseThrow(() -> new RuntimeException("Account not found"));
        if (fromAccount.getBalance()>=amount) {
            fromAccount.setBalance(fromAccount.getBalance()-amount);
            toAccount.setBalance(toAccount.getBalance()+amount);
            accountRepository.save(fromAccount);
            accountRepository.save(toAccount);
            Transaction transaction= new Transaction();
            transaction.setFromAcc(fromAccountId);
            transaction.setToAcc(toAccountId);
            transaction.setAmount(amount);
            transactionRepository.save(transaction);
        }
        else {
            System.out.println("your balance is insufficient");
        }
        
    }
    
}
