package com.nelioalves.cursomc.services;

import com.nelioalves.cursomc.dominio.Cliente;
import com.nelioalves.cursomc.repositories.ClienteRepository;
import javassist.tools.rmi.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente buscar(Integer id) throws ObjectNotFoundException {
        Cliente obj = repo.findOne(id);
        if (obj == null) {
            throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
                    + ", Tipo: " + Cliente.class.getName());
        }
        return obj;
    }
}
