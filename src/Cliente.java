public class Cliente {
    private final String nomeCliente;
    private final String CPFCliente;

    // Construtor
    public Cliente(String nome, String cpf) {
        this.nomeCliente = nome;
        this.CPFCliente = cpf;
    }

    // Getters
    public String getNome() {
        return nomeCliente;
    }

    public String getCpf() {
        return CPFCliente;
    }
}

