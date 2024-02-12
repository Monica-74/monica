package ejercicio3extra.blancoMartinezMonica.Ejercicio1;

public class Ferrari extends Vehiculo {
    private int caballosDeFuerza;

    Ferrari(Color color, int anioDeFabricacion, String modelo, int caballosDeFuerza) {
        super(color, anioDeFabricacion, modelo);
        setCaballosDeFuerza(caballosDeFuerza);
    }

    public void setCaballosDeFuerza(int caballosDeFuerza) {

        this.caballosDeFuerza = caballosDeFuerza;
    }

    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("La marca es : Ferrari");
        System.out.println("El modelo es: " + getModelo());
        System.out.println("Los caballos de fuerza son: " + caballosDeFuerza);
    }
}
