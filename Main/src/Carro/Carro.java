package Carro;
// S : cada classe com sua funcao
// O : objetos ou entidades devem estar abertos para extensão, mas fechados para modificação
// L : Uma classe derivada deve ser substituível por sua classe base
// I : Uma classe não deve ser forçada a implementar interfaces e métodos que não utilizará
// D : Dependa de abstrações e não de implementações

public class Carro {

    private String nome;
    private String modelo;
    private String cor;
    private int ano;
        
    public Carro(String nome, String modelo, String cor, int ano){
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this. ano = ano;
    }

    public String acelerar(){
        //faria todo o sistema do carro para acelerar
        return "acelerando!";
    }

    public String freiar(){
        //faria todo o sistema do carro para freiar
        return "freiando!";
    }

    //METODOS GETTERS

    public String getNome() {
        return nome;
    }

    public String getModelo(){
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    //METODOS SETTERS 

    public void setNome(String nome){
        this.nome = nome;
    }

}

