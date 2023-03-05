package com.pedrozle.testetecnico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pedrozle.testetecnico.models.Endereco;
import com.pedrozle.testetecnico.services.EnderecoService;

@RestController
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping("/endereco")
    public List<Endereco> getEndereco(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/endereco")
    public Endereco salvarEndereco(@RequestBody Endereco endereco) {
        return this.enderecoService.salvarEndereco(endereco);
    }

    @GetMapping("/enderecos/pessoa/{id}")
    public List<Endereco> getEnderecosPorPessoaId(@PathVariable("id") Long id) {
        return this.enderecoService.getEnderecosPorIdPessoa(id);
    }


}
