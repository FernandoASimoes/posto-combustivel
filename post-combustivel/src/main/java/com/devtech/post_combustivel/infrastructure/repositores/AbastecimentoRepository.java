package com.devtech.post_combustivel.infrastructure.repositores;

import com.devtech.post_combustivel.infrastructure.entitis.Abastecimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbastecimentoRepository extends JpaRepository<Abastecimento, Integer> {
}
