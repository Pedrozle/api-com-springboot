package com.pedrozle.testetecnico.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pedrozle.testetecnico.models.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

    List<Pessoa> findAll();

}
