import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Cozinheiro extends Funcionario implements Serializable {
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
        double salario = 0.0;

        // Iterar sobre os itens da categoria do cozinheiro (pratos principais ou sobremesas)
        for (Item item : pratos) {
            // Verificar o tipo de item e adicionar o valor correspondente ao salário
            if (item instanceof PratoPrincipal) {
                salario += valorPratoPrincipal;
            } else if (item instanceof Sobremesa) {
                salario += valorSobremesa;
            }
        }

        return salario;
    }

    /*
    public double calcularSalario() {

        for(Item i: pratos) {
            salario += i.getPrecoUnitario();
        }

        return salario;
    }

     */

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
