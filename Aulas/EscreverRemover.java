import java.util.ArrayList;
import java.util.Scanner;

public class EscreverRemover {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes= new ArrayList<>();

        System.out.print("Digite o primeiro nome: ");
        nomes.add(sc.nextLine());

        System.out.print("Digite o segundo nome: ");
        nomes.add(sc.nextLine());

        System.out.print("Digite o terceiro nome: ");
        nomes.add(sc.nextLine());

        System.out.print("Digite um nome para remover: ");
        String remover = sc.nextLine();

        nomes.remove(remover);

        System.out.println("\nLista atualizada:");
        for (String nome : nomes){
             System.out.println(nome);
        }
    }
}
