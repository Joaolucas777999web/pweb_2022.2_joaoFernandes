package br.com.joao.cadpessoas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joao.cadpessoas.model.Pessoa;

@Repository
public interface PessoaRepository 
        extends JpaRepository<Pessoa, Long>{

        }
