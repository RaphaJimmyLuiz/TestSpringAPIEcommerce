package com.example.TestSpringAPIEcommerce.Services;

import com.example.TestSpringAPIEcommerce.Entities.Usuario;
import com.example.TestSpringAPIEcommerce.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario fazerLogin(String email, String senha) {
        return usuarioRepository.findByEmailAndSenha(email, senha)
                .orElseThrow(() -> new RuntimeException("Credenciais inválidas"));
    }

    // Outros métodos de serviço relacionados ao login
}
