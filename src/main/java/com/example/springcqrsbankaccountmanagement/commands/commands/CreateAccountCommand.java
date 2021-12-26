package com.example.springcqrsbankaccountmanagement.commands.commands;

import lombok.Getter;

import java.math.BigDecimal;

public class CreateAccountCommand extends BaseCommand<String> {
  @Getter
  private final BigDecimal balance;
  @Getter
  private final String currency;

  public CreateAccountCommand(String id, BigDecimal balance, String currency) {
    super(id);
    this.balance = balance;
    this.currency = currency;
  }
}
