package ControleRemoto;

public class Main {
    public static void main(String[] args) {
        Controle controle = new Controle();

        controle.ligar();
        controle.maisVolume();  
        controle.estadoAtual();
        controle.fecharMenu();
    }
}
