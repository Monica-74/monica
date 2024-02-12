/*package ejercicio3extra.herenciaejercicio1;
enum Curso {
    PREESCOLAR ,
    PRIMARIA,
    ESO,
    BACHILLERATO,
    GRADOSUPERIOR,
    GRADOUNIVERSITARIO
}
    public class Alumno extends Persona {
    int edad;
    Curso curso ;

    public Alumno(String nombre,int edad, double estatura){
        super(nombre, edad, estatura);
        setCurso();
    }

        public void setCurso(Curso curso) {
            this.curso = curso;
        }

        public Curso getCurso() {
            return curso;
        }

        Curso CrearCurso (){
        Curso cursoAux= Curso.PREESCOLAR;
        if (getEdad()>=0 && getEdad()<6) cursoAux=Curso.PREESCOLAR;
        else if (getEdad()>=6 && getEdad()<13) cursoAux=Curso.PRIMARIA;
        else if (getEdad()>=13 && getEdad()<16) cursoAux=Curso.ESO;
        else if (getEdad()>=13 && getEdad()<16) cursoAux=Curso.BACHILLERATO;
        else{
            if (universitario)cursoAux=Curso.GRADOSUPERIOR;

        }
        @Override
                void mostrarDatos


    }





}*/
