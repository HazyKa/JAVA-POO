package proejto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa("Michel", 18, "Solteiro", 11372900993l, 49999320790l, null, null);
        p1.definirEndereco("SC", "Itapiranga", "Santa Fe Alta", "Sem Nome");
        p1.definirEmpresa("Joao", "Admin", "8/12 - 13:30/18", 2300);

        Pessoa p2 = new Pessoa("Joao", 19, "Solteiro", 11372900993l, 49999320790l, null, null);
        p2.definirEndereco("SC", "Itapiranga", "Santa Fe Alta", "Sem Nome");
        p2.definirEmpresa("Joao", "Admin", "8/12 - 13:30/18", 1700);

        pessoas.add(p1);
        pessoas.add(p2);

        p1.descricaoPessoa();
        p2.descricaoPessoa();
    }
}
