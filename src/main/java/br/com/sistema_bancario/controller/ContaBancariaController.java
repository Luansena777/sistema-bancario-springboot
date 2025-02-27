package br.com.sistema_bancario.controller;


import br.com.sistema_bancario.model.ContaBancaria;
import br.com.sistema_bancario.service.ContaBancariaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contas")
public class ContaBancariaController {
    private final ContaBancariaService service;

    public ContaBancariaController(ContaBancariaService service) {
        this.service = service;
    }

    @PostMapping
    public ContaBancaria crianConta(@RequestBody ContaBancaria conta) {
        return service.criarConta(conta);
    }

    @GetMapping("/{id}")
    public ContaBancaria buscarConta(@PathVariable Long id) {
        return service.buscarContaById(id);
    }

    @PutMapping("/{id}")
    public void depositar(@PathVariable Long id, @RequestParam double valor) {
        service.depositar(id, valor);
    }

    @PutMapping("/{id}")
    public void sacar(@PathVariable Long id, @RequestParam double valor) {
        service.sacar(id, valor);
    }
}
