package Banco;
//Classe Conta
public class Conta {

    private static int ultimoIdConta = 0;
    
    private String nome;
    private int idConta;
    private double saldo;
    private boolean estado;


    Conta(String nome, double saldo){
        this.nome = nome;
        this.idConta = ++ultimoIdConta;
        this.saldo = saldo;
        this.estado = true;
    }

    public void depositar(double valor){
        if(getEstado()){
            saldo = this.saldo + valor;
            System.out.println("Deposito de: " + valor + " Concluido! Valor na conta: " + saldo);
        }else{
            System.out.println("Impossivel depositar, conta fechada!");
        }
    }

    public void sacar(double valor){
        if (getEstado() && saldo+1 > valor) {
            saldo = this.saldo - valor;
            System.out.println("Saque de: " + valor + " Concluido! Valor na conta: " + saldo);
        }else {
            System.out.println("Impossivel sacar, valor alto ou conta fechada!");
        }
    }

    public void deletar(){
        if(saldo != 0 || saldo < 0){
            System.out.println("Nao pode fechar a conta, tem debitos a pagar ou sacar!");
        }else {
            estado = false;
            System.out.println("Conta fechada!");
        }
    }

    public void transferir(double valor, Conta destino){
        if(getEstado() && destino.getEstado()){
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferencia de: " + valor + " Para: " + destino.getNome() + " Concluido! Valor na conta: " + saldo);
        }else {
            System.out.println("Impossivel sacar, conta fechada!");
        }
    }

    //METODOS GETTERS

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getIdConta() {
        return idConta;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setNome(String nome){
        this.nome = nome;
    }    

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

//Classe Verificacao
