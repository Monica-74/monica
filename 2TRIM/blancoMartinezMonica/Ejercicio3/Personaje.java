package blancoMartinezMonica.Ejercicio3;

import java.sql.Array;

public abstract class Personaje {
    protected String nombre;
    public int nivel;
    private int vida;
    private int[] estadisticas;
    private String clase;

    public Personaje(String nombre, int nivel) {

        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = 100;
        this.estadisticas = new int[]{10, 10, 10};
        this.clase = "Personaje";

    }


    public abstract void subirDeNivel();

    public void cambioDeClase(String nuevaClase) {
        if (nuevaClase.equals("Guerrero")) {
            setEstadisticas(new int[]{getEstadisticas()[0] + 3, getEstadisticas()[1] + 2, getEstadisticas()[2] - 3});
        } else if (nuevaClase.equals("Mago")) {
            setEstadisticas(new int[]{getEstadisticas()[0] - 3, getEstadisticas()[1] + 1, getEstadisticas()[2] + 4});
        } else if (nuevaClase.equals("Defensor")) {
            setEstadisticas(new int[]{getEstadisticas()[0] + 1, getEstadisticas()[1] + 4, getEstadisticas()[2] - 3});
        } else {
            System.out.println("La clase que has metido no es válida.");
        }

        this.clase = nuevaClase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getClase() {
        return clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 1 && nivel <= 99) {
            this.nivel = nivel;
        } else {
            System.out.println("El nivel debe estar comprendido entre 1 y 99.");
        }
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida >= 0) {
            this.vida = vida;
        } else {
            System.out.println("La vida no puede ser  negativa.");
        }
    }

    public int[] getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(int[] estadisticas) {
        this.estadisticas = estadisticas;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Estadísticas: ");
        System.out.println("Fuerza: " + getEstadisticas()[0]);
        System.out.println("Defensa: " + getEstadisticas()[1]);
        System.out.println("Magia: " + getEstadisticas()[2]);
    }
}
