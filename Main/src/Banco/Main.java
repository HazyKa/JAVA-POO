package Banco;

import javax.sound.midi.MidiChannel;

public class Main {
    public static void main(String[] args) {
        Conta pessoa1 = new Conta();
        Conta pessoa2 = new Conta();

        pessoa1.setNumConta(8888);
        pessoa1.abrirConta("CC");
        pessoa1.setDono("Joao");

        pessoa1.depositar(700);
        pessoa1.sacar(200);
        pessoa1.pagarMensalidade();

        pessoa1.estadoAtual();
        //
        pessoa2.setNumConta(9999);
        pessoa2.abrirConta("CP");
        pessoa2.setDono("Michel");

        pessoa2.depositar(400);
        pessoa2.sacar(300);
        pessoa2.pagarMensalidade();

        pessoa2.estadoAtual();
    }
}
