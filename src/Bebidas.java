public class Bebidas extends Item {
    private double tamanho;
    private String embalagem;

    public Bebidas(double tamanho, String embalagem) {
        this.tamanho = tamanho;
        this.embalagem = embalagem;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }
}
