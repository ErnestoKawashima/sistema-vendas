package com.nelioalves.cursomc.dominio;

import com.nelioalves.cursomc.dominio.enums.EstadoPagamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;



@Entity
public class PagamentoComCartao extends Pagamento {
    private static final long serialVersionUID;

    static {
        serialVersionUID = 1L;
    }


    private Integer numeroDeParcelas;
    public PagamentoComCartao() {
    }

    public PagamentoComCartao(Integer id,EstadoPagamento estado, Pedido pedido, Integer numeroDeParcela) {
        super(id, estado, pedido);
        this.numeroDeParcelas = numeroDeParcela;
    }

    public Integer getNumeroDeParcela() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcela(Integer numeroDeParcela) {
        this.numeroDeParcelas = numeroDeParcela;
    }
}
