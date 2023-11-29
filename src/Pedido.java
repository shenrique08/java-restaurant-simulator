import java.util.Date;
import java.util.List;

public class Pedido {
    private List<Item> itens;
    private List<Integer> quantidades;
    private Date dataPedido;
    private Date horaRegistro;
    private Date horaPagamento;
    private double valorTotal;
    private String formaPagamento;
    private Garcom garcom;
    private Cozinheiro cozinheiro;

    public Pedido(List<Item> itens, List<Integer> quantidades, Date dataPedido, Date horaRegistro,
                  Date horaPagamento, double valorTotal, String formaPagamento, Garcom garcom) throws IllegalArgumentException {
        if (valorTotal <= 0) {
            throw new IllegalArgumentException();
        }
        this.itens = itens;
        this.quantidades = quantidades;
        this.dataPedido = dataPedido;
        this.horaRegistro = horaRegistro;
        this.horaPagamento = horaPagamento;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.garcom = garcom;
    }

    public Pedido(Cozinheiro cozinheiro, Garcom garcom, Date dataPedido, Date horaRegistro) {
        this.cozinheiro = cozinheiro;
        this.garcom = garcom;
        this.dataPedido = dataPedido;
        this.horaRegistro = horaRegistro;
    }

    public Pedido(List<Item> itens, List<Integer> quantidades, Garcom garcom) throws IllegalArgumentException {
        if (itens.size() != quantidades.size()) {
            throw new IllegalArgumentException("O número de itens e da quantidade devem ser iguais!");
        }
        this.itens = itens;
        this.quantidades = quantidades;
        this.dataPedido = new Date();
        this.horaRegistro = new Date();
        this.valorTotal = calcValorTotal();
        this.garcom = garcom;
    }


    public void realizarPedido() {
        System.out.println("\n<<<<< PEDIDO >>>>>");
        System.out.println("Garçom: " + garcom.getNome());
        System.out.println("Itens do Pedido:");

        for (int i = 0; i < itens.size(); i++) {
            Item item = itens.get(i);
            int quantidade = quantidades.get(i);

            System.out.println("- " + quantidade + " x " + item.getNomeComercial() + " - R$" + item.getPrecoItem() * quantidade);
        }

        System.out.println("\nTotal do Pedido: R$" + valorTotal);
        System.out.println("Preparando os itens...");


        for (Item item : itens) {
            System.out.println("Preparando " + item.getNomeComercial() + "...");
        }


        System.out.println("Efetuando pagamento...");
        System.out.println("\nPEDIDO CONCLUÍDO!");
    }


    public double calcValorTotal() {
        valorTotal = 0.0;

        for (int i = 0; i < itens.size(); i++) {
            Item item = itens.get(i);
            int quantidade = quantidades.get(i);

            valorTotal += item.getPrecoItem() * quantidade;
        }

        return valorTotal;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public List<Integer> getQuantidades() {
        return quantidades;
    }

    public void setQuantidades(List<Integer> quantidades) {
        this.quantidades = quantidades;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Date getHoraRegistro() {
        return horaRegistro;
    }

    public void setHoraRegistro(Date horaRegistro) {
        this.horaRegistro = horaRegistro;
    }

    public Date getHoraPagamento() {
        return horaPagamento;
    }

    public void setHoraPagamento(Date horaPagamento) {
        this.horaPagamento = horaPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) throws IllegalArgumentException {
        if (valorTotal <= 0) {
            throw new IllegalArgumentException();
        }
        this.valorTotal = valorTotal;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
