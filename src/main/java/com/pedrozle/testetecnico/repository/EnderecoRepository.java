package com.pedrozle.testetecnico.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pedrozle.testetecnico.models.Endereco;
import com.pedrozle.testetecnico.models.Pessoa;

public interface EnderecoRepository extends CrudRepository<Endereco, Long> {

    List<Endereco> findAll();

    List<Endereco> findByPessoa(Pessoa pessoa);

}