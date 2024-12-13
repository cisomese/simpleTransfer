package com.example.demo.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BankService;

@RestController
@RequestMapping("api/bank")
public class BankController {
    
    private final BankService bankService;

    
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @PostMapping("/transaction")
    public String transfer(@RequestParam("fromAcc") Long fromAcc,
                           @RequestParam("toAcc") Long toAcc,
                           @RequestParam("amount") double amount) {
        // Process POST request
        bankService.transfer(fromAcc, toAcc, amount);
        
        return "Transaction successful";
    }
}