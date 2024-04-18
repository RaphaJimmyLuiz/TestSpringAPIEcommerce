package com.example.TestSpringAPIEcommerce.Repositories;

import com.example.TestSpringAPIEcommerce.Entities.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {
    // Adicione métodos de consulta personalizados, se necessário
}
