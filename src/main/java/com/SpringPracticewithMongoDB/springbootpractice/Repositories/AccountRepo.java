package com.SpringPracticewithMongoDB.springbootpractice.Repositories;

import com.SpringPracticewithMongoDB.springbootpractice.Models.Account;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepo extends MongoRepository<Account,Long> {
//ExerciceConflit
    public Account getAccountByrib(String rib);
}
