/*package ejercicio3extra.Unidad8ejercicio3;

public class HoraExacta extends Hora {
    super(hora,minutos);
    int segundos;

    HoraExacta(int hora, int minutos, int segundos){
       super(hora,minutos);
        setsegundos(segundos);
    }

    private boolean setsegundos(int segundos) {
        boolean aux;
        if(segundos>=0 && segundos <=59){
            this.segundos = segundos;
            aux = true;
        }
        else{
            System.out.println("Segundos erróneos");
            aux = false;
        }
        return aux;
    }


    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public boolean setHora(int hora) {
        boolean aux;
        if(hora>=0 && hora <=23){
            this.hora = hora;
            aux = true;
        }
        else{
            System.out.println("Hora errónea");
            aux = false;
        }
        return aux;
    }

    public boolean setMinutos(int minutos) {
        boolean aux;
        if(minutos>=0 && minutos <=59){
            this.minutos = minutos;
            aux = true;
        }
        else{
            System.out.println("Minutos erróneos");
            aux = false;
        }
        return aux;
    }

    public void inc(){
        if((getSegundos()+1 == 60)){
        } else if ((getMinutos()+1 == 60)) {
        } else if (getHora()+1 != 24){
                setHora(getHora()+1);
            }
            else{
                setHora(0);
            }
            setMinutos(0);
            }
            setSegundos(0);
            }
        else{
            setSegundos(getSegundos()+1);}
        }

    @Override
    public String toString() {
        String cad;
        if(getHora()<10 && getMinutos() <10) cad = "(0" + getHora() + ":0" + getMinutos()+")";
        else if(getHora()<10 && getMinutos() >=10) cad = "(0" + getHora() + ":" + getMinutos()+")";
        else if(getHora()>=10 && getMinutos() <10) cad = "(" + getHora() + ":0" + getMinutos()+")";
        else cad = "(" + getHora() + ":" + getMinutos()+")";
        return cad;
    }
}


}*/
