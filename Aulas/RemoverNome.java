import java.util.ArrayList;

public class RemoverNome {
    public static void main (String [] args) {
        
        ArrayList<String> nomes = new ArrayList<>();

            nomes.add("Ana");
            nomes.add("Bruno");
            nomes.add("Carlos");

            nomes.remove("Bruno");

        for (String nome: nomes){
            System.out.println(nome);
        }
           }
}