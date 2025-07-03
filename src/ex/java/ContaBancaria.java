package ex.java;

//ENCAPSULAMENTO

public class ContaBancaria {
    private int nc;
    private String nomeTitular;
    private float saldo;

    public ContaBancaria(int nc, String nomeTitular, Float saldoInicial) {
        this.nc = nc;
        this.nomeTitular = nomeTitular;
        this.saldo = Math.max(0,saldoInicial);
    }

    public void sacar(float valor) {
            if (valor <= 0) {
                System.out.println("Valor de saque inválido.");
            } else if (valor > saldo) {
                System.out.println("Saldo insuficiente.");
            } else {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado.");


     }
    }

    public void depositar(float valor) {
     if (valor <= 0) {
         System.out.println("Depósito inválido!");
     } else {
       saldo += valor;
         System.out.println("Depósito de R$ " + valor + "realizado!");
     }
    }

    public float getsaldo() {
       return saldo;

    }
}
