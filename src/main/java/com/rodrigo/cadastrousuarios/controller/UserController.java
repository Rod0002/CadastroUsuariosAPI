package com.rodrigo.cadastrousuarios.controller;

import com.rodrigo.cadastrousuarios.User;
import com.rodrigo.cadastrousuarios.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/usuarios")
    public String listarUsuarios(Model model) {
        Iterable<User> usuarios = userRepository.findAll();
        model.addAttribute("usuarios", usuarios);
        return "lista-usuarios"; // Nome da página JSP para listar usuários
    }

    @GetMapping("/cadastro")
    public String exibirFormularioCadastro(Model model) {
        model.addAttribute("usuario", new User());
        return "formulario-cadastro"; // Nome da página JSP para o formulário de cadastro
    }

    @PostMapping("/cadastro")
    public String cadastrarUsuario(@ModelAttribute("usuario") @Valid User usuario, BindingResult result) {
        if (result.hasErrors()) {
            return "formulario-cadastro";
        }
        userRepository.save(usuario);
        return "redirect:/usuarios";
    }

    // Outros métodos para editar e excluir usuários
}
