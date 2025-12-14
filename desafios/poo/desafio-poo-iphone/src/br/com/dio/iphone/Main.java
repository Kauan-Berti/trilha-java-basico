package br.com.dio.iphone;

import br.com.dio.iphone.model.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone("+55 15 99634 7070");
        iPhone.setUrl("https://web.dio.me/");
        iPhone.setMusica("The Beatles - Hey Jude");


        //funções de aparelho telefonico
        iPhone.ligar("+55 15 99678 7070");
        iPhone.desligarChamada();
        iPhone.iniciarCorreioVoz();
        iPhone.atender();

        //funções de navegador
        System.out.println("==================");
        iPhone.exibirPagina(iPhone.getUrl());
        iPhone.adicionarPagina();
        iPhone.atualizarPagina();

        //funções de reprodutor musical
        System.out.println("==================");
        iPhone.selecionarMusica(iPhone.getMusica());
        iPhone.tocar();
        iPhone.pausar();
        iPhone.controleDeVolume(50);


    }
}
