package com.seven.bankmanagement.bank_management.controllers;

import com.seven.bankmanagement.bank_management.dto.BankDTO;
import com.seven.bankmanagement.bank_management.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankController {
    @Autowired
    private BankService bankService;

    @GetMapping(value = "/add")
    public ModelAndView add(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("add");
        mav.addObject("bank", new BankDTO());
        return mav;
    }
    @PostMapping(value = "/add-process")
    public ModelAndView addProcess(BankDTO bankDTO){
        System.out.println(bankDTO);
        ModelAndView mav = new ModelAndView();
        bankService.addBank(bankDTO);
        mav.setViewName("redirect:/add");
        return mav;
    }
}
