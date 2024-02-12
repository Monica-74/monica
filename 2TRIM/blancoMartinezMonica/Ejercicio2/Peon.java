package ejercicio3extra.blancoMartinezMonica.Ejercicio2;

public class Peon extends Pieza {

    public Peon(int filaActual, int columnaActual, Color color) {
        super(filaActual, columnaActual, color);

    }

    public void movimiento(int filaDestino, int columnaDestino) {
        if (getColor() == color.BLANCO) {
            if ((filaDestino == getFilaActual() + 1) && (columnaDestino == getColumnaActual())) {
                setFilaActual(filaDestino);
                setColumnaActual(columnaDestino);
                System.out.println("Sigues avanzando");
            } else {
                System.out.println("Movimiento peón blanco fallido ");
            }
        }else //Color.NEGRO
            if ((filaDestino == getFilaActual() - 1) && (columnaDestino == getColumnaActual())) {
                setFilaActual(filaDestino);
                setColumnaActual(columnaDestino);
                System.out.println("Sigues avanzando");
            } else {
                System.out.println("Movimiento peón negro fallido");
            }
    }
}
