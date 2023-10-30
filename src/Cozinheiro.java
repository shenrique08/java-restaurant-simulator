import java.util.Date;

public class Cozinheiro extends Funcionario{
    private Item[] pratos;
    private double salario;

    public Cozinheiro(Item[] pratos, String nome, String cpf, String rg, String estadoCivil, String endereco, Date dataAdmissao, String carteiraDeTrabalho) {
        super(nome, cpf, rg, estadoCivil, endereco, dataAdmissao, carteiraDeTrabalho);
        this.pratos = pratos;
    }

    public double calcSalario() {

        for(Item i: pratos) {
            salario += i.getPrecoUnitario();
        }

        return salario;
    }

    public Item[] getPratos() {
        return pratos;
    }

    public void setPratos(Item[] pratos) {
        this.pratos = pratos;
    }
}
