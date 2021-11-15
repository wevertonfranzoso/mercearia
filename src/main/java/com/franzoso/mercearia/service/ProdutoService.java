package com.franzoso.mercearia.service;

import com.franzoso.mercearia.domain.Produto;
import com.franzoso.mercearia.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;


    public List<Produto> listar() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos;

    }


    public Produto salvar( Produto produto) {
        Produto produtoSalvo = produtoRepository.save(produto);
        return produtoSalvo;
    }


    public Produto editar( Produto produto) {
        Produto produtoEditado = produtoRepository.save(produto);
        return produtoEditado;


    }


    public Produto buscar( Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        Produto retorno = produto.get();
        return retorno;

    }


    public Produto excluir(Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        produtoRepository.delete(produto.get());
        Produto resultado = produto.get();
        return resultado;

    }

}
