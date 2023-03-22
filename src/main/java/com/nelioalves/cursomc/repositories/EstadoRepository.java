package com.nelioalves.cursomc.repositories;

import com.nelioalves.cursomc.dominio.Cidade;
import com.nelioalves.cursomc.dominio.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
