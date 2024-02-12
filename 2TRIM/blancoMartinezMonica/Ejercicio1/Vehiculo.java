package ejercicio3extra.blancoMartinezMonica.Ejercicio1;

import java.util.Scanner;
import java.lang.reflect.Array;

public class Vehiculo {
    Color color;
    private final int anioDeFabricacion;
    protected String modelo;

    Vehiculo(Color color, int anioDeFabricacion, String modelo) {

        setColor(color);
        this.anioDeFabricacion = anioDeFabricacion;
        setModelo(modelo);

    }


    public void setModelo(String modelo) {

        this.modelo = modelo;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public String getModelo() {
        return modelo;
    }

    public Color getColor() {
        return color;
    }

    void mostrarInformacion() {
        String informacionVehiculo;
        informacionVehiculo = " su color es " + color + " ," + " se fabricó el año " + anioDeFabricacion + " y el modelo " + modelo + ".";
        System.out.println("Esta es la información de tu vehículo :" + informacionVehiculo);
    }

    void repintarVehículo() {
        //String nuevoColor = "";
        System.out.println("vamos a repintar el coche, estos son los colores: ");
        for (var color : Color.values()) {
            if (color.ordinal() !=
                    Color.values().length - 1) {
                System.out.print(color.nombreColor + " ");
            } else {
                System.out.println(color.nombreColor);
            }
        }

        Scanner sc = new Scanner(System.in);
        color = Color.valueOf(sc.nextLine()); //convierto un String a un enum

        System.out.println("el vehículo ha sido repintado de color " + color.nombreColor);
    }
}
