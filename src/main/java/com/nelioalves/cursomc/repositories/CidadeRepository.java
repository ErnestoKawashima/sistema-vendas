package com.nelioalves.cursomc.repositories;

import com.nelioalves.cursomc.dominio.Cidade;
import com.nelioalves.cursomc.dominio.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
