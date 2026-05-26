package Projetos.Concessionaria;

class Main{

public static void main(String[] args) {
    SistemaConcessionaria s = new SistemaConcessionaria();

        int opcao;

        do {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            opcao = s.menu();

            switch (opcao) {
                case 1:
                    s.cadastrarCarros();
                    break;
                case 2:
                    s.listarCarros();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

    }
}