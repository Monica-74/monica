package ejercicio3extra.blancoMartinezMonica.Ejercicio2;

import ejercicio3extra.blancoMartinezMonica.Ejercicio2.Pieza;

public class Caballo extends Pieza {
    public Caballo(int filaActual,int columnaActual, Color color){
        super(filaActual, columnaActual, color);

    }

    @Override
    public void movimiento(int filaDestino, int columnaDestino) {
        int filaDiferencia = filaDestino - getFilaActual();
        int columnaDiferencia = columnaDestino - getColumnaActual();
        //if para comprobar que esta dentro del tablero
        if ((filaDestino >= 0 && filaDestino <= 7) && (columnaDestino >= 0 && columnaDestino <= 7)) {
            if ((filaDiferencia == 2 && columnaDiferencia == 1) || (filaDiferencia == 1 && columnaDiferencia == 2)) {
              setFilaActual(filaDestino);
              setColumnaActual(columnaDestino);
                System.out.println("El movimiento es válido");
            } else System.out.println("Movimiento no valido");
        } else System.out.println("Movimiento fuera del tablero");
    }
}
