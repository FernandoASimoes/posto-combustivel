package com.devtech.post_combustivel.infrastructure.entitis;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "abastecimento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Abastecimento {

    @Id
    @Column(name = "id")
    private Integer id;
    @OneToOne
    @JoinColumn(name = "bomba_combustivel_id")
    private BombasDeCombustivel bombasDeCombustivel;
    @Column(name = "data_abastecimento")
    private LocalDate dataAbasatecimento;
    @Column(name = "valor_total")
    private BigDecimal valorTotal;
    @Column(name = "quantidade_litros")
    private long quantidadeLitros;
}
