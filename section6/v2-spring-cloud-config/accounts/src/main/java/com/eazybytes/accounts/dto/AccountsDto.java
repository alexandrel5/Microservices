package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {
    private Long customerId;

    @NotEmpty(message = "AccountNumber can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private Long accountNumber;

    @NotEmpty(message = "Account Type can not be a null or empty")
    private String accountType;

    @NotEmpty(message = "branchAddress Type can not be a null or empty")
    private String branchAddress;
}
