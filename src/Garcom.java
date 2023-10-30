import java.util.Date;

public class Garcom extends Funcionario {
    private double salarioBase;
    private String diaFolga;
    private int numPedidos;
    private int limitePedidos = 25; // para ganhar a gratificação

    public Garcom(double salarioBase, String diaFolga, String nome, String cpf, String rg, String estadoCivil, String endereco, Date dataAdmissao, String carteiraDeTrabalho) {
        super(nome, cpf, rg, estadoCivil, endereco, dataAdmissao, carteiraDeTrabalho);
        this.salarioBase = salarioBase;
        this.diaFolga = diaFolga;
    }

    public void verificaGratificacao() {

        if (numPedidos > limitePedidos) {
            System.out.println("Você ganhou a gratificação!");
        } else {
            System.out.println("Você não ganhou a gratificação!");
        }

    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDiaFolga() {
        return diaFolga;
    }

    public void setDiaFolga(String diaFolga) {
        this.diaFolga = diaFolga;
    }
}
