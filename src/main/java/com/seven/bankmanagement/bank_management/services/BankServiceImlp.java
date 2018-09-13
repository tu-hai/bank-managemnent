package com.seven.bankmanagement.bank_management.services;

import com.seven.bankmanagement.bank_management.dao.models.Bank;
import com.seven.bankmanagement.bank_management.dao.repostories.BankRepostory;
import com.seven.bankmanagement.bank_management.dto.BankDTO;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImlp implements BankService{

    private BankRepostory bankRepostory;

    public BankServiceImlp(BankRepostory bankRepostory) {
        this.bankRepostory = bankRepostory;
    }

    @Override
    public void addBank(BankDTO bankDTO) {
        Bank bank = new Bank();
        bank.setBankname(bankDTO.getBankname());
        bank.setBankacount(bankDTO.getBankaccount());
        bank.setUsername(bankDTO.getUsername());
        bankRepostory.save(bank);
    }
}
