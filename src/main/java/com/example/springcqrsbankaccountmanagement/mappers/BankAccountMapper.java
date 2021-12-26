package com.example.springcqrsbankaccountmanagement.mappers;

import com.example.springcqrsbankaccountmanagement.queries.dto.AccountOperationResponseDTO;
import com.example.springcqrsbankaccountmanagement.queries.dto.BankAccountResponseDTO;
import com.example.springcqrsbankaccountmanagement.queries.entities.AccountOperation;
import com.example.springcqrsbankaccountmanagement.queries.entities.BankAccount;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankAccountMapper {
  BankAccountResponseDTO bankAccountToBankAccountDTO(BankAccount bankAccount);

  AccountOperationResponseDTO accountOperationToAccountOperationDTO(AccountOperation accountOperation);
}
