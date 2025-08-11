package com.devtech.post_combustivel.infrastructure.repositores;

import com.devtech.post_combustivel.infrastructure.entitis.TiposDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDeCombustivelRepository extends JpaRepository<TiposDeCombustivel, Integer> {
}
