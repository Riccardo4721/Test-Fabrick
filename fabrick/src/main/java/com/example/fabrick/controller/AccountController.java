package com.example.fabrick.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.fabrick.model.AccountBalance;

@RestController
public class AccountController {

  //   @Autowired
   // AccountRepository accountRepository;

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

     @GetMapping("/saldo")
    public AccountBalance getAccountBalance( ){

         Long accountId = 14537780L;
         String url = "https://sandbox.platfr.io/api/gbs/banking/v4.0/accounts/" + accountId +"/balance"+"?api_key=" + apiKey;
         RestTemplate restTemplate = new RestTemplate();

         AccountBalance accountBalance = restTemplate.getForObject(url,AccountBalance.class);


         return accountBalance;
        //return accountRepository.getById(accountId);
     }
}