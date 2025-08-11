package com.devtech.post_combustivel.controller;

import com.devtech.post_combustivel.infrastructure.entitis.BombasDeCombustivel;
import com.devtech.post_combustivel.infrastructure.entitis.TiposDeCombustivel;
import com.devtech.post_combustivel.service.BombaDeCombustivelService;
import com.devtech.post_combustivel.service.TiposDeCombustivelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bombasDeCombustivel")
public class BombasDeCobustivelController {

    private final BombaDeCombustivelService bombaDeCombustivelService;

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody BombasDeCombustivel bombasDeCombustivel){
        bombaDeCombustivelService.criar(bombasDeCombustivel);

        return ResponseEntity.accepted().build();
    }


    @GetMapping("/{id}")
    public ResponseEntity<BombasDeCombustivel> buscarBombasDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        return ResponseEntity.ok(bombaDeCombustivelService.buscarBombasDeCombustivelPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTiposDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        bombaDeCombustivelService.deletarBombasDeCombustivelPorId(id);

        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> alterarBombaDeCombustivel(@RequestParam(name = "id") Integer id,
                                                         @RequestBody BombasDeCombustivel bombasDeCombustivel){
        bombaDeCombustivelService.alterarBombaDeCombustivel(id, bombasDeCombustivel);

        return ResponseEntity.ok().build();
    }
}
