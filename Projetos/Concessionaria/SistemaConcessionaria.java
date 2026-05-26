package Projetos.Concessionaria;

import java.util.ArrayList;
import java.util.Scanner;

class SistemaConcessionaria{

static Scanner sc = new Scanner(System.in);
    static ArrayList<Veiculo> listarCarros = new ArrayList<>();

    public void cadastrarCarros() {

        sc.nextLine();

        System.out.println("Marca: ");
        String marca = sc.nextLine();
        
        System.out.print("Modelo do Carro: ");
        String modelo = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        System.out.println("Ano: ");
        int ano = sc.nextInt();

        sc.nextLine();

        System.out.println("Combustível Utilizado: ");
        String combustivel = sc.nextLine();

        Veiculo p = new Veiculo(marca, modelo, preco, quantidade, ano, combustivel);

        listarCarros.add(p);

        System.out.println("Carro cadastrado!");
    }

    public void listarCarros() {

        if (listarCarros.isEmpty()) {
            System.out.println("Nenhum carro cadastrado!");
            return;
        }

        System.out.println("\n===== Lista de Carros =====");
        for (Veiculo p : listarCarros) {
            p.exibir();
        }
        sc.nextLine();
        System.out.println("Pressione Enter para continuar..");
        sc.nextLine();
    }
    
    public int menu() {

        System.out.println("\n===== Concessionario do Balaco Baco =====");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("3 - Sair");
        System.out.println("===============================");

        return sc.nextInt();
    }
}