package com.franzoso.mercearia.service;

import com.franzoso.mercearia.domain.Categoria;
import com.franzoso.mercearia.exception.RecursoNaoEncontradoException;
import com.franzoso.mercearia.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscarCodigo(Integer codigo) {
        Optional<Categoria> resultado = categoriaRepository.findById(codigo);

        if(resultado.isEmpty()) {
            throw new RecursoNaoEncontradoException();
        }
        Categoria categoria = resultado.get();
        return categoria;
    }
    public List<Categoria> listar() {
        List<Categoria> resultado = categoriaRepository.findAll();
        return resultado;
    }
    public Categoria inserir(Categoria categoria) {
    Categoria resultado = categoriaRepository.save(categoria);
    return resultado;
    }
    public Categoria excluir(@PathVariable Integer codigo) {
        Optional<Categoria> categoria = categoriaRepository.findById(codigo);
        categoriaRepository.delete(categoria.get());
        Categoria categoriaRetorno = categoria.get();
        return categoriaRetorno;
    }
    public Categoria editar(Categoria categoria) {
        Categoria categoriaEditada = categoriaRepository.save(categoria);
        return categoriaEditada;
    }

}
