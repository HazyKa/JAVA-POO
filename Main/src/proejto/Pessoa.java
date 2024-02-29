package proejto;

import javax.xml.transform.stream.StreamSource;

public class Pessoa {
    private String nome;
    private int idade;
    private String estadoCivil;
    private long cpf;
    private long telefone;
    private Endereco endereco;
    private Empresa empresa;

    Pessoa(String nome,int idade,String estadoCivil,long cpf,long telefone,Endereco endereco,Empresa empresa){
        this.nome = nome;
        this.idade = idade;
        this.estadoCivil = estadoCivil;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void definirEndereco(String estado, String cidade, String bairro, String rua){
        this.endereco = new Endereco(estado, cidade, bairro, rua);
    }

    public void definirEmpresa(String supervisor, String setor, String horario, int salario){
        this.empresa = new Empresa(supervisor,setor,horario,salario);
    }

    public void descricaoPessoa(){
        System.out.println("=========================");
        System.out.println(this.getNome());
        System.out.println(this.getIdade());
        System.out.println(this.getEstadoCivil());
        System.out.println(this.getCpf());
        System.out.println(this.getTelefone());
        this.getEndereco().descricaoEndereco();
        this.getEmpresa().descricaoEmpresa();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public long getCpf() {
        return cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
}



