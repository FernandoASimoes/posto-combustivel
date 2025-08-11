package com.devtech.post_combustivel.controller;

import com.devtech.post_combustivel.infrastructure.entitis.Abastecimento;
import com.devtech.post_combustivel.infrastructure.entitis.TiposDeCombustivel;
import com.devtech.post_combustivel.service.AbastecimentoService;
import com.devtech.post_combustivel.service.TiposDeCombustivelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tiposDeCombustivel")
public class TiposDeCobustivelController {

    private final TiposDeCombustivelService tiposDeCombustivelService;

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody TiposDeCombustivel tiposDeCombustivel){
        tiposDeCombustivelService.criar(tiposDeCombustivel);

        return ResponseEntity.accepted().build();
    }



    @GetMapping("/{id}")
    public ResponseEntity<TiposDeCombustivel> buscarTiposDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        return ResponseEntity.ok(tiposDeCombustivelService.buscarTiposDeCombustivelPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTiposDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        tiposDeCombustivelService.deletarTiposDeCombustivelPorId(id);

        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> alterarTipoDeCombustivel(@RequestParam(name = "id") Integer id,
                                                         @RequestBody TiposDeCombustivel tiposDeCombustivel){
        tiposDeCombustivelService.alterarBombaDeCombustivel(id, tiposDeCombustivel);

        return ResponseEntity.ok().build();
    }
}
