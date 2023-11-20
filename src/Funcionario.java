import java.util.Date;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected String estadoCivil;
    protected String endereco;
    protected Date dataAdmissao;
    protected String carteiraDeTrabalho;

    public abstract double calcularSalario();

    public Funcionario(String nome, String cpf, String rg, String estadoCivil, String endereco,
                       Date dataAdmissao, String carteiraDeTrabalho) {
        this.nome = nome;
        this.rg = rg;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
        this.dataAdmissao = dataAdmissao;
        this.carteiraDeTrabalho = carteiraDeTrabalho;

        if(validaCPF(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido!");
            this.cpf = "";
        }
    }

    public Funcionario(String nome, String cpf) {
        this.nome = nome;

        if(validaCPF(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido!");
            this.cpf = "";
        }
    }

    public Funcionario() {
        this.nome = "";
        this.cpf = "";
        this.rg = "";
        this.estadoCivil = "";
        this.endereco = "";
        this.carteiraDeTrabalho = "";
    }

    public boolean validaCPF(String cpf) {
        // Remove pontos e traços do CPF
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(cpf.charAt(i));
            sum += digit * (10 - i);
        }
        int firstVerificationDigit = 11 - (sum % 11);
        if (firstVerificationDigit >= 10) {
            firstVerificationDigit = 0;
        }

        // Calcula o segundo dígito verificador
        sum = 0;
        for (int i = 0; i < 10; i++) {
            int digit = Character.getNumericValue(cpf.charAt(i));
            sum += digit * (11 - i);
        }
        int secondVerificationDigit = 11 - (sum % 11);
        if (secondVerificationDigit >= 10) {
            secondVerificationDigit = 0;
        }

        // Verifica se os dígitos verificadores calculados são iguais aos dígitos reais
        return cpf.charAt(9) == Character.forDigit(firstVerificationDigit, 10)
                && cpf.charAt(10) == Character.forDigit(secondVerificationDigit, 10);
    }
}
