package Projetos.Concessionaria;

class Veiculo {

    private String marca;
    private String modelo;
    private double preco;
    private int quantidade;
    private int ano;
    private String combustivel;

    public Veiculo(String marca, String modelo, double preco, int quantidade, int ano, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.quantidade = quantidade;
        this.ano = ano;
        this.combustivel = combustivel;
    }

    public void exibir() {
        System.out.println("===============================");
        System.out.println("Marca: " + getmarca());
        System.out.println("Nome: " + getmodelo());
        System.out.println("Preço: " + getpreco());
        System.out.println("Quantidade: " + getquantidade());
        System.out.println("Ano: " + getano());
        System.out.println("Combustivel Utilizado: " + getcombustivel());
        System.out.println("===============================");
    }
        public String getmarca() {
        return marca;
    }

        public void setmarca(String marca) {
        this.marca = marca;
    }
        public String getmodelo() {
        return modelo;
    }

        public void setmodelo(String modelo) {
        this.modelo = modelo;
    }
        public double getpreco() {
        return preco;
    }

        public void setpreco(double preco) {
        this.preco = preco;
    }
        public int getquantidade() {
        return quantidade;
    }

        public void setquantidade(int quantidade) {
        this.quantidade = quantidade;
    }


        public int getano() {
        return ano;
    }

        public void setano(int ano) {
        this.ano = ano;
    }
        public String getcombustivel() {
        return combustivel;
    }

        public void setcombustivel(String combustivel) {
        this.combustivel = combustivel;
        }
}