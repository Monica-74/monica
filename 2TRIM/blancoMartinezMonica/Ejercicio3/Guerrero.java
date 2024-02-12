package ejercicio3extra.blancoMartinezMonica.Ejercicio3;

import java.util.Random;

public class Guerrero extends Personaje {
    private int[] estadisticas;

    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
        setVida(getVida() + 30);


        this.estadisticas = new int[]{
                super.getEstadisticas()[0] + 3,
                super.getEstadisticas()[1] + 2,
                super.getEstadisticas()[2] - 3};


    }

    @Override
    public void subirDeNivel() {
        Random random = new Random();
        int vidaSubida = random.nextInt(21) + 20;
        int fuerzaSubida = random.nextInt(3) + 1;
        int defensaSubida = random.nextInt(2) + 1;
        int magiaSubida = random.nextInt(2);

        setVida(getVida() + vidaSubida);
        setEstadisticas(new int[]{getEstadisticas()[0] + fuerzaSubida,
                getEstadisticas()[1] + defensaSubida,
                getEstadisticas()[2] - magiaSubida});

        public void imprimirInformacion () {

            System.out.println("¡El guerrero " + getNombre() + " ha subido de nivel!");
            System.out.println("Vida subida: " + vidaSubida);
            System.out.println("Fuerza subida: " + fuerzaSubida);
            System.out.println("Defensa subida: " + defensaSubida);
            System.out.println("Magia subida: " + magiaSubida);

        }
    }
}
