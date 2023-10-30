public class Sobremesa extends Item {
    private String[] ingredientes;
    private String descricao;
    private double tempoPreparo;
    private double calorias;

    public Sobremesa(String[] ingredientes, String descricao, double tempoPreparo, double calorias) {
        this.ingredientes = ingredientes;
        this.descricao = descricao;
        this.tempoPreparo = tempoPreparo;
        this.calorias = calorias;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(double tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
}
