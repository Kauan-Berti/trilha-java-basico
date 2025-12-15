package br.com.dio;

import br.com.dio.model.Banco;
import br.com.dio.model.Cliente;
import br.com.dio.model.Conta;
import br.com.dio.model.ContaCorrente;
import br.com.dio.model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        //adicionando banco e clientes
        Banco banco = new Banco("DDD-Bank");
        Cliente cliente = new Cliente("Dean");
        Cliente cliente2 = new Cliente("João");

        //adicionando contas
        Conta cc = new ContaCorrente(cliente);
        Conta poupança = new ContaPoupanca(cliente);
        Conta c2 = new ContaCorrente(cliente2);

        //adicionando contas na lista do banco
        banco.adicionarConta(cc);
        banco.adicionarConta(c2);
        banco.adicionarConta(poupança);

        c2.depositar(30);
        cc.depositar(500);

        cc.transferir(100, poupança);

        cc.imprimirExtrato();
        poupança.imprimirExtrato();

        banco.listarContasAtivas();
        System.out.println("=============");
        banco.listarTotalDeClientes();


    }

}
