package model;

public abstract class Cliente {

    private double limiteCredito;
    private Endereco endereco;

    // constructor
    public Cliente(Endereco endereco) {
        this.endereco = endereco;
    }

    // retorna o limite de crédio de um determinado cliente
    public double getLimiteCredito() {
        return limiteCredito;
    }

    // ajusta o limite de crédito de um cliente
    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    // retorna o endereço
    public Endereco getEndereco() {
        return endereco;
    }

    // ajusta o endereço
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
