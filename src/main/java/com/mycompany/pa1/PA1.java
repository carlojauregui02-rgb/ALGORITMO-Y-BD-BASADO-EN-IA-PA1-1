package com.mycompany.pa1;

public class PA1 {

    public static void main(String[] args) {
        System.out.println("===== ACTIVIDAD 2: VECTORES =====");
        
        // Vector de la Actividad 2
        int[] inscritos = new int[15]; // Capacidad reservada
        int[] datosIniciales = {28, 15, 34, 21, 19, 40, 12, 26};
        int usados = datosIniciales.length; // 8 elementos

        // Copia de los datos iniciales al arreglo principal
        for (int i = 0; i < usados; i++) {
            inscritos[i] = datosIniciales[i];
        }

        // Ejecución de métodos
        ejemploRepresentar(inscritos, usados);
        ejemploMaximoMinimo(inscritos, usados);
        usados = ejemploInsertar(inscritos, usados, 2, 99); // Ejemplo: inserta 99 en el índice 2
        ejemploBurbuja(inscritos, usados);
    }

    // 1. Representación gráfica e índices
    public static void ejemploRepresentar(int[] notas, int usados) {
        System.out.println("\n===== REPRESENTACIÓN E ÍNDICES =====");
        for (int i = 0; i < usados; i++) {
            System.out.println("En el índice " + i + " se encuentra el valor: " + notas[i]);
        }
    }

    // 2. Hallar Máximo y Mínimo
    public static void ejemploMaximoMinimo(int[] notas, int usados) {
        System.out.println("\n===== MÁXIMO Y MÍNIMO =====");
        int max = notas[0];
        int min = notas[0];

        for (int i = 1; i < usados; i++) {
            if (notas[i] > max) max = notas[i];
            if (notas[i] < min) min = notas[i];
        }

        System.out.println("Mayor cantidad de inscritos: " + max);
        System.out.println("Menor cantidad de inscritos: " + min);
    }

    // 3. Inserción de un valor
    public static int ejemploInsertar(int[] notas, int usados, int posicion, int valor) {
        System.out.println("\n===== INSERCIÓN DE UN ELEMENTO =====");
        for (int i = usados; i > posicion; i--) {
            notas[i] = notas[i - 1];
        }
        notas[posicion] = valor;
        usados++;

        System.out.println("Se insertó " + valor + " en el índice " + posicion);
        ejemploUsados(notas, usados);
        return usados;
    }

    // 4. Ordenamiento Burbuja
    public static void ejemploBurbuja(int[] notas, int usados) {
        System.out.println("\n===== ORDENAMIENTO BURBUJA =====");
        for (int i = 0; i < usados - 1; i++) {
            for (int j = 0; j < usados - 1 - i; j++) {
                if (notas[j] > notas[j + 1]) {
                    int aux = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = aux;
                }
            }
        }
        System.out.print("Vector ordenado de menor a mayor: ");
        ejemploUsados(notas, usados);
    }

    // Método auxiliar para mostrar elementos activos
    public static void ejemploUsados(int[] datos, int usados) {
        System.out.print("[");
        for (int i = 0; i < usados; i++) {
            System.out.print(datos[i] + (i < usados - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}