package com.devtech.post_combustivel.service;

import com.devtech.post_combustivel.infrastructure.entitis.BombasDeCombustivel;
import com.devtech.post_combustivel.infrastructure.repositores.BombaDeCombustivelRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BombaDeCombustivelService {

    private final BombaDeCombustivelRepository bombaDeCombustivelRepository;

    public void criar(BombasDeCombustivel bombasDeCombustivel){
        bombaDeCombustivelRepository.save(bombasDeCombustivel);
    }

    public BombasDeCombustivel buscarBombasDeCombustivelPorId(Integer id){
        return bombaDeCombustivelRepository.findById(id).orElseThrow(() ->
                new NullPointerException("Bom de combustível não encontrada pelo id: " + id));
    }

    public List<BombasDeCombustivel> buscarBombasDeCombustivel(){
        return bombaDeCombustivelRepository.findAll();
    }

    @Transactional
    public void deletarBombasDeCombustivelPorId(Integer id){
        bombaDeCombustivelRepository.deleteById(id);
    }

    public void alterarBombaDeCombustivel(Integer id, BombasDeCombustivel bombasDeCombustivel){
        BombasDeCombustivel bomba = buscarBombasDeCombustivelPorId((id));
        bombasDeCombustivel.setId(bomba.getId());
        bombaDeCombustivelRepository.save(bombasDeCombustivel);
    }
}
