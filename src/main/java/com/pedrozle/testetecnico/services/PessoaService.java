package com.pedrozle.testetecnico.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrozle.testetecnico.models.Pessoa;
import com.pedrozle.testetecnico.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> listarTodos() {
        return this.pessoaRepository.findAll();

    }

    public Optional<Pessoa> getPessoaPorId(Long id) {
        return this.pessoaRepository.findById(id);
    }

    public Pessoa salvar(Pessoa pessoa) {
        return this.pessoaRepository.save(pessoa);
    }

}