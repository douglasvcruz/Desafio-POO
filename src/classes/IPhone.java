package classes;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorWeb;
import interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb {

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo celular");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página web");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}
