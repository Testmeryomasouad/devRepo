package com.SpringPracticewithMongoDB.springbootpractice;

import com.SpringPracticewithMongoDB.springbootpractice.Dependancyinj.AccountDI;
import com.SpringPracticewithMongoDB.springbootpractice.Models.Account;
import com.SpringPracticewithMongoDB.springbootpractice.Services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class SpringbootpracticeApplication {

	@Autowired
	private static  AccountService accountService= AccountDI.AccountServiceInjection();

	public static void main(String[] args) {

		SpringApplication.run(SpringbootpracticeApplication.class, args);

		/*ConfigurableApplicationContext context = SpringApplication.run(SpringbootpracticeApplication.class, args);

		// Utiliser accountService ici
		AccountService accountService = context.getBean(AccountService.class);

		Account ac1 = new Account(1L, 1000.0, "123456789");
		accountService.addAccount(ac1);

		Account ac2 = new Account(2L, 1000.0, "123456789");
		accountService.addAccount(ac2);

		Account ac3 = new Account(3L, 1000.0, "123456789");
		accountService.addAccount(ac3);


		// Récupération d'un compte par son ID


		Optional<Account> retrievedAccount = accountService.getAccount(1L);
		System.out.println("Compte récupéré : " + retrievedAccount);

		Optional<Account> retrievedAccount2 = accountService.getAccount(2L);
		System.out.println("Compte récupéré : " + retrievedAccount2);

		Optional<Account> retrievedAccount3 = accountService.getAccount(3L);
		System.out.println("Compte récupéré : " + retrievedAccount3);
		// Suppression d'un compte par son ID
		Boolean isDeleted = accountService.deleteAccount(accountId);
		if (isDeleted) {
			System.out.println("Compte supprimé avec succès.");
		} else {
			System.out.println("Impossible de supprimer le compte.");
		}*/

	}
	@Bean
	CommandLineRunner start() {
		return args -> {
			// Ajoutez vos opérations d'ajout de données iciWallet
			Account a1= new Account(1L, 1000.00,"A28378");
			Account a2 = new Account(2L, 500.50,"R34234");
			accountService.addAccount(a1);
			accountService.addAccount(a2);
			// Autres opérations si nécessaire
		};     }



}
