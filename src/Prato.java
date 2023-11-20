public abstract class Prato extends Item {
    protected String[] ingredientes;
    protected String descricao;
    protected double tempoPreparo;

    public Prato(String[] ingredientes, String descricao, double tempoPreparo) throws IllegalArgumentException {
        if (tempoPreparo <= 0) {
            throw new IllegalArgumentException();
        }
        this.ingredientes = ingredientes;
        this.descricao = descricao;
        this.tempoPreparo = tempoPreparo;
    }

    protected String[] getIngredientes() {
        return ingredientes;
    }

    protected void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    protected String getDescricao() {
        return descricao;
    }

    protected void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    protected double getTempoPreparo() {
        return tempoPreparo;
    }

    protected void setTempoPreparo(double tempoPreparo) throws IllegalArgumentException {
        if (tempoPreparo <= 0) {
            throw new IllegalArgumentException();
        }
        this.tempoPreparo = tempoPreparo;
    }

}
