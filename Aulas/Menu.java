public class Menu {
    public static void main (String[] args){

        int opcao = 1;

        switch (opcao){

            case 1:
                System.out.println("Cadastrar usuário");
                break;

            case 2:
                System.out.println("Listar usuários");
                break;

            case 3:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção Inválida");
        }
    }
    
}
