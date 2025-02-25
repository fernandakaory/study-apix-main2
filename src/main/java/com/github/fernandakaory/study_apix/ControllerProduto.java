package com.github.fernandakaory.study_apix;

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
    public String create() {
        return "Produto Cadastrado";
    }

    @PutMapping
    public String update() {
        return "Produto Atualizado";
    }

    @GetMapping
    public String find() {
        return "abacaxi";
    }

    @DeleteMapping
    public void delete() {

    }
}
