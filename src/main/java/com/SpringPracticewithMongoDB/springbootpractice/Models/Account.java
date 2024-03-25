package com.SpringPracticewithMongoDB.springbootpractice.Models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Account_collection")
public class Account {
    @Id
    private Long id;
    private Double amount;
    private String rib;


    public Account(Long id, Double amount, String rib) {
        this.id = id;
        this.amount = amount;
        this.rib = rib;
    }

    public Long getId() {
        return id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }
}
