package org.example;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;


@Development
public class MinhaConfiguration {

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("Rodando a configuração de desenvolvimento");
        };
    }
}

//Dessa parte em diante, todas as novas implementações vão para a nova branch (develop)
