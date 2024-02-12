package ejercicio3extra.blancoMartinezMonica.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Hola, que tal, me das información sobre tu vehículo? \n Empezamos  por el color: ROJO, AZUL, AMARILLO, BLANCO?");
        Color color = Color.valueOf(sc.nextLine());
        System.out.println("Ahora dame el año de fabricación");
        int anioDeFabricacion= sc.nextInt();
        System.out.println("Te falta solo el modelo del vehículo");
        String modelo = sc.next();


        Vehiculo vehiculo = new Vehiculo(color, anioDeFabricacion, modelo);
        vehiculo.mostrarInformacion();

        Color color1= Color.ROJO;
        Color color2= Color.AZUL;
        Color color3= Color.AMARILLO;
        Color color4= Color.BLANCO;

        vehiculo.repintarVehículo();


    }
}

