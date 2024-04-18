package com.example.TestSpringAPIEcommerce.Controllers;

import com.example.TestSpringAPIEcommerce.Entities.Usuario;
import com.example.TestSpringAPIEcommerce.Services.LoginService;
import com.example.TestSpringAPIEcommerce.dto.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public Usuario fazerLogin(@RequestBody LoginRequest loginRequest) {
        return loginService.fazerLogin(loginRequest.getEmail(), loginRequest.getSenha());
    }

    // Outras rotas de login, como logout, podem ser implementadas conforme necessário
}
