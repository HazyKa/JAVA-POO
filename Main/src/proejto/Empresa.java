package proejto;

public class Empresa {
    private String supervisor;
    private String setor;
    private String horario;
    private int salario;

    Empresa(String supervisor,String setor,String horario,int salario){
        this.supervisor = supervisor;
        this.setor = setor;
        this.horario = horario;
        this.salario = salario;
    }

    public void descricaoEmpresa(){
        System.out.println("_____Empresa____");
        System.out.println(this.getSupervisor());
        System.out.println(this.getSetor());
        System.out.println(this.getHorario());
        System.out.println(this.getSalario());
    }

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getSupervisor() {
        return supervisor;
    }
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
}
