package ex.java;

//import java.util.ArrayList;
//import java.util.Scanner;

//
//Salva os dados dos usuários em memória (nome + e-mail)
//
//Repete o menu até o usuário escolher "Sair"

//public class Cadastro {
// public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList <String> Usuarios = new ArrayList<>();
//
//       System.out.println("Olá, Bem-Vindo a nossa rede!");
//     System.out.println("Digite seu nome: ");
//    String nome = scanner.nextLine();
//
//        System.out.println("Olá " + nome + ", Deseja cadastrar Usuário? Digite Não caso não queira. ");
//      String usuario = scanner.nextLine();
//     System.out.println("Digite os nomes de usuários e depois OK para finalizar:");
//    while (!usuario.equals("OK")&&(!usuario.equals("Não"))) {
//       String Usuario = scanner.nextLine();
//      Usuarios.add(Usuario);
//     Usuario = scanner.nextLine();
//  }
//
//
//     System.out.println("Usuários cadastrados:");
//    for (String u : Usuarios) {
//       System.out.println(u);
//    }
//
//       scanner.close();
//   }
//}
//Exibe um menu com opções:
//
//1️⃣ Cadastrar novo usuário
//
//2️⃣ Listar usuários cadastrados
//
//3️⃣ Sair


import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> usuarios = new ArrayList<>();

        System.out.println("Olá, Bem-Vindo à nossa rede!");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + ", deseja cadastrar usuários?");
        System.out.println("Digite os nomes de usuários e digite 'OK' ou 'Não' para finalizar:");

        String usuario = scanner.nextLine(); // primeira leitura

        while (!usuario.equalsIgnoreCase("OK") && !usuario.equalsIgnoreCase("Não")) {
            usuarios.add(usuario);
            usuario = scanner.nextLine(); // continua lendo até ser OK ou Não
        }

        System.out.println("\nUsuários cadastrados:");
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário foi cadastrado.");
        } else {
            for (String u : usuarios) {
                System.out.println("- " + u);
            }
        }

        scanner.close();
    }
}

