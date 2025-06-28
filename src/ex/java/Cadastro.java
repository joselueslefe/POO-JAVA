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


//import java.util.ArrayList;
//import java.util.Scanner;

//public class Cadastro {
//    public static void main(String[] args) {
//      Scanner scanner = new Scanner(System.in);
//        ArrayList<String> usuarios = new ArrayList<>();

//        System.out.println("Olá, Bem-Vindo à nossa rede!");
//        System.out.print("Digite seu nome: ");
//        String nom = scanner.nextLine();
//
//        System.out.println("Olá " + nom + ", deseja cadastrar usuários?");
//        System.out.println("Digite os nomes de usuários e digite 'OK' ou 'Não' para finalizar:");
//
//        String usuario = scanner.nextLine(); // primeira leitura
//
//        while (!usuario.equalsIgnoreCase("OK") && !usuario.equalsIgnoreCase("Não")) {
//            usuarios.add(usuario);
//            usuario = scanner.nextLine(); // continua lendo até ser OK ou Não
//        }
//
//        System.out.println("\nUsuários cadastrados:");
//        if (usuarios.isEmpty()) {
//            System.out.println("Nenhum usuário foi cadastrado.");
//        } else {
//            for (String u : usuarios) {
//                System.out.println("- " + u);
//            }
//        }
//
//        scanner.close();
//    }
//}
//  * OUTRA FORMA MAIS DETALHADA


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
            ArrayList <String> nomes = new ArrayList<>();
            ArrayList <String> emails = new ArrayList<>();

            boolean ex = true;

            while (ex) {
                System.out.println("=====MENU=====");
                System.out.println("1. CADASTRAR NOVO USUÁRIO");
                System.out.println("2. LISTAR USUÁRIOS CADASTRADOS");
                System.out.println("3. SAIR");
                System.out.println("ESCOLHA");
                int o = scanner.nextInt();
                scanner.nextLine();
                switch (o) {
                    case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o e-mail: ");
                    String email = scanner.nextLine();

                    nomes.add(nome);
                    emails.add(email);

                    System.out.println("Usuário cadastrado com sucesso!");
                    break;

                    case 2:
                    System.out.println("==LISTA DE USUÁRIOS== ");
                    if (nomes.isEmpty()) {
                        System.out.println("Nenhum usuário cadastro! ");
                    } else for (int i = 0; i < nomes.size(); i++) {
                        System.out.println((i + 1) + " - " + nomes.get(i) + " | " + emails.get(i));
                    }
                    case 3:
                        ex = false ;
                        System.out.println("Encerrando o programa... ");
                    default:
                        System.out.println("Opção inválida. Tente novamente.");

                }

            }
            scanner.close();
        }
}