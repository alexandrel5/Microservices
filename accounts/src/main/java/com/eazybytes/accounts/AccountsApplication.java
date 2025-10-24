package com.eazybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Account microservice REST API Documentation",
                description = "EazyBank Account microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Alexandre Candido",
                        email = "alexandrecandidol5@gmail.com",
                        url = "https://google.com.br"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://google.com.br"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "EazyBank Account microservice REST API Documentation",
                url = "https://www.google.com.br/search?swagger-ui.html"
        )
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
