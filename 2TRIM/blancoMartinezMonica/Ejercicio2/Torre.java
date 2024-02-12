package ejercicio3extra.blancoMartinezMonica.Ejercicio2;
public class Torre extends Pieza {
    public Torre(int filaActual,int columnaActual, Color color){
        super(filaActual,columnaActual,color);
    }

    @Override
    public void movimiento(int filaDestino, int columnaDestino) {
        if ((filaDestino >= 0 && filaDestino <= 7) && (columnaDestino >= 0 && columnaDestino <= 7)){
            if (filaDestino== getFilaActual() || columnaDestino == getColumnaActual()) {
                setFilaActual(filaDestino);
                setColumnaActual(columnaDestino);
                System.out.println("Movimiento correcto");
            }else System.out.println("El movimiento es fallido");
        }else System.out.println("El movimiento esta fuera del tablero");
    }
}