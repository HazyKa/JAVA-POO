package Banco;

import javax.sound.midi.MidiChannel;

public class Main {
    public static void main(String[] args) {
        Conta michel = new Conta("Joao", -2000.00);
        michel.setNome("Michel"); //mudando apenas para testar uso

        Conta joao = new Conta("Joao", 1500.00);
        Conta gaby = new Conta("Gaby", 1200.00);

        //Testando verificacao de conta aberta

        //michel.setEstado(false); estado: false (conta fechada)
        michel.depositar(2500);
        //michel.sacar(500); saldo: 1500
        //gaby.setEstado(false); SE ESCRITO, TRANSFERENCIA INDISPONIVEL
        //michel.transferir(500, gaby);
        //System.out.println(michel.getSaldo());
        //michel.deletar();

    }
}
