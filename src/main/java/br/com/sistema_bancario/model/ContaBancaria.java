package br.com.sistema_bancario.model;

import br.com.sistema_bancario.exception.NotFoundBalanceException;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "contas_bancarias")
public class ContaBancaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroConta;
    private double saldo;

    @Enumerated(EnumType.STRING)
    private TipoConta tipoConta;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public void depositar (double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (valor > saldo){
            throw new NotFoundBalanceException("Saldo insuficiente. ");
        }
        if (valor <= 0){
            throw new NotFoundBalanceException("Insira um valor válido, maior que zero ");
        }
        this.saldo -= valor;
    }
}
