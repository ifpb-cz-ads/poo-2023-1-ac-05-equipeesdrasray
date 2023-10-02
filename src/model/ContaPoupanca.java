package model;

import java.time.LocalDate;

public class ContaPoupanca extends Conta {

    private double taxaJuros;

    // constructor
    public ContaPoupanca(
            int agencia,
            int numero,
            double saldo,
            LocalDate dataAbertura,
            Cliente cliente,
            double taxaJuros) {

        super(agencia, numero, saldo, dataAbertura, cliente);
        this.taxaJuros = taxaJuros;

    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    // saca um determinado valor da conta
    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo()) {
            diminuirSaldo(valor);
            return true;
        } else {
            return false;
        }
    }

    // adiciona o rendimento de juros na conta
    public boolean renderJuros() {
        double juros = getSaldo() * taxaJuros / 100;
        depositar(juros + getSaldo());
        return true;
    }

}