package com.eazybytes.accounts.dto;

import lombok.Data;

@Data
public class AccountsDto {
    private Long customerId;

    private String accountNumber;

    private String accountType;

    private String branchAddress;
}
