/*package ejercicio3extra;

import java.util.Scanner;

public class cuentaBancaria {
    String titular;
    double saldo;
    double saldoInicial;
    String mostrarInformacionCuentaBancaria;

    cuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldoInicial = 0.0;
        this.saldo = this.saldo;
        this.mostrarInformacionCuentaBancaria = this.mostrarInformacionCuentaBancaria;
    }

    double depositar(double cantidad) {
        cantidad = this.saldo;
        return cantidad;
    }

    double retirar(double cantidad) {
        double cantidadRetira = 1.0;
        if (cantidad <= 0.0) {
            System.out.println("introduce dinero para retirar");
        } else {
            cantidadRetira = -this.saldo;
        }

        return cantidadRetira;
    }

    double getSaldo() {
        return this.saldo;
    }

    cuentaBancaria crearCuenta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce tu nombre");
        String titular = sc.nextLine();
        System.out.println("Introduce el saldo ");
        double saldo = sc.nextDouble();
        cuentaBancaria cuentaNueva = new cuentaBancaria(titular, saldo);
        return cuentaNueva;
    }
}*/
