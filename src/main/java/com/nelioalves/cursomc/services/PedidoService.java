package com.nelioalves.cursomc.services;

import com.nelioalves.cursomc.dominio.Pedido;
import com.nelioalves.cursomc.repositories.PedidoRepository;
import javassist.tools.rmi.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido buscar(Integer id) throws ObjectNotFoundException {
        Pedido obj = repo.findOne(id);
        if (obj == null) {
            throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
                    + ", Tipo: " + Pedido.class.getName());
        }
        return obj;
    }
}
