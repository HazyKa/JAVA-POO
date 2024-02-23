package Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fusca", "G1", "Branco", 2017);
        carro1.setNome("Gol");

        System.out.println(carro1.getNome());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getAno());


        System.out.println(carro1.acelerar());
        System.out.println(carro1.freiar());
    }
}
