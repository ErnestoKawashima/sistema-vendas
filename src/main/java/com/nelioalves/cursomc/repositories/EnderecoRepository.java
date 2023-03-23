package com.nelioalves.cursomc.repositories;

import com.nelioalves.cursomc.dominio.Cliente;
import com.nelioalves.cursomc.dominio.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {


}
