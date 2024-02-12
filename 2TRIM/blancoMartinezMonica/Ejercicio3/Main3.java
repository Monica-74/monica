package ejercicio3extra.blancoMartinezMonica.Ejercicio3;

public class Main3 {
    public static void main(String[] args) {
        Guerrero guerrero= new Guerrero("Guerrero1", 1);
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
}
