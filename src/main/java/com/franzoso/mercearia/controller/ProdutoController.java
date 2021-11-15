package com.franzoso.mercearia.controller;

import com.franzoso.mercearia.domain.Produto;
import com.franzoso.mercearia.repository.ProdutoRepository;
import com.franzoso.mercearia.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listar() {
        List<Produto> produtos = produtoService.listar();
        return produtos;

    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        Produto produtoSalvo = produtoService.salvar(produto);
        return produtoSalvo;
    }

    @PutMapping
    public Produto editar(@RequestBody Produto produto) {
        Produto produtoEditado = produtoService.editar(produto);
        return produtoEditado;


    }

    @GetMapping("/ {id}")
    public Produto buscar(@PathVariable Long id) {
        Produto produto = produtoService.buscar(id);
        return produto;

    }

    @DeleteMapping("/{id}")
    public Produto excluir(@PathVariable Long id) {
        Produto produto = produtoService.excluir(id);
        return produto;

    }


}
