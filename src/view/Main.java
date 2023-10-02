package view;

import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.Endereco;
import model.PessoaFisica;
import model.PessoaJuridica;

import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {

                // criando os clientes
                Cliente joao = new PessoaFisica(
                                new Endereco("Santa Helena", 24, "Aparecida"),
                                "000.000.000-00",
                                "João da Silva",
                                LocalDate.of(1990, 10, 8));

                Cliente makipex = new PessoaJuridica(
                                new Endereco("Augusto Moreira", 104, "Serra Grande"),
                                "92.928.365/0001-07",
                                "Makipex");

                // criando as contas
                ContaCorrente contaJoao = new ContaCorrente(123, 794823, 1200, LocalDate.now(), joao, 1.5);

                ContaPoupanca contaMakipex = new ContaPoupanca(321, 456843, 2349, LocalDate.now(), makipex, 10);

                // mostrandos os dados das contas
                System.out.println("--- Conta joão ---\n" + contaJoao);
                System.out.println("--- Conta Makipex ---\n" + contaMakipex);

                System.out.println(">>>>>>>>>>> Efetuando operações...\n\n");

                // realizando operações na conta de joao
                contaJoao.depositar(300);
                contaJoao.aplicarTaxa();
                contaJoao.sacar(1700.0);
                System.out.println("--- Conta joão ---");
                System.out.println(contaJoao);

                // realizando operações na conta da makipex
                contaMakipex.depositar(400);
                contaMakipex.renderJuros();
                System.out.println("--- Conta Makipex ---");
                System.out.println(contaMakipex);

        }
}