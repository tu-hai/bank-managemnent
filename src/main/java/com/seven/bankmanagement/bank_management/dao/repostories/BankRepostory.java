package com.seven.bankmanagement.bank_management.dao.repostories;

import com.seven.bankmanagement.bank_management.dao.models.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepostory extends JpaRepository<Bank,Long>{
}
