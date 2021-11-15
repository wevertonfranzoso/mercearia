package com.franzoso.mercearia.produto.repository;

import com.franzoso.mercearia.domain.Produto;
import com.franzoso.mercearia.repository.ProdutoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootTest
public class ProdutoRepositoryTest {

    @Autowired
    private ProdutoRepository produtoRepository;

   /* @Test
    public void inserir() {
        Produto p1 = new Produto(
                null,
                "Coca cola",
                Integer.valueOf("15"),
                BigDecimal.valueOf(10.50),
                LocalDate.of(2021,11,23) ,null);

        Produto p2 = new Produto(
               null,
                "Guaraná Antartica",
                Integer.valueOf("25"),
                BigDecimal.valueOf(6.50),
                LocalDate.of(2022,12,31), null);

        produtoRepository.save(p1);
        produtoRepository.save(p2);

    } */
}
