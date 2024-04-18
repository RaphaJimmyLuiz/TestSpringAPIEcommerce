package com.example.TestSpringAPIEcommerce.Repositories;

import com.example.TestSpringAPIEcommerce.Entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Adicione métodos de consulta personalizados, se necessário
}
