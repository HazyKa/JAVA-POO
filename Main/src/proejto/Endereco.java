package proejto;

public class Endereco {
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;

    Endereco(String estado,String cidade,String bairro,String rua){
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
    }

    public void descricaoEndereco(){
        System.out.println("_____Endereco____");
        System.out.println(this.getEstado());
        System.out.println(this.getCidade());
        System.out.println(this.getBairro());
        System.out.println(this.getRua());
    }
    
    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
    public String getRua() {
        return rua;
    }
}
