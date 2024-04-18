package com.example.TestSpringAPIEcommerce.Services;

import com.example.TestSpringAPIEcommerce.Entities.Produto;
import com.example.TestSpringAPIEcommerce.Repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto criarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    // Outros métodos de serviço para manipulação de produtos
}
