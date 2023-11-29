import java.io.Serializable;
import java.util.Date;

public class Garcom extends Funcionario implements Serializable {
    private double salarioFixo;
    private String diaFolga;
    private int numPedidosNoMes;
    private static final int limitePedidos = 1; // para ganhar a gratificação
    private double salarioBonus = 0;

    public Garcom(double salarioFixo, String diaFolga, String nome, String cpf, String rg,
                  String estadoCivil, String endereco, Date dataAdmissao, String carteiraDeTrabalho) throws IllegalArgumentException {
        super(nome, cpf, rg, estadoCivil, endereco, dataAdmissao, carteiraDeTrabalho);
        if (salarioFixo <= 0) {
            throw new salarioNegativoException("Erro ao criar objeto 'Garcom': O salário fixo deve ser maior que zero.");
        }
        this.salarioFixo = salarioFixo;
        this.diaFolga = diaFolga;
        this.numPedidosNoMes = 0;
    }

    public int getnumPedidosNoMes() {
        return numPedidosNoMes;
    }

    public void setnumPedidosNoMes(int numPedidosNoMes) {
        this.numPedidosNoMes = numPedidosNoMes;
    }

    public double getSalarioBonus() {
        return salarioBonus;
    }

    public void setSalarioBonus(double salarioBonus) {
        this.salarioBonus = salarioBonus;
    }

    public double calcularSalario() {
        double salario = salarioFixo;

        if (numPedidosNoMes > limitePedidos) {
            salarioBonus = 0.1 * salarioFixo;
            salario += salarioBonus;
        }

        return salario;
    }

    public void verificaGratificacao() {

        if (numPedidosNoMes > limitePedidos) {
            System.out.printf("[%s] ganhou a gratificação!", getNome());
        } else {
            System.out.printf("[%s] não ganhou a gratificação!", getNome());
        }
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) throws IllegalArgumentException {
        if (salarioFixo <= 0) {
            throw new salarioNegativoException("O salário fixo deve ser maior que zero.");
        }
        this.salarioFixo = salarioFixo;
    }

    public String getDiaFolga() {
        return diaFolga;
    }

    public void setDiaFolga(String diaFolga) {
        this.diaFolga = diaFolga;
    }

    @Override
    public String toString() {
        return "Garcom{" +
                "salarioFixo=" + salarioFixo +
                ", diaFolga='" + diaFolga + '\'' +
                ", numPedidosNoMes=" + numPedidosNoMes +
                ", limitePedidos=" + limitePedidos +
                ", salarioBonus=" + salarioBonus +
                ", nome='" + nome + '\'' +
                ", CPF='" + cpf + '\'' +
                ", RG='" + rg + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", endereco='" + endereco + '\'' +
                ", dataAdmissao=" + dataAdmissao +
                ", carteiraDeTrabalho='" + carteiraDeTrabalho + '\'' +
                '}';
    }
}
