public class Sobremesa extends Prato {
    private double calorias;

    public Sobremesa(String[] ingredientes, String descricao, double tempoPreparo, double calorias) {
        super(ingredientes, descricao, tempoPreparo);
        this.calorias = calorias;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
}
