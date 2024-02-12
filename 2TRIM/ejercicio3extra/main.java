package ejercicio3extra;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cuentaBancaria = sc.nextLine();
        System.out.println("Introduce tu numero de cuenta" + cuentaBancaria);
        double saldo = sc.nextDouble();
        System.out.println("Introduce tu saldo");
    }
}
