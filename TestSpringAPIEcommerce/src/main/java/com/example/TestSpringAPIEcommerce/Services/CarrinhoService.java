package com.example.TestSpringAPIEcommerce.Services;

import com.example.TestSpringAPIEcommerce.Entities.Carrinho;
import com.example.TestSpringAPIEcommerce.Entities.Produto;
import com.example.TestSpringAPIEcommerce.Entities.Usuario;
import com.example.TestSpringAPIEcommerce.Repositories.CarrinhoRepository;
import com.example.TestSpringAPIEcommerce.Repositories.ProdutoRepository;
import com.example.TestSpringAPIEcommerce.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrinhoService {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public Carrinho adicionarProdutoAoCarrinho(Long usuarioId, Long produtoId) {
        Usuario usuario = usuarioRepository.findById(usuarioId).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        Produto produto = produtoRepository.findById(produtoId).orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        Carrinho carrinho = new Carrinho();
        carrinho.setUsuario(usuario);
        carrinho.setProduto(produto);

        return carrinhoRepository.save(carrinho);
    }

    // Outros métodos de serviço para manipulação do carrinho
}
