public class PratoPrincipal extends Item {
    private String[] ingredientes;
    private String descricao;
    private double tempoPreparo;

    public PratoPrincipal(String[] ingredientes, String descricao, double tempoPreparo) {
        this.ingredientes = ingredientes;
        this.descricao = descricao;
        this.tempoPreparo = tempoPreparo;
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
}
