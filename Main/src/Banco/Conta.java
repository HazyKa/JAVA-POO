package Banco;
//Classe Conta
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;

    public Conta(){
        this.setSaldo(0);
        this.setStatus(false);
    }


    public void estadoAtual(){
        System.out.println("=========================");
        System.out.println("NumConta:" + this.getNumConta());
        System.out.println("Tipo:" + this.getTipo());
        System.out.println("Dono:" + this.getDono());
        System.out.println("Saldo:" + this.getSaldo());
        System.out.println("Status:" + this.getStatus());
    }

    public void abrirConta(String t){
        this.setStatus(true);
        this.setTipo(t);
        if(tipo.equals("CC")){
            this.setSaldo(50);
        }else if (tipo.equals("CP")){
            this.setSaldo(150);
        }
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("A dinheiro na conta, nao pode fechar!");
        } else if(getSaldo() < 0){
            System.out.println("A conta esta negativa, nao pode fechar!");
        } else {
            System.out.println("Conta fechada com sucesso");
            setStatus(false);
            setTipo(null);
            setDono(null);
            setNumConta(0);
        }
    }

    public void depositar(int v){
        if(this.getStatus()){
            setSaldo(getSaldo() + v);
            System.out.println("Deposito de " + v + " realizado com sucesso");
        }else {
            System.out.println("Conta fechada, impossivel depositar!");
        }
    }

    public void sacar(int v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque de " + v + " realizado com sucesso");
            } else{
                System.out.println("Saldo insuficiente para saque");
            }
        } else { 
            System.out.println("Conta fechada, impossivel sacar!");
        }
    }

    public void pagarMensalidade(){
        if(this.getTipo().equals("CC")){
            this.setSaldo(this.getSaldo() - 20);
        } else {
            this.setSaldo(this.getSaldo() - 12);
        }
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDono() {
        return dono;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}