import java.util.List;
public class Sobremesa extends Prato {
    private double calorias;

    public Sobremesa(List<String> ingredientes, String descricao, double tempoPreparo, double calorias) throws IllegalArgumentException {
        super(ingredientes, descricao, tempoPreparo);
        if (calorias <= 0) {
            throw new IllegalArgumentException();
        }
        this.calorias = calorias;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
}
