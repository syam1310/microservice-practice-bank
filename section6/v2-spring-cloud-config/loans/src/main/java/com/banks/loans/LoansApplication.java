package com.banks.loans;

import com.banks.loans.dto.LoansContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.bank.loans.controller") })
@EnableJpaRepositories("com.bank.loans.repository")
@EntityScan("com.bank.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
@OpenAPIDefinition(
        info = @Info(
                title = "Loans microservice REST API Documentation",
                description = "Bank Loans microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Shyam",
                        email = "syam@gmail.com"
                ),
                license = @License(
                        name = "Apache 2.0"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Bank Loans microservice REST API Documentation"
        )
)
public class LoansApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoansApplication.class, args);
    }
}
