public class Cliente {
    private final String nomeCliente;
    private final String CPFCliente;

    public Cliente(String nome, String cpf) {
        this.nomeCliente = nome;
        this.CPFCliente = cpf;
    }


    public String getNome() {
        return nomeCliente;
    }

    public String getCpf() {
        return CPFCliente;
    }
}

