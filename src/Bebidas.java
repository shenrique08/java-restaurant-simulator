import java.io.Serializable;

public class Bebidas extends Item implements Serializable {
    private double tamanho;
    private String embalagem;
    private String nome;

    public Bebidas(String n, double tamanho, String embalagem) throws IllegalArgumentException {
        if (tamanho <= 0) {
            throw new IllegalArgumentException("O tamanho deve ser maior que 0");
        }
        this.tamanho = tamanho;
        this.embalagem = embalagem;
        this.nome = n;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) throws IllegalArgumentException {
        if (tamanho <= 0) {
            throw new IllegalArgumentException("O tamanho deve ser maior que 0");
        }
        this.tamanho = tamanho;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
