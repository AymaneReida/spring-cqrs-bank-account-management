package com.example.springcqrsbankaccountmanagement.queries.repository;

import com.example.springcqrsbankaccountmanagement.queries.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
