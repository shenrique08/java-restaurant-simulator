public class Bebidas extends Item {
    private int tamanho;
    private String embalagem;

    public Bebidas(int tamanho, String embalagem) {
        this.tamanho = tamanho;
        this.embalagem = embalagem;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }
}
