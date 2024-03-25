
package com.SpringPracticewithMongoDB.springbootpractice.Services;

import com.SpringPracticewithMongoDB.springbootpractice.Models.Account;
import com.SpringPracticewithMongoDB.springbootpractice.Repositories.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {


    @Autowired
    private AccountRepo accountRepo;


    @Override
    public Account getAccount(Long id) {
        return accountRepo.findById(id).get();
    }

    @Override
    public List<Account> getAllAccount() {
        return accountRepo.findAll();
    }

    @Override
    public Account addAccount(Account Ac) {
        return accountRepo.save(Ac) ;
    }

    @Override
    public Boolean deleteAccount(Long id) {
        if(accountRepo.findById(id)!=null){
            accountRepo.deleteById(id);
            return true;

        }
        return false;
    }

}

