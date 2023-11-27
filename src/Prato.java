import java.util.List;

public abstract class Prato extends Item {
    protected List<String> ingredientes;
    protected String descricao;
    protected double tempoPreparo;

    public Prato(List<String> ingredientes, String descricao, double tempoPreparo) throws IllegalArgumentException {
        if (tempoPreparo <= 0) {
            throw new IllegalArgumentException("O tempo de preparo deve ser maior que 0!");
        }
        this.ingredientes = ingredientes;
        this.descricao = descricao;
        this.tempoPreparo = tempoPreparo;
    }

    protected List<String> getIngredientes() {
        return ingredientes;
    }

    protected void setIngredientes(List<String> ingredientes) {
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
            throw new IllegalArgumentException("O tempo de preparo deve ser maior que 0!");
        }
        this.tempoPreparo = tempoPreparo;
    }

}
