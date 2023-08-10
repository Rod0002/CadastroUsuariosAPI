package com.rodrigo.cadastrousuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rodrigo.cadastrousuarios.repository.UserRepository;

@SpringBootApplication
public class CadastroUsuariosApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CadastroUsuariosApplication.class, args);

        // Adiciona um usuário ao banco de dados
        UserRepository userRepository = context.getBean(UserRepository.class);
        User user = new User();
        user.setUsername("usuario1");
        user.setPassword("senha1");
        userRepository.save(user);
    }
}
