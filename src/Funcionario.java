import java.util.Date;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected String estadoCivil;
    protected String endereco;
    protected Date dataAdmissao;
    protected String carteiraDeTrabalho;

    public Funcionario(String nome, String cpf, String rg, String estadoCivil, String endereco, Date dataAdmissao, String carteiraDeTrabalho) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
        this.dataAdmissao = dataAdmissao;
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    }
}
