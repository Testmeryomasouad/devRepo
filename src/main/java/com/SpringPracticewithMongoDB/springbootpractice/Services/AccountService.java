package com.SpringPracticewithMongoDB.springbootpractice.Services;

import com.SpringPracticewithMongoDB.springbootpractice.Models.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    public Account getAccount(Long id);
    public List<Account> getAllAccount();

    public Account addAccount(Account Ac);
    public Boolean deleteAccount(Long id);
}
