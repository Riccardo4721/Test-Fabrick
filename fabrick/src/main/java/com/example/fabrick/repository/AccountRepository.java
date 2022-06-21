package com.example.fabrick.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.fabrick.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{

}
