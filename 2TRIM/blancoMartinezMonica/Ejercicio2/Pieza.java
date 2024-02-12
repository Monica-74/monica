package ejercicio3extra.blancoMartinezMonica.Ejercicio2;

public abstract class Pieza {

    int filaActual;
    int columnaActual;
    boolean estado;
    int columnaDestino;
    Color color;

    Pieza (int filaActual,int columnaActual, Color color){
        setFilaActual(filaActual);
        setColumnaActual(columnaActual);
        setEstado(true);
        setColor(color);
    }

    public abstract void movimiento(int filaDestino, int columnaDestino);

    public void setColor(Color color) {
        this.color = color;
    }

    public void setColumnaActual(int columnaActual) {
        this.columnaActual = columnaActual;
    }

    public void setFilaActual(int filaActual) {
        this.filaActual = filaActual;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public int getFilaActual() {
        return filaActual;
    }

    public int getColumnaActual() {
        return columnaActual;
    }

    public Color getColor() {
        return color;
    }

    public boolean getEstado() {
        return estado;
    }
    public void imprimirInformacion(){
        System.out.printf("El color de la pieza es : " + getColor());
        System.out.printf("El estado de la pieza es : " + getEstado());
        System.out.printf("La pieza está en esta columna: " + getColumnaActual());
        System.out.printf("La pieza está en esta fila: " + getFilaActual());

    }
}