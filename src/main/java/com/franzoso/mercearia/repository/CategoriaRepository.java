package com.franzoso.mercearia.repository;

import com.franzoso.mercearia.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
}
