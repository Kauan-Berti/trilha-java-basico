package br.com.dio.iphone.model;

import br.com.dio.iphone.interfaces.AparelhoTelefonico;
import br.com.dio.iphone.interfaces.NavegadorInternet;
import br.com.dio.iphone.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public String numero;
    private String url;
    private String musica;

    public Iphone() {

    }

    public Iphone(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void desligarChamada() {
        System.out.println("Desligando chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Adicionando nova página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando Pagina");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Reproduzindo musica: " + musica);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void controleDeVolume(int volume) {
        System.out.println("Controle de volume: " + volume +"%");
    }
}
