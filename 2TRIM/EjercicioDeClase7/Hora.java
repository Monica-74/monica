package Tema7.EjercicioDeClase7;

public class Hora {
    int hora;
    int minutos;
    int segundos;

    Hora(int hora, int minutos, int segundos){
        setHora(hora);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    public void setMinutos(int minutos) {
            while(minutos>60){
                    this.hora++;
                    minutos = minutos - 60;

            }
        this.minutos = minutos;
    }
    public void setSegundos(int segundos) {
        int auxMinutos = 0;
            while(segundos>60){
                    auxMinutos++;
                    segundos = segundos - 60;
            }
            this.segundos = segundos;
            setMinutos(this.minutos+auxMinutos);

    }

    void mostrarHora(){
        System.out.println("Tu hora es : " + this.hora + ":" + this.minutos + ":" + this.segundos);
    }

}
