package Ejercicio8;
enum Posicion{ Delante, Detrás}
public class Texto {
    int longitudMaxima;
    char caracter;

    String cadena;

    Texto(int longitudMaxima, String cadena){
        this.longitudMaxima = longitudMaxima;
        this.cadena = cadena;

    }

    public void setLongitudMaxima(int longitudMaxima){
        if (longitudMaxima <0)this.longitudMaxima = longitudMaxima;
    }
    void añadirCaracter(int longitudMaxima, char caracter, char caracterPrincipio,char caracterFinal){

        if (longitudMaxima > 30){
            System.out.printf("Lo estás haciendo mal, no hay espacio disponible");
        } else {
            System.out.printf("Añadelo al principio" + caracterPrincipio);
            System.out.printf("Añadelo al principio" + caracterFinal);
        }


    }
}

