package com.example.springcqrsbankaccountmanagement.commands.services;

import com.example.springcqrsbankaccountmanagement.commands.dto.CreateAccountRequestDTO;
import com.example.springcqrsbankaccountmanagement.commands.dto.CreditAccountRequestDTO;
import com.example.springcqrsbankaccountmanagement.commands.dto.DebitAccountRequestDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {
  CompletableFuture<String> createAccount(CreateAccountRequestDTO accountRequestDTO);

  CompletableFuture<String> debitAccount(DebitAccountRequestDTO debitAccountRequestDTO);

  CompletableFuture<String> creditAccount(CreditAccountRequestDTO creditAccountRequestDTO);
}
