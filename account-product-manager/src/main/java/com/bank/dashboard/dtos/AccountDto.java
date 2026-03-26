package com.bank.dashboard.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.bank.dashboard.models.Account;
import com.bank.dashboard.models.enums.AccountStatus;
import com.bank.dashboard.models.enums.AccountType;

import lombok.Builder;

// DTO simply removes "deleted" field
@Builder
public record AccountDto(
        int id,
        String name,
        AccountType type,
        AccountStatus status,
        LocalDate openDate,
        BigDecimal balance,
        String email,
        String phone,
        String street,
        String city,
        String state,
        String zipCode,
        String country) {

    /**
     * This seems horrendous to try to read & maintain:
     * 
     * public AccountDto accountToDto(Account account) {
     * return new AccountDto(
     * account.getId(),
     * account.getName(),
     * account.getType(),
     * account.getStatus(),
     * account.getOpenDate(),
     * account.getBalance(),
     * account.getEmail(),
     * account.getPhone(),
     * account.getStreet(),
     * account.getCity(),
     * account.getState(),
     * account.getZipCode(),
     * account.getCountry()
     * );
     * }
     */

    // Using lombok builder to construct the objects for better code readability
    public AccountDto accountToDto(Account account) {
        return AccountDto.builder()
                .id(account.getId())
                .name(account.getName())
                .type(account.getType())
                .status(account.getStatus())
                .openDate(account.getOpenDate())
                .balance(account.getBalance())
                .email(account.getEmail())
                .phone(account.getPhone())
                .street(account.getStreet())
                .city(account.getCity())
                .state(account.getState())
                .zipCode(account.getZipCode())
                .country(account.getCountry())
                .build();
    }

    public Account dtoToAccount(AccountDto accountDto) {
        return Account.builder()
                .id(accountDto.id)
                .name(accountDto.name)
                .type(accountDto.type)
                .status(accountDto.status)
                .openDate(accountDto.openDate)
                .balance(accountDto.balance)
                .email(accountDto.email)
                .phone(accountDto.phone)
                .street(accountDto.street)
                .city(accountDto.city)
                .state(accountDto.state)
                .zipCode(accountDto.zipCode)
                .country(accountDto.country)
                .deleted(false) // Default to false
                .build();
    }
}
