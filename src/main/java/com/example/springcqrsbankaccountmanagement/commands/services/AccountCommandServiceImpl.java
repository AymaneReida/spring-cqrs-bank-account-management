package com.example.springcqrsbankaccountmanagement.commands.services;

import com.example.springcqrsbankaccountmanagement.commands.commands.CreateAccountCommand;
import com.example.springcqrsbankaccountmanagement.commands.commands.CreditAccountCommand;
import com.example.springcqrsbankaccountmanagement.commands.commands.DebitAccountCommand;
import com.example.springcqrsbankaccountmanagement.commands.dto.CreateAccountRequestDTO;
import com.example.springcqrsbankaccountmanagement.commands.dto.CreditAccountRequestDTO;
import com.example.springcqrsbankaccountmanagement.commands.dto.DebitAccountRequestDTO;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Service
public class AccountCommandServiceImpl implements AccountCommandService {
  private final CommandGateway commandGateway;

  public AccountCommandServiceImpl(CommandGateway commandGateway) {
    this.commandGateway = commandGateway;
  }

  @Override
  public CompletableFuture<String> createAccount(CreateAccountRequestDTO accountRequestDTO) {
    return commandGateway.send(new CreateAccountCommand(UUID.randomUUID().toString(), accountRequestDTO.getBalance(), accountRequestDTO.getCurrency()));
  }

  @Override
  public CompletableFuture<String> debitAccount(DebitAccountRequestDTO debitAccountRequestDTO) {
    return commandGateway.send(new DebitAccountCommand(
      debitAccountRequestDTO.getAccountId(),
      debitAccountRequestDTO.getAmount(),
      debitAccountRequestDTO.getCurrency()
    ));
  }

  @Override
  public CompletableFuture<String> creditAccount(CreditAccountRequestDTO creditAccountRequestDTO) {
    return commandGateway.send(new CreditAccountCommand(
      creditAccountRequestDTO.getAccountId(),
      creditAccountRequestDTO.getAmount(),
      creditAccountRequestDTO.getCurrency()
    ));
  }
}
