
package com.SpringPracticewithMongoDB.springbootpractice.Controllers;

import com.SpringPracticewithMongoDB.springbootpractice.Dependancyinj.AccountDI;
import com.SpringPracticewithMongoDB.springbootpractice.Models.Account;
import com.SpringPracticewithMongoDB.springbootpractice.Services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/Account")
public class AccountController {
    @Autowired
    private final AccountService accountService= AccountDI.AccountServiceInjection();

    @GetMapping("/get/{id}")
    public Account select(@PathVariable Long id) {
        return accountService.getAccount(id);
    }
//commit1
    @GetMapping("/getAll")
    public List<Account> selectAll(){
        return accountService.getAllAccount();
    }


    @PostMapping("/insert")
    public Account insert(@RequestBody Account Ac){
        return accountService.addAccount(Ac);
    }
}

