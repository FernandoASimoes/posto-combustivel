package com.devtech.post_combustivel.service;

import com.devtech.post_combustivel.infrastructure.entitis.Abastecimento;
import com.devtech.post_combustivel.infrastructure.entitis.BombasDeCombustivel;
import com.devtech.post_combustivel.infrastructure.repositores.AbastecimentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AbastecimentoService {

    private final AbastecimentoRepository abastecimentoRepository;
    private final BombaDeCombustivelService bombaDeCombustivelService;

    public void abastecer(Integer idBomba, Long litros){
        BombasDeCombustivel bomba = bombaDeCombustivelService.buscarBombasDeCombustivelPorId(idBomba);
        BigDecimal valorTotal = bomba.getTiposDeCombustivel()
                .getPrecoPorLitro().multiply(BigDecimal.valueOf(litros));

        Abastecimento abastecimento = Abastecimento.builder()
                .dataAbasatecimento(LocalDate.now())
                .bombasDeCombustivel(bomba)
                .valorTotal(valorTotal)
                .quantidadeLitros(litros)
                .build();

        abastecimentoRepository.save(abastecimento);
    }

    public List<Abastecimento> buscarAbastecimentos(){
        return abastecimentoRepository.findAll();
    }
}
