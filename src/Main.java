import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Criando os garçons
        Garcom[] garcons = new Garcom[3];

        try {
            garcons[0] = new Garcom(2000.0, "Segunda", "Joao", "139710616-64", "123456", "Solteiro", "Rua 01", new Date(), "CT123");
            garcons[1] = new Garcom(1800.0, "Terça", "Maria", "139710616-64", "654321", "Casado", "Rua 02", new Date(), "CT456");
            garcons[2] = new Garcom(2200.0, "Quarta", "Pedro", "139710616-64", "789012", "Solteiro", "Rua 03", new Date(), "CT789");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar objeto Garcom: Salário fixo deve ser maior que zero.");
            return;
        }

        // Criando instâncias de bebidas
        Bebidas[] bebidas = {
                new Bebidas("Coca-Cola", 500.0, "Lata"),
                new Bebidas("Cerveja", 750.0, "Garrafa"),
                new Bebidas("Suco",300.0, "Lata")
        };

        // Atribuindo valores às bebidas
        for (Bebidas bebida : bebidas) {
            bebida.setNomeComercial("Bebida");
            bebida.setCodigo("COD123");
            bebida.setPrecoUnitario(5.0); // Substitua 5.0 pelo valor desejado
            bebida.setPrecoItem(bebida.getPrecoUnitario() * bebida.getTamanho());
        }

        // Criando instâncias de pratos principais
        PratoPrincipal[] pratosPrincipais = {
                new PratoPrincipal(new String[]{"Ingrediente1", "Ingrediente2"}, "Feijoada", 30.0),
                new PratoPrincipal(new String[]{"Ingrediente3", "Ingrediente4"}, "Arroz Carreteiro", 25.0),
                new PratoPrincipal(new String[]{"Ingrediente5", "Ingrediente6"}, "Galinhada", 35.0)
        };

        // Atribuindo valores aos pratos principais
        for (PratoPrincipal pratoPrincipal : pratosPrincipais) {
            pratoPrincipal.setNomeComercial("Prato Principal");
            pratoPrincipal.setCodigo("COD456");
            pratoPrincipal.setPrecoUnitario(15.0); // Substitua 15.0 pelo valor desejado
            pratoPrincipal.setPrecoItem(pratoPrincipal.getPrecoUnitario());
        }

        // Criando instâncias de sobremesas
        Sobremesa[] sobremesas = {
                new Sobremesa(new String[]{"Ingrediente7", "Ingrediente8"}, "Bolo", 15.0, 200.0),
                new Sobremesa(new String[]{"Ingrediente9", "Ingrediente10"}, "Pudim", 12.0, 150.0),
                new Sobremesa(new String[]{"Ingrediente11", "Ingrediente12"}, "Mousse", 18.0, 250.0)
        };

        // Atribuindo valores às sobremesas
        for (Sobremesa sobremesa : sobremesas) {
            sobremesa.setNomeComercial("Sobremesa");
            sobremesa.setCodigo("COD789");
            sobremesa.setPrecoUnitario(8.0); // Substitua 8.0 pelo valor desejado
            sobremesa.setPrecoItem(sobremesa.getPrecoUnitario());
        }

        // Criando os cozinheiros
        Cozinheiro cozinheiro1 = new Cozinheiro(bebidas, "José", "139710616-64", "123456", "Solteiro", "Rua 01", new Date(), "Carteira1");
        Cozinheiro cozinheiro2 = new Cozinheiro(pratosPrincipais, "Augusto", "139710616-64", "654321", "Solteiro", "Rua 02", new Date(), "Carteira2");
        Cozinheiro cozinheiro3 = new Cozinheiro(sobremesas, "Rodrigo", "139710616-64", "789012", "Solteiro", "Rua 03", new Date(), "Carteira3");

        // Adicionando valores aos pratos (exemplo)
        for (Item prato : pratosPrincipais) {
            prato.setPrecoUnitario(10.0); // Substitua 10.0 pelo valor desejado
        }
        for (Item prato : pratosPrincipais) {
            prato.setPrecoUnitario(15.0); // Substitua 15.0 pelo valor desejado
        }
        for (Item prato : pratosPrincipais) {
            prato.setPrecoUnitario(20.0); // Substitua 20.0 pelo valor desejado
        }

        // Calculando salários
        double salarioCozinheiro1 = cozinheiro1.calcularSalario();
        double salarioCozinheiro2 = cozinheiro2.calcularSalario();
        double salarioCozinheiro3 = cozinheiro3.calcularSalario();

        // Interface
        Scanner sc = new Scanner(System.in);

        int op;

        do {
            System.out.println("<< MENU >>");
            System.out.println("(1) LISTAR TODOS OS ITENS");
            System.out.println("(2) REALIZAR UM PEDIDO");
            System.out.println("(0) SAIR");
            System.out.println("ESCOLHA UMA OPÇÃO: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("<< TODOS OS ITENS >>");
                    System.out.println("BEBIDAS: ");
                    for(Bebidas b: bebidas) {
                        System.out.println(b.getNome());
                    }
                    System.out.println("PRATOS PRINCIPAIS: ");
                    for(PratoPrincipal p: pratosPrincipais) {
                        System.out.println(p.getDescricao());
                    }
                    System.out.println("SOBREMESAS: ");
                    for(Sobremesa s: sobremesas) {
                        System.out.println(s.getDescricao());
                    }

                    break;
                case 2:
                    // CRIAR PEDIDO DEPOIS
                    break;
                case 0:
                    System.out.println("ATÉ MAIS :)");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
            }

        } while(op != 0);
    }

}
