package JavaPOO;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        Scanner scanner1= new Scanner(System.in);

        System.out.println("Oiii");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu gmail: ");
        String gmail = scanner.nextLine();

        if (gmail.endsWith("gmail.com")) {
            System.out.println("Gmail cadastrado com sucesso!!");
            System.out.println("Seja Bem-Vindo a sua jornada como engenheiro de software!");
        } else {
            System.out.println("O gmail não é válido!");
        }

        System.out.println("Digite um número: ");
        int n1 = scanner1.nextInt();

        System.out.println("Digite outro número: ");
        int n2 = scanner1.nextInt();

        System.out.println("Escolha a operação: (+ , - , * , /)");
        char o = scanner1.next().charAt(0);

        double r = 0;

        switch (o){
            case '+':
                r = n1 + n2;
                break;
            case '-':
                r = n1 - n2;
                break;
            case '*':
                r = n1 * n2;
                break;
            case '/':
                r = n1 / n2;

                if (n2 == 0) {
                    System.out.println("ERROR: não é possível dividir por zero");
                    scanner.close();
                }
                break;
            default:
                System.out.println("Operação inválida");
                scanner.close();

        }

        System.out.println("Resultado: " + r);
        scanner.close();
    }
}
