package Ejercicio1;

public class Lista {
    private Integer[] tabla;
    private int size;

    public Lista() {
        tabla = new Integer[0];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void insertarAlFinal(Integer numero) {
        redimensionarTabla(size + 1);
        tabla[size - 1] = numero;
    }

    public void insertarAlPrincipio(Integer numero) {
        redimensionarTabla(size + 1);
        for (int i = size - 1; i > 0; i--) {
            tabla[i] = tabla[i - 1];
        }
        tabla[0] = numero;
    }

    public void insertarEnIndice(Integer numero, int indice) {
        if (indice < 0 || indice > size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        redimensionarTabla(size + 1);
        for (int i = size - 1; i > indice; i--) {
            tabla[i] = tabla[i - 1];
        }
        tabla[indice] = numero;
    }

    public void añadirListaAlFinal(Lista otraLista) {
        redimensionarTabla(size + otraLista.getSize());
        for (int i = 0; i < otraLista.getSize(); i++) {
            tabla[size - otraLista.getSize() + i] = otraLista.getElemento(i);
        }
    }

    public void eliminarPorIndice(int indice) {
        if (indice < 0 || indice >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        for (int i = indice; i < size - 1; i++) {
            tabla[i] = tabla[i + 1];
        }
        redimensionarTabla(size - 1);
    }

    public Integer getElemento(int indice) {
        if (indice < 0 || indice >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return tabla[indice];
    }

    public int buscarNumero(Integer numero) {
        for (int i = 0; i < size; i++) {
            if (tabla[i].equals(numero)) {
                return i;
            }
        }
        return -1;
    }

    public void mostrarElementos() {
        for (int i = 0; i < size; i++) {
            System.out.println(tabla[i]);
        }
    }

    private void redimensionarTabla(int nuevaCapacidad) {
        Integer[] nuevaTabla = new Integer[nuevaCapacidad];
        int copiarElementos = Math.min(size, nuevaCapacidad);
        for (int i = 0; i < copiarElementos; i++) {
            nuevaTabla[i] = tabla[i];
        }
        tabla = nuevaTabla;
        size = nuevaCapacidad;
    }
}