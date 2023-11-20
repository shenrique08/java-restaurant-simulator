public abstract class Item {
    protected String nomeComercial;
    protected String codigo;
    protected double precoUnitario;
    protected double precoItem;

    protected String getNomeComercial() {
        return nomeComercial;
    }

    protected void setNomeComercial(String nomeComercial) {
        this.nomeComercial = nomeComercial;
    }

    protected String getCodigo() {
        return codigo;
    }

    protected void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    protected double getPrecoUnitario() {
        return precoUnitario;
    }

    protected void setPrecoUnitario(double precoUnitario) throws IllegalArgumentException {
        if (precoUnitario <= 0) {
            throw new IllegalArgumentException();
        }
        this.precoUnitario = precoUnitario;
    }

    protected double getPrecoItem() {
        return precoItem;
    }

    protected void setPrecoItem(double precoItem) throws IllegalArgumentException {
        if (precoItem <= 0) {
            throw new IllegalArgumentException();
        }
        this.precoItem = precoItem;
    }
}
