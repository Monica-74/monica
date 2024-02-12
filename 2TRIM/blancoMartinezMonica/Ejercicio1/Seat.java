package ejercicio3extra.blancoMartinezMonica.Ejercicio1;

public class Seat extends Vehiculo {
    private String tipoCombustible;


    Seat(Color color, int anioDeFabricacion, String modelo) {
        super(color, anioDeFabricacion, modelo);
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }


}
