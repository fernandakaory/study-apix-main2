package com.github.fernandakaory.study_apix;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
// o rest controller permite que a classe java escuto requiscoes externas
@RequestMapping("produtos")
// rota de acesso /produtos


public class ControllerProduto {
    @PostMapping
    public ResponseEntity<String> create(Produto produto) {
        return ResponseEntity.status(201).body("Produto Cadastrado");
    }

    @PutMapping
    public ResponseEntity<String> update() {
        return ResponseEntity.status(200).body("Produto Atualizado");
    }

    @GetMapping
    public ResponseEntity<String> find() {
        return ResponseEntity.status(200).body("Morango");
    }

    @DeleteMapping
    public ResponseEntity<Void> delete() {
        return ResponseEntity.status(204).build();
    }
}
