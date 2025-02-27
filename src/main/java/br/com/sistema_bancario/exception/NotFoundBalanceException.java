package br.com.sistema_bancario.exception;

public class NotFoundBalanceException extends RuntimeException {
    public NotFoundBalanceException(String message) {
        super(message);
    }
}
