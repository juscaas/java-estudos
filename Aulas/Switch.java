import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual opção deseja?: ");
        int opcao = scanner.nextInt();
        switch (opcao) {

        case 1:
            System.out.println("Cadastrar usuário");
            break;
        case 2:
            System.out.println("Listar usuários");
            break;
        case 3:
            System.out.println("RA");
            break;
        case 4:
            System.out.println("CPF");
            break;
        case 5:
            System.out.println("Saindo...");
            break;
        default:
            System.out.println("Opção inválida");
            break;
        }
    scanner.close();
    }
}

