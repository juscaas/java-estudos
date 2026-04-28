import java.util.ArrayList;

public class SomarNumeros {

    public static void main (String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        int soma = 0;

        for (int i = 0; i < numeros.size(); i++){
            soma += numeros.get(i);
        }
        System.out.println("Soma: " + soma);
    }
}