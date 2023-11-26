import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Cozinheiro extends Funcionario{
    private List<? extends Item> pratos;
    private double salario;

    // Atributos estáticos para o valor pago ao cozinheiro por prato principal e sobremesa
    private static double valorPratoPrincipal;
    private static double valorSobremesa;

    public Cozinheiro(List<? extends Item> pratos, String nome, String cpf, String rg, String estadoCivil, String endereco, Date dataAdmissao, String carteiraDeTrabalho) {
        super(nome, cpf, rg, estadoCivil, endereco, dataAdmissao, carteiraDeTrabalho);
        this.pratos = pratos;
    }

    public double calcularSalario() {

        for(Item i: pratos) {
            salario += i.getPrecoUnitario();
        }

        return salario;
    }

    // Métodos para os valores estáticos
    public static double getValorPagoPratoPrincipal() {
        return valorPratoPrincipal;
    }

    public static void setValorPagoPratoPrincipal(double valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException();
        }
        valorPratoPrincipal = valor;
    }

    public static double getValorPagoSobremesa() {
        return valorSobremesa;
    }

    public static void setValorPagoSobremesa(double valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException();
        }
        valorSobremesa = valor;
    }

    public List<? extends Item> getPratos() {
        return pratos;
    }

    public void setPratos(List<Item> pratos) {
        this.pratos = pratos;
    }
}
