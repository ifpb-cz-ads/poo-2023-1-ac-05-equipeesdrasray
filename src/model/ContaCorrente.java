package model;

import java.time.LocalDate;

public class ContaCorrente extends Conta {

    public static final double LIMITE_CREDITO = 1000.0;
    private double taxaManutencao;

    // constructor
    public ContaCorrente(
            int agencia,
            int numero,
            double saldo,
            LocalDate dataAbertura,
            Cliente cliente,
            double taxaManutencao) {

        super(agencia, numero, saldo, dataAbertura, cliente);
        this.taxaManutencao = taxaManutencao;
        getCliente().setLimiteCredito(LIMITE_CREDITO);

    }

    // saca um determinado valor da conta
    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo() + getCliente().getLimiteCredito() && valor >= 0) {
            diminuirSaldo(valor);
            return true;
        }

        return false;
    }

    // aplica uma taxa de manutenção no saldo da conta
    public boolean aplicarTaxa() {
        diminuirSaldo(taxaManutencao);
        return true;
    }

    // retorna a taxa de manutenção da conta
    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

}
