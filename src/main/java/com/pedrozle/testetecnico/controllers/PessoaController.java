package com.pedrozle.testetecnico.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pedrozle.testetecnico.models.Pessoa;
import com.pedrozle.testetecnico.services.PessoaService;

@RestController
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/pessoa")
    public List<Pessoa> getListaPessoas() {
        return this.pessoaService.listarTodos();
    }

    @GetMapping("/pessoa/{id}")
    public Optional<Pessoa> getPessoaPorId(@PathVariable("id") Long id) {
        return this.pessoaService.getPessoaPorId(id);
    }

    @PostMapping("/pessoa")
    public Pessoa salvarPessoa(@RequestBody Pessoa pessoa) {
        return this.pessoaService.salvar(pessoa);
    }

    @PutMapping("/pessoa")
    public Pessoa editarPessoa(@RequestBody Pessoa pessoa) {
        return this.pessoaService.salvar(pessoa);
    }

}