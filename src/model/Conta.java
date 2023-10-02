package model;

import java.time.LocalDate;

public abstract class Conta {

    // dados da conta
    private int agencia;
    private int numero;
    private double saldo;
    private LocalDate dataAbertura;
    private Cliente cliente;

    public Conta(int agencia, int numero, double saldo, LocalDate dataAbertura, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.cliente = cliente;
    }

    public boolean depositar(double valor) {
        if (valor >= 0) {
            saldo += valor;
            return true;
        }

        return false;

    }

    public abstract boolean sacar(double valor);

    protected boolean diminuirSaldo(double valor) {
        this.saldo -= valor;
        return true;
    }

    // getter e setters da conta
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Conta Corrente" + "\n" +
                "Agência: " + agencia + '\n' +
                "Numero: " + numero + '\n' +
                "Saldo: R$ " + saldo + '\n';
    }
}
