package com.franzoso.mercearia.controller;

import com.franzoso.mercearia.domain.Categoria;
import com.franzoso.mercearia.exception.RecursoNaoEncontradoException;
import com.franzoso.mercearia.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;


@RestController
@RequestMapping("categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> listar(){
        List<Categoria> categorias = categoriaService.listar();
        return categorias;
    }

    @GetMapping("/{codigo}")
    public Categoria buscarCodigo(@PathVariable Integer codigo) {
     try {
         Categoria categoria = categoriaService.buscarCodigo(codigo);
         return categoria;
     } catch (RecursoNaoEncontradoException excecao) {
         throw  new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria não encontrada ", excecao);
     }


    }

    @PostMapping
    public Categoria inserir(@RequestBody Categoria categoria){
        Categoria categoriaSalvar = categoriaService.inserir(categoria);
        return categoriaSalvar;
    }

    @DeleteMapping("/{codigo}")
    public Categoria excluir(@PathVariable Integer codigo) {
        Categoria categoria = categoriaService.excluir(codigo);
        return categoria;
    }


    @PutMapping
    public Categoria edditar(@RequestBody Categoria categoria) {
        Categoria categoriaEditada = categoriaService.editar(categoria);
        return categoria;

    }
}
