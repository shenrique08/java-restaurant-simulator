import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Cozinheiro extends Funcionario implements Serializable {
    private List<? extends Item> pratos;
    private double salario;
    private int numPedidosNoMes;
    private final int limitePedidos = 1;

    // Atributos estáticos para o valor pago ao cozinheiro por prato principal e sobremesa
    private static double valorPratoPrincipal;
    private static double valorSobremesa;

    public Cozinheiro(List<? extends Item> pratos, String nome, String cpf, String rg, String estadoCivil, String endereco, Date dataAdmissao, String carteiraDeTrabalho) {
        super(nome, cpf, rg, estadoCivil, endereco, dataAdmissao, carteiraDeTrabalho);
        this.pratos = pratos;
        this.numPedidosNoMes = 0;
        this.salario = 0;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumPedidosNoMes() {
        return numPedidosNoMes;
    }

    public void setNumPedidosNoMes(int numPedidosNoMes) {
        this.numPedidosNoMes = numPedidosNoMes;
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
            throw new IllegalArgumentException("O valor deve ser maior que 0!");
        }
        valorPratoPrincipal = valor;
    }

    public static double getValorPagoSobremesa() {
        return valorSobremesa;
    }

    public static void setValorPagoSobremesa(double valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que 0!");
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
