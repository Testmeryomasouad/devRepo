package com.SpringPracticewithMongoDB.springbootpractice.Dependancyinj;

import com.SpringPracticewithMongoDB.springbootpractice.Repositories.AccountRepo;
import com.SpringPracticewithMongoDB.springbootpractice.Services.AccountService;
import com.SpringPracticewithMongoDB.springbootpractice.Services.AccountServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AccountDI {

    @Bean
    public static AccountService AccountServiceInjection(){
        return new AccountServiceImpl();
    }
    public static AccountRepo AccountRepositoryInjection(){
        return new AccountRepos
    }
}
