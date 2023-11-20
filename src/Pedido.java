import java.util.Date;

public class Pedido {
    private Item[] itens;
    private int[] quantidades;
    private Date dataPedido;
    private Date horaRegistro;
    private Date horaPagamento;
    private double valorTotal;
    private String formaPagamento;
    private Garcom garcom;
    private Cozinheiro cozinheiro;

    public Pedido(Item[] itens, int[] quantidades, Date dataPedido, Date horaRegistro,
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

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public int[] getQuantidades() {
        return quantidades;
    }

    public void setQuantidades(int[] quantidades) {
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
