package com.nelioalves.cursomc.repositories;

import com.nelioalves.cursomc.dominio.Categoria;
import com.nelioalves.cursomc.dominio.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
