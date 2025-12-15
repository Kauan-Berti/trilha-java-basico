package br.com.dio.model;
import br.com.dio.interfaces.IBanco;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Banco implements IBanco {

    public  String nome;
    private List<Conta> contas;


    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }



    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void listarContasAtivas() {
        long quantidadeContas = this.contas.stream()
                .filter(c -> c.getSaldo() > 0)
                .count();
        System.out.println("Quantidade de contas " + this.nome + " Ativas: " + quantidadeContas);
    }

    @Override
    public void listarTotalDeClientes() {
        long quantidadeClientes = this.contas.stream().map(c -> c.cliente).distinct().count();
        System.out.println("Quantidade total de clientes " + this.nome + ": " + quantidadeClientes);

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Banco banco = (Banco) o;
        return Objects.equals(nome, banco.nome) && Objects.equals(contas, banco.contas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, contas);
    }
}
