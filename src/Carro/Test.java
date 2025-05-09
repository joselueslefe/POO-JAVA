package Carro;

public class Test {
    public static void main(String[] args) {
    Carro carro1 = new Carro();
    Carro carro2 = new Carro();

    carro1.nome = "BMW";
    carro1.ano = 2023;
    carro1.modelo = "BMW";

    carro2.nome = "RANGER";
    carro2.ano = 2022;
    carro2.modelo = "RANGER ROVER";

        System.out.println("Nome: " + carro1.nome + "," + " Ano: " + carro1.ano + "," + " Modelo: " + carro1.modelo);
        System.out.println("Nome: " + carro2.nome + "," + " Ano: " + carro2.ano + "," + " Modelo: " + carro2.modelo);
    }
}
