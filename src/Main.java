import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Criando os garçons
        List<Garcom> garcons = new ArrayList<>();
        garcons.add(new Garcom(2000.0, "Segunda", "Joao", "139710616-64", "123456", "Solteiro", "Rua 01", new Date(), "CT123"));
        garcons.add(new Garcom(1800.0, "Terça", "Maria", "139710616-64", "654321", "Casado", "Rua 02", new Date(), "CT456"));
        garcons.add(new Garcom(2200.0, "Quarta", "Pedro", "139710616-64", "789012", "Solteiro", "Rua 03", new Date(), "CT789"));

        // Serializar os garçons
        Persistencia.serializar("garcons.ser", garcons);

        // Teste: desserializar os garçons
        /*
        List<Garcom> garconsDesserializados = Persistencia.desserializar("garcons.ser");
        if (garconsDesserializados != null) {
            for (Garcom garcom : garconsDesserializados) {
                System.out.println(garcom);
            }
        }

         */

        List<Bebidas> bebidas = new ArrayList<>();
        bebidas.add(new Bebidas("Coca-cola", 500.0, "Lata"));
        bebidas.add(new Bebidas("Cerveja", 750.0, "Garrafa"));
        bebidas.add(new Bebidas("Suco", 300.0, "Lata"));

        Persistencia.serializar("bebidas.ser", bebidas);


        // Atribuindo valores às bebidas
        for (Bebidas bebida : bebidas) {
            bebida.setNomeComercial("Bebida");
            bebida.setCodigo("COD123");
            bebida.setPrecoUnitario(5.0); // Substitua 5.0 pelo valor desejado
            bebida.setPrecoItem(bebida.getPrecoUnitario() * bebida.getTamanho());
        }

        List<PratoPrincipal> pratosPrincipais = new ArrayList<>();
        pratosPrincipais.add(new PratoPrincipal(Arrays.asList("Ingrediente1", "Ingrediente2"), "Feijoada", 30.0));
        pratosPrincipais.add(new PratoPrincipal(Arrays.asList("Ingrediente3", "Ingrediente4"), "Arroz Carreteiro", 25.0));
        pratosPrincipais.add(new PratoPrincipal(Arrays.asList("Ingrediente5", "Ingrediente6"), "Galinhada", 35.0));

        Persistencia.serializar("pratosPrincipais.ser", pratosPrincipais);

        // Atribuindo valores aos pratos principais
        for (PratoPrincipal pratoPrincipal : pratosPrincipais) {
            pratoPrincipal.setNomeComercial("Prato Principal");
            pratoPrincipal.setCodigo("COD456");
            pratoPrincipal.setPrecoUnitario(15.0); // Substitua 15.0 pelo valor desejado
            pratoPrincipal.setPrecoItem(pratoPrincipal.getPrecoUnitario());
        }


        List<Sobremesa> sobremesas = new ArrayList<>();
        sobremesas.add(new Sobremesa(Arrays.asList("Ingrediente7", "Ingrediente8"), "Bolo", 15.0, 200.0));
        sobremesas.add(new Sobremesa(Arrays.asList("Ingrediente7", "Ingrediente8"), "Pudim", 12.0, 150.0));
        sobremesas.add(new Sobremesa(Arrays.asList("Ingrediente7", "Ingrediente8"), "Mousse", 18.0, 250.0));

        Persistencia.serializar("sobremesas.ser", sobremesas);

        // Atribuindo valores às sobremesas
        for (Sobremesa sobremesa : sobremesas) {
            sobremesa.setNomeComercial("Sobremesa");
            sobremesa.setCodigo("COD789");
            sobremesa.setPrecoUnitario(8.0); // Substitua 8.0 pelo valor desejado
            sobremesa.setPrecoItem(sobremesa.getPrecoUnitario());
        }

        List<Cozinheiro> cozinheiros = new ArrayList<>();
        cozinheiros.add(new Cozinheiro(new ArrayList<>(bebidas), "Paulo Bazooka", "139710616-64", "123456", "Solteiro", "Rua 01", new Date(), "Carteira1"));
        cozinheiros.add(new Cozinheiro(new ArrayList<>(pratosPrincipais), "Marcel 200 I.Q", "139710616-64", "654321", "Solteiro", "Rua 02", new Date(), "Carteira2"));
        cozinheiros.add(new Cozinheiro(new ArrayList<>(sobremesas), "Lazarento", "139710616-64", "789012", "Solteiro", "Rua 03", new Date(), "Carteira3"));

        Persistencia.serializar("cozinheiros.ser", cozinheiros);

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



        // ---------------------------------------- INTERFACE ---------------------------------------------
        Scanner sc = new Scanner(System.in);

        // Criar um cliente
        System.out.println("\n<<<<< Cadastro de Cliente >>>>>");
        System.out.print("Nome: ");
        String nomeCliente = sc.nextLine();
        System.out.print("CPF: ");
        String cpfCliente = sc.nextLine();

        Cliente cliente = new Cliente(nomeCliente, cpfCliente);

        int op;

        do {


            System.out.println("\n<<<<< MENU >>>>>");
            System.out.println("(1) LISTAR TODOS OS ITENS");
            System.out.println("(2) REALIZAR UM PEDIDO");
            System.out.println("(0) SAIR");
            System.out.println("ESCOLHA UMA OPÇÃO: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.println("<<<<< TODOS OS ITENS >>>>>");
                    System.out.println("\n<< BEBIDAS >> ");
                    for (Bebidas b : bebidas) {
                        System.out.println(b.getNome());
                    }
                    System.out.println("\n<< PRATOS PRINCIPAIS >> ");
                    for (PratoPrincipal p : pratosPrincipais) {
                        System.out.println(p.getDescricao());
                    }
                    System.out.println("\n<< SOBREMESAS >> ");
                    for (Sobremesa s : sobremesas) {
                        System.out.println(s.getDescricao());
                    }
                }
                case 2 -> {
                    Date dataPedido = new Date();
                    System.out.println("\n<<<<< REALIZAR UM PEDIDO >>>>>");

                    // Loop para escolher um garçom válido
                    int garcomIndex;
                    do {
                        System.out.println("\n<< GARÇONS DISPONÍVEIS >> ");
                        for (int i = 0; i < garcons.size(); i++) {
                            System.out.println("(" + (i + 1) + ") " + garcons.get(i).nome);
                        }

                        System.out.print("Escolha o NÚMERO associado ao nome do garçom para o atendimento: ");
                        garcomIndex = sc.nextInt();
                        sc.nextLine();

                        if (garcomIndex < 1 || garcomIndex > garcons.size()) {
                            System.out.println("Garçom inválido! Tente novamente.");
                        }
                    } while (garcomIndex < 1 || garcomIndex > garcons.size());

                    Garcom garcomAtendimento = garcons.get(garcomIndex - 1);

                    List<Item> itensPedido = new ArrayList<>();


                    while (true) {
                        int categoriaItem;
                        System.out.println("\n<< OPÇÕES DE ITENS >>");
                        System.out.println("(1) BEBIDAS");
                        System.out.println("(2) PRATOS PRINCIPAIS");
                        System.out.println("(3) SOBREMESAS");
                        System.out.println("(0) FINALIZAR PEDIDO");
                        System.out.print("Escolha a categoria do item desejado: ");
                        categoriaItem = sc.nextInt();
                        sc.nextLine();

                        // Verificar se o usuário deseja finalizar o pedido
                        if (categoriaItem == 0) {
                            break;
                        }

                        switch (categoriaItem) {
                            case 1 -> {
                                // Adicionar bebida ao pedido
                                System.out.println("\n<< BEBIDAS DISPONÍVEIS >> ");
                                for (int i = 0; i < bebidas.size(); i++) {
                                    System.out.println("(" + (i + 1) + ") " + bebidas.get(i).getNome());
                                }
                                System.out.print("Escolha o número da bebida desejada: ");
                                int bebidaIndex = sc.nextInt();
                                sc.nextLine();
                                if (bebidaIndex < 1 || bebidaIndex > bebidas.size()) {
                                    System.out.println("Número de bebida inválido. Tente novamente.");
                                    continue; // Volta para o início do loop
                                }
                                itensPedido.add(bebidas.get(bebidaIndex - 1));
                            }
                            case 2 -> {
                                // Adicionar prato principal ao pedido
                                System.out.println("\n<< PRATOS PRINCIPAIS DISPONÍVEIS >> ");
                                for (int i = 0; i < pratosPrincipais.size(); i++) {
                                    System.out.println("(" + (i + 1) + ") " + pratosPrincipais.get(i).getDescricao());
                                }
                                System.out.print("Escolha o número do prato principal desejado: ");
                                int pratoIndex = sc.nextInt();
                                sc.nextLine();
                                if (pratoIndex < 1 || pratoIndex > pratosPrincipais.size()) {
                                    System.out.println("Número de prato principal inválido. Tente novamente.");
                                    continue; // Volta para o início do loop
                                }
                                itensPedido.add(pratosPrincipais.get(pratoIndex - 1));
                            }
                            case 3 -> {
                                // Adicionar sobremesa ao pedido
                                System.out.println("\n<< SOBREMESAS DISPONÍVEIS >> ");
                                for (int i = 0; i < sobremesas.size(); i++) {
                                    System.out.println("(" + (i + 1) + ") " + sobremesas.get(i).getDescricao());
                                }
                                System.out.print("Escolha o número da sobremesa desejada: ");
                                int sobremesaIndex = sc.nextInt();
                                sc.nextLine();
                                if (sobremesaIndex < 1 || sobremesaIndex > sobremesas.size()) {
                                    System.out.println("Número de sobremesa inválido. Tente novamente.");
                                    continue; // Volta para o início do loop
                                }
                                itensPedido.add(sobremesas.get(sobremesaIndex - 1));
                            }
                            default -> System.out.println("Opção de categoria inválida. Tente novamente.");
                        }
                    }


                    // verifica se o usuário realmente adicionou algum item ao seu carrinho
                    if (itensPedido.isEmpty()) {
                        break;
                    }

                    // Mostrar itens do pedido
                    System.out.println("\n<< ITENS DO PEDIDO >>");
                    for (Item item : itensPedido) {
                        System.out.println(item.getNomeComercial());
                    }


                    System.out.println("\n<< COZINHEIROS DISPONÍVEIS >> ");

                    int cozinheiroIndex;
                    do {
                        for (int i = 0; i < cozinheiros.size(); i++) {
                            System.out.println("(" + (i + 1) + ") Cozinheiro: " + cozinheiros.get(i).getNome());
                        }

                        System.out.print("Escolha o número associado ao cozinheiro para preparar o pedido: ");
                        cozinheiroIndex = sc.nextInt();
                        sc.nextLine();

                        if (cozinheiroIndex < 1 || cozinheiroIndex > cozinheiros.size()) {
                            System.out.println("Cozinheiro inválido! Tente novamente.");
                        }
                    } while (cozinheiroIndex < 1 || cozinheiroIndex > cozinheiros.size());


                    Cozinheiro cozinheiroEscolhido = cozinheiros.get(cozinheiroIndex - 1);


                    Date dataAtual = new Date();
                    SimpleDateFormat formatoData = new SimpleDateFormat("HH:mm:ss");
                    String horaDoRegistro = formatoData.format(dataAtual);
                    int horaRegistroInt = Integer.parseInt(horaDoRegistro.substring(0, 2));
                    Date horaRegistro = new Date();
                    horaRegistro.setHours(horaRegistroInt);


                    // Calcular o valor total do pedido
                    double valorTotalPedido = 0.0;
                    for (Item item : itensPedido) {
                        valorTotalPedido += item.getPrecoItem();
                    }

                    System.out.print("Digite a forma de pagamento: (pix) (crédito) (débito) ");
                    String formaPagamentoPedido = sc.nextLine();

                    Date dataAtual2 = new Date();
                    SimpleDateFormat formatoData2 = new SimpleDateFormat("HH:mm:ss");
                    String horaDoPagamento = formatoData2.format(dataAtual2);
                    int horaPagamentoInt = Integer.parseInt(horaDoPagamento.substring(0, 2));
                    Date horaPagamento = new Date();
                    horaPagamento.setHours(horaPagamentoInt);


                    /*
                        Atualizar os valores de quantidade de pedidos

                    */

                    List<Integer> quantidadesPedido = Arrays.asList(1, 2, 3);

                    Pedido novoPedido = new Pedido(itensPedido, quantidadesPedido, dataPedido, horaRegistro,
                            horaPagamento, valorTotalPedido, formaPagamentoPedido, garcomAtendimento);

                    novoPedido.realizarPedido();
                    garcons.get(garcomIndex - 1).setnumPedidosNoMes(garcomAtendimento.getnumPedidosNoMes() + 1);
                    cozinheiros.get(cozinheiroIndex - 1).setNumPedidosNoMes(cozinheiroEscolhido.getNumPedidosNoMes() + 1);

                }
                case 0 -> System.out.println("ATÉ MAIS, AMIGÃO :)");
                default -> System.out.println("OPÇÃO INVÁLIDA! Tente novamente");
            }

            // verificar se o usuário deseja continuar navegando pelo aplicativo, mesmo após já ter realizado algum pedido
            int continuar;
            do {
                System.out.println("\nDeseja voltar ao MENU?\n(1) -> SIM\n(2) -> NÃO");
                continuar = sc.nextInt();
                sc.nextLine();
            } while (continuar != 1 && continuar != 2);
            if (continuar == 2) {
                break;
            }

        } while(op != 0);


        System.out.println("\n<<<<< SALÁRIO DOS GARÇONS >>>>>");
        for (Garcom g : garcons) {
            g.verificaGratificacao();
            System.out.printf("\nSalário do [%s]: R$%.3f\n\n", g.getNome(), g.calcularSalario());
        }

        System.out.println("\n<<<<< SALÁRIO DOS COZINHEIROS >>>>>");
        for (Cozinheiro c : cozinheiros) {
            System.out.printf("Salário do [%s]: R$%.3f\n", c.getNome(), c.calcularSalario());
        }

        sc.close();
    }
}
