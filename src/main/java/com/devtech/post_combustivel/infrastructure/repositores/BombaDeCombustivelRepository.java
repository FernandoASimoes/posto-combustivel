package com.devtech.post_combustivel.infrastructure.repositores;

import com.devtech.post_combustivel.infrastructure.entitis.BombasDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BombaDeCombustivelRepository extends JpaRepository<BombasDeCombustivel, Integer> {
}
