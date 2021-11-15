package com.franzoso.mercearia.repository;

import com.franzoso.mercearia.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
