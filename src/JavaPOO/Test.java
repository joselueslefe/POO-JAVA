package JavaPOO;

public class Test {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nome = "José Leslefe";
        p1.idade = 21;
        p1.profissao = "Engenheiro de Software";
        p1.email = "joselueslefelima@gmail.com";

        p2.nome = "FerKp";
        p2.idade = 24;
        p2.profissao = "Engenheira de Software";
        p2.email = "ferkpr@gmail.com";

            p1.Dizeroi();
        System.out.println("Seu nome é: " + p1.nome + "," + "sua idade é: " + p1.idade +","
                + "sua profissão é: " + p1.profissao + "," + "seu email é: " + p1.email);
        System.out.println("__________________________________________________________________");
            p2.Dizeroi();
        System.out.println("Seu nome é: " + p2.nome + "," + "sua idade é: " + p2.idade + ","
                + "sua profissão é: " + p2.profissao + "," + "seu email é: " + p2.email);
        System.out.println("__________________________________________________________________");


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
