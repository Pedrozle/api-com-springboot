package com.pedrozle.testetecnico.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrozle.testetecnico.models.Endereco;
import com.pedrozle.testetecnico.models.Pessoa;
import com.pedrozle.testetecnico.repository.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Optional<Endereco> getById(Long id) {
        return this.enderecoRepository.findById(id);
    }

    public List<Endereco> getEnderecosPorIdPessoa(Long id) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(id);
        return this.enderecoRepository.findByPessoa(pessoa);

    }

    public Endereco salvarEndereco(Endereco endereco) {
        return this.enderecoRepository.save(endereco);
    }

}
