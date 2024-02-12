package ejercicio3extra.blancoMartinezMonica.Ejercicio3;

import java.util.Random;

public Guerrero(String nombre, int nivel) {
    super(nombre, nivel);
    setVida(getVida() + 30);
    this.estadisticas = new int[]{
            super.getEstadisticas()[0] + 3,
            super.getEstadisticas()[1] + 2,
            super.getEstadisticas()[2] - 3};


}
}

@Override
public void subirDeNivel() {
    Random random = new Random();
    int vidaSubida = random.nextInt(21) + 20;
    int fuerzaSubida = random.nextInt(3) + 1;
    int defensaSubida = random.nextInt(2) + 1;
    int magiaSubida = random.nextInt(2);

    this.setVida(this.getVida() + vidaSubida);
    this.getEstadisticas()[0] += fuerzaSubida;
    this.getEstadisticas()[1] += defensaSubida;
    this.getEstadisticas()[2] -= magiaSubida;
    System.out.println("El personaje " + this.getNombre() + " ha subido de nivel.");
    System.out.println("Vida subida: " + vidaSubida);
    System.out.println("Fuerza subida: " + fuerzaSubida);
    System.out.println("Defensa subida: " + defensaSubida);
    System.out.println("Magia subida: " + magiaSubida);
    imprimirInformacion();
}



