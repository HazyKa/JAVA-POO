package ControleRemoto;

public class Controle implements Interface{
    private int volume;
    private boolean tocando;
    private boolean ligado;

    public Controle(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public void ligar(){
        this.setLigado(true);
    }

    public void desligar(){
        this.setLigado(false);
        this.setTocando(false);
        this.setVolume(0);
    }
    public void abrirMenu(){
        System.out.println("Ligado: " + this.getLigado());
        System.out.println("Tocando: " + this.getTocando());
        System.out.println("Volume: " + this.getLigado());
        System.out.println("Volume: " + this.getVolume());
    }
    public void fecharMenu(){
        System.out.println("Fechando menu...");
    }
    public void maisVolume(){
        if (this.getLigado()){
            this.setVolume(getVolume() + 5);
        }else{
            System.out.println("Desligado, impossivel aumentar!");
        }
    }
    public void menosVolume(){
        if (this.getLigado()){
            this.setVolume(getVolume() - 5);
        }else{
            System.out.println("Desligado, impossivel diminuir!");
        }
    }
    public void ligarMudo(){
        if (this.getLigado()){
            this.setVolume(0);
        }else{
            System.out.println("Desligado, impossivel mutar!");
        }
    }
    public void desligarMudo(){
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }else{
            System.out.println("Desligado, impossivel mutar!");
        }
    }
    public void play(){
        if(!(this.getTocando()) && this.getLigado()){
            this.setTocando(true);
        }
    }
    public void pause(){
        if(this.getTocando() && this.getLigado()){
            this.setTocando(false);
        }
    }

    public void estadoAtual(){
        System.out.println("Volume: " + getVolume());
        System.out.println("Tocando: " + getTocando());
        System.out.println("Ligado: " + getLigado());
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

}
