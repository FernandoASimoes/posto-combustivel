package com.devtech.post_combustivel.service;

import com.devtech.post_combustivel.infrastructure.entitis.TiposDeCombustivel;
import com.devtech.post_combustivel.infrastructure.repositores.TipoDeCombustivelRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TiposDeCombustivelService {

    private final TipoDeCombustivelRepository tipoDeCombustivelRepository;

    public void criar(TiposDeCombustivel tiposDeCombustivel){
        tipoDeCombustivelRepository.save(tiposDeCombustivel);
    }

    public TiposDeCombustivel buscarTiposDeCombustivelPorId(Integer id){
        return tipoDeCombustivelRepository.findById(id).orElseThrow(() ->
                new NullPointerException("Bom de combustível não encontrada pelo id: " + id));
    }

    public List<TiposDeCombustivel> buscarTiposDeCombustivel(){
        return tipoDeCombustivelRepository.findAll();
    }

    @Transactional
    public void deletarTiposDeCombustivelPorId(Integer id){
        tipoDeCombustivelRepository.deleteById(id);
    }

    public void alterarBombaDeCombustivel(Integer id, TiposDeCombustivel tipoDeCombustivel){
        TiposDeCombustivel bomba = buscarTiposDeCombustivelPorId((id));
        tipoDeCombustivel.setId(bomba.getId());
        tipoDeCombustivelRepository.save(tipoDeCombustivel);
    }
}
