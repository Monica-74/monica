package ejercicio3extra.blancoMartinezMonica.Ejercicio3;

import java.util.Random;

public class Mago extends Personaje {
    public Mago(String nombre, int nivel) {
        super(nombre, nivel);
        setVida(getVida() + 20);
        setEstadisticas(new int[]{getEstadisticas()[0] - 3, getEstadisticas()[1] + 1, getEstadisticas()[2] + 4});
    }

    @Override
    public void subirDeNivel() {
        Random random = new Random();
        int vidaSubida = random.nextInt(21) + 10;
        int fuerzaSubida = random.nextInt(2);
        int defensaSubida = random.nextInt(2);
        int magiaSubida = random.nextInt(5) + 2;

        setVida(getVida() + vidaSubida);
        setEstadisticas(new int[]{getEstadisticas()[0] - fuerzaSubida, getEstadisticas()[1] + defensaSubida, getEstadisticas()[2] + magiaSubida});

        System.out.println("¡El mago " + getNombre() + " ha subido de nivel!");
        System.out.println("Vida subida: " + vidaSubida);
        System.out.println("Fuerza subida: " + fuerzaSubida);
        System.out.println("Defensa subida: " + defensaSubida);
        System.out.println("Magia subida: " + magiaSubida);
        imprimirInformacion();
    }
}