package com.example.TestSpringAPIEcommerce.Controllers;

import com.example.TestSpringAPIEcommerce.Entities.Carrinho;
import com.example.TestSpringAPIEcommerce.Services.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    @Autowired
    private CarrinhoService carrinhoService;

    @PostMapping("/{usuarioId}/adicionar-produto/{produtoId}")
    public Carrinho adicionarProdutoAoCarrinho(@PathVariable Long usuarioId, @PathVariable Long produtoId) {
        return carrinhoService.adicionarProdutoAoCarrinho(usuarioId, produtoId);
    }

    // Implemente outras rotas para manipular o carrinho conforme necessário
}