package ejercicio3extra.blancoMartinezMonica.Ejercicio2;

public class Main2 {
    public static void main(String[] args) {
        Caballo caballo1 = new Caballo(1,1,Color.BLANCO);
        caballo1.movimiento(3,2);
        caballo1.movimiento(9,9);
        caballo1.movimiento(6,6);

        System.out.println("PEON");

        Peon peon1 = new Peon(7,2,Color.NEGRO);
        peon1.movimiento(6,2);

        Peon peon2 = new Peon(2,2,Color.BLANCO);
        peon2.movimiento(3,2);

        System.out.println("TORRE");

        Torre torre1 = new Torre(1,1,Color.NEGRO);
        torre1.movimiento(7,6);
        torre1.movimiento(7,1);

        Torre torre2 = new Torre(4,4,Color.BLANCO);
        torre2.movimiento(3,4);
        torre2.movimiento(4,9);
    }
}
