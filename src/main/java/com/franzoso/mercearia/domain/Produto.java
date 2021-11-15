package com.franzoso.mercearia.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 50, nullable = false, unique = true)
    private String nome;

    @Column(nullable = false)
    private Integer quantidade;


   @ManyToOne
   @JoinColumn(nullable = false)
   private Categoria categoria;
}
