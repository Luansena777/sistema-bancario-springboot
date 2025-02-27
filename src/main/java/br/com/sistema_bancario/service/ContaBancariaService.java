package br.com.sistema_bancario.service;


import br.com.sistema_bancario.exception.AccountNotFoundException;
import br.com.sistema_bancario.model.ContaBancaria;
import br.com.sistema_bancario.repository.ContaBancariaRepository;
import org.springframework.stereotype.Service;

@Service
public class ContaBancariaService {
    private final ContaBancariaRepository repository;

    public ContaBancariaService(ContaBancariaRepository repository) {
        this.repository = repository;
    }

    public ContaBancaria criarConta(ContaBancaria conta){
        return repository.save(conta);
    }

    public ContaBancaria buscarContaById(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new AccountNotFoundException("Conta não encontrada."));
    }

    public void depositar(Long id, double valor){
        ContaBancaria conta = buscarContaById(id);
        conta.depositar(valor);
        repository.save(conta);
    }

    public void sacar(Long id, double valor){
        ContaBancaria conta = buscarContaById(id);
        conta.depositar(valor);
        repository.save(conta);
    }

}
