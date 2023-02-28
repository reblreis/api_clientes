package br.com.cotiinformatica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cotiinformatica.entities.Cliente;

@Repository //já vem os métodos prontos
public interface IClienteRepository extends JpaRepository<Cliente, Integer> {

}
