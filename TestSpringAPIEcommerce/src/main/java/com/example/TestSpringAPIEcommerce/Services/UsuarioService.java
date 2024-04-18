package com.example.TestSpringAPIEcommerce.Services;

import com.example.TestSpringAPIEcommerce.Entities.Usuario;
import com.example.TestSpringAPIEcommerce.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Outros métodos de serviço para manipulação de usuários
}
