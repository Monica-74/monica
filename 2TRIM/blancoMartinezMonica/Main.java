package ejercicio3extra.blancoMartinezMonica;

import blancoMartinezMonica.Ejercicio2.Caballo;
import ejercicio3extra.blancoMartinezMonica.Ejercicio2.Color;
import ejercicio3extra.blancoMartinezMonica.Ejercicio2.Peon;
import ejercicio3extra.blancoMartinezMonica.Ejercicio2.Torre;
import ejercicio3extra.blancoMartinezMonica.Ejercicio3.Defensor;
import ejercicio3extra.blancoMartinezMonica.Ejercicio3.Guerrero;
import ejercicio3extra.blancoMartinezMonica.Ejercicio3.Mago;

import java.util.Scanner;
import java.lang.reflect.Array;

class Main {

    static void ejercicio1() {
    }

    static void ejercicio2() {
        //todo el caballo aparece con un error en color.blanco
            Caballo caballo1 = new Caballo(1, 1, Color.BLANCO);
            caballo1.movimiento(3,2);
            caballo1.movimiento(9,9);
            caballo1.movimiento(6,6);
            System.out.println("PEON");
            Peon peon1 = new Peon(7, 2, Color.NEGRO);
            peon1.movimiento(6,2);
            Peon peon2 = new Peon(2, 2, Color.BLANCO);
            peon2.movimiento(3,2);
            System.out.println("TORRE");
            Torre torre1 = new Torre(1, 1, Color.NEGRO);
            torre1.movimiento(7,6);
            torre1.movimiento(7,1);
            Torre torre2 = new Torre(4, 4, Color.BLANCO);
            torre2.movimiento(3,4);
            torre2.movimiento(4,9);
    }

    static void ejercicio3() {
                Guerrero guerrero = new Guerrero("Guerrero1", 1);
                Mago mago = new Mago("Mago1", 1);
                Defensor defensor = new Defensor("Defensor1", 1);

                guerrero.imprimirInformacion();
                guerrero.subirDeNivel();
                guerrero.imprimirInformacion();

                mago.imprimirInformacion();
                mago.subirDeNivel();
                mago.imprimirInformacion();

                defensor.imprimirInformacion();
                defensor.subirDeNivel();
                defensor.imprimirInformacion();

                guerrero.cambioDeClase("Mago");
                guerrero.imprimirInformacion();

    }


    public static void main(String[] args) {

        boolean programa = true;

        while (programa) {

            System.out.println("---------------------------------------------------------");
            System.out.println("Introduce el nº correspondiente del ejercicio a realizar.");
            System.out.println("1 - Ejercicio 1.");
            System.out.println("2 - Ejercicio 2.");
            System.out.println("3 - Ejercicio 3.");
            System.out.println("0 - Salir del programa");
            System.out.println("---------------------------------------------------------");

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 0 -> programa = false;
                default ->
                        System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }


        }


    }
}