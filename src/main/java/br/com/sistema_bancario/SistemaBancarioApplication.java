package br.com.sistema_bancario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.com.sistema_bancario.repository")
public class SistemaBancarioApplication {
    public static void main(String[] args) {
        SpringApplication.run(SistemaBancarioApplication.class, args);
    }

}
