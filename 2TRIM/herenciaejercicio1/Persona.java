/*package ejercicio3extra.herenciaejercicio1;

public class Persona {
    public String nombre;
    private int edad;
    double estatura;

    public Persona(String nombre, int edad, double estatura){
        setNombre(nombre);
        setEdad(edad);
        setEstatura(estatura);
    }
    public Persona(String nombre, int edad){
        setNombre(nombre);
        setEdad(edad);
        setEstatura(0);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    String mostrarDatos(String nombre, int edad, double estatura){
        System.out.printf("La información es: "+ getNombre()+ "/n" +getEdad());
        System.out.printf("La estatura es : " + getEdad());
    }
    void incrementarEdad( int edad){
        if (edad >0){
            System.out.println("Imprime la estatura" +edad);
        }else System.out.printf("Has metido datos no correctos");
        edad = ++edad;

    }

}*/
