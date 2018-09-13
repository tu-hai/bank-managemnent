package com.seven.bankmanagement.bank_management.services;

import com.seven.bankmanagement.bank_management.dto.BankDTO;
import org.springframework.stereotype.Service;


public interface BankService  {
    void addBank(BankDTO bankDTO);
}
