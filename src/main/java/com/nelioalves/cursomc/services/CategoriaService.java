package com.nelioalves.cursomc.services;

import com.nelioalves.cursomc.dominio.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import javassist.tools.rmi.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id) throws ObjectNotFoundException {
        Categoria obj = repo.findOne(id);
        if (obj == null) {
            throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
                    + ", Tipo: " + Categoria.class.getName());
        }
        return obj;
    }
}
