package com.example.TestSpringAPIEcommerce.Repositories;

import com.example.TestSpringAPIEcommerce.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Adicione métodos de consulta personalizados, se necessário
    Optional<Usuario> findByEmailAndSenha(String email, String senha);
}

