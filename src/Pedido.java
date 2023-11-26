import java.util.ArrayList;
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

    public double calcValorTotal() {
        for(Item i: itens) {
            valorTotal += i.getPrecoItem();
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
