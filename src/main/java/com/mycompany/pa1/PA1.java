package com.mycompany.pa1;

import java.util.Scanner;

public class PA1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // ============================================================
        // ACTIVIDAD 2: VECTORES
        // ============================================================

        System.out.println("============================================================");
        System.out.println("                ACTIVIDAD 2: VECTORES");
        System.out.println("============================================================");
        System.out.println();

        // Vector de la Actividad 2
        int[] inscritos = new int[15]; // Capacidad reservada
        int[] datosIniciales = {28, 15, 34, 21, 19, 40, 12, 26};
        int usados = datosIniciales.length;

        // Copia de los datos iniciales al arreglo principal
        for (int i = 0; i < usados; i++) {
            inscritos[i] = datosIniciales[i];
        }

        // 2.1 Representacion del vector
        ejemploRepresentar(inscritos, usados);

        // 2.2 Mayor y menor
        ejemploMaximoMinimo(inscritos, usados);

        // 2.3 Insercion de un nuevo valor
        System.out.println("-------------------- 2.3 INSERCION DE UN ELEMENTO --------------------");

        System.out.print("Ingrese el nuevo valor: ");
        int valor = entrada.nextInt();

        System.out.print("Ingrese la posicion donde desea insertarlo: ");
        int posicion = entrada.nextInt();

        if (posicion >= 0 && posicion <= usados && usados < inscritos.length) {
            usados = ejemploInsertar(inscritos, usados, posicion, valor);
        } else {
            System.out.println("Posicion no valida o capacidad maxima alcanzada.");
            System.out.println();
        }

        // 2.4 Ordenamiento ascendente
        ejemploBurbuja(inscritos, usados);

        // 2.5 Eficiencia
        ejemploEficiencia();

        // ============================================================
        // ACTIVIDAD 3: MATRICES
        // ============================================================

        actividad3Matriz();

        // No cerramos Scanner porque System.in sigue siendo utilizado
        // por el programa.
    }

    // ============================================================
    // 2.1 REPRESENTACION E INDICES
    // ============================================================
    public static void ejemploRepresentar(int[] notas, int usados) {

        System.out.println("-------------------- 2.1 REPRESENTACION E INDICES --------------------");

        for (int i = 0; i < usados; i++) {
            System.out.println("Indice " + i + " -> Valor: " + notas[i]);
        }

        System.out.println();
    }

    // ============================================================
    // 2.2 MAXIMO Y MINIMO
    // ============================================================
    public static void ejemploMaximoMinimo(int[] notas, int usados) {

        System.out.println("-------------------- 2.2 MAXIMO Y MINIMO --------------------");

        int max = notas[0];
        int min = notas[0];

        for (int i = 1; i < usados; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }

            if (notas[i] < min) {
                min = notas[i];
            }
        }

        System.out.println("Mayor cantidad de inscritos: " + max);
        System.out.println("Menor cantidad de inscritos: " + min);
        System.out.println();
    }

    // ============================================================
    // 2.3 INSERCION DE UN ELEMENTO
    // ============================================================
    public static int ejemploInsertar(
        int[] notas,
        int usados,
        int posicion,
        int valor
    ) {

        for (int i = usados; i > posicion; i--) {

            notas[i] = notas[i - 1];
        }

        notas[posicion] = valor;
        usados++;

        System.out.println("Se inserto " + valor + " en el indice " + posicion);
        System.out.println("Vector despues de la insercion:");

        ejemploUsados(notas, usados);
        System.out.println();

        return usados;
    }

    // ============================================================
    // 2.4 ORDENAMIENTO ASCENDENTE - BURBUJA
    // ============================================================
    public static void ejemploBurbuja(int[] notas, int usados) {

        System.out.println("-------------------- 2.4 ORDENAMIENTO ASCENDENTE --------------------");

        for (int i = 0; i < usados - 1; i++) {
            for (int j = 0; j < usados - 1 - i; j++) {
                if (notas[j] > notas[j + 1]) {
                    int aux = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = aux;
                }
            }
        }

        System.out.println("Vector ordenado de menor a mayor:");
        ejemploUsados(notas, usados);
        System.out.println();
    }

    // ============================================================
    // METODO AUXILIAR PARA MOSTRAR ELEMENTOS
    // ============================================================
    public static void ejemploUsados(int[] datos, int usados) {

        System.out.print("[");

        for (int i = 0; i < usados; i++) {

            System.out.print(
                datos[i] + (i < usados - 1 ? ", " : "")
            );
        }

        System.out.println("]");
    }

    // ============================================================
    // 2.5 EFICIENCIA DEL ORDENAMIENTO
    // ============================================================
    public static void ejemploEficiencia() {

        System.out.println("-------------------- 2.5 EFICIENCIA DEL ORDENAMIENTO --------------------");
        System.out.println("Metodo utilizado: Ordenamiento Burbuja");
        System.out.println("Mejor caso: O(n^2)");
        System.out.println("Peor caso: O(n^2)");
        System.out.println("El algoritmo utiliza dos ciclos para realizar las comparaciones entre los elementos.");
        System.out.println("Cuando un elemento es mayor que el siguiente, se realiza un intercambio.");
        System.out.println();
    }

    // ============================================================
    // ACTIVIDAD 3: MATRICES
    // ============================================================
    public static void actividad3Matriz() {

        System.out.println();
        System.out.println("============================================================");
        System.out.println("                ACTIVIDAD 3: MATRICES");
        System.out.println("============================================================");
        System.out.println();

        // Filas = aulas
        // Columnas = bloques horarios
        int[][] ocupacion = {
            {20, 15, 30, 25, 18},
            {12, 28, 22, 35, 16},
            {25, 18, 32, 20, 27},
            {10, 24, 19, 30, 14}
        };

        // ========================================================
        // 3.1 MATRIZ PROPUESTA
        // ========================================================
        System.out.println("-------------------- 3.1 MATRIZ PROPUESTA --------------------");
        System.out.println("Filas = Aulas");
        System.out.println("Columnas = Bloques horarios");
        System.out.println();
        System.out.println("          Col 0   Col 1   Col 2   Col 3   Col 4");

        for (int i = 0; i < ocupacion.length; i++) {
            System.out.print("Fila " + i + "     ");
            for (int j = 0; j < ocupacion[i].length; j++) {
                System.out.print(ocupacion[i][j] + "\t  ");
            }
            System.out.println();
        }

        System.out.println();

        // ========================================================
        // 3.2 FILAS, COLUMNAS E INDICES
        // ========================================================
        System.out.println("-------------------- 3.2 FILAS, COLUMNAS E INDICES --------------------");

        System.out.println("Fila 0 = Aula 1");
        System.out.println("Fila 1 = Aula 2");
        System.out.println("Fila 2 = Aula 3");
        System.out.println("Fila 3 = Aula 4");
        System.out.println();

        System.out.println("Columna 0 = Horario 1");
        System.out.println("Columna 1 = Horario 2");
        System.out.println("Columna 2 = Horario 3");
        System.out.println("Columna 3 = Horario 4");
        System.out.println("Columna 4 = Horario 5");
        System.out.println();

        // ========================================================
        // 3.3 TOTAL DE ESTUDIANTES POR AULA
        // ========================================================
        System.out.println("-------------------- 3.3 TOTAL DE ESTUDIANTES POR AULA --------------------");

        for (int i = 0; i < ocupacion.length; i++) {
            int totalAula = 0;
            for (int j = 0; j < ocupacion[i].length; j++) {
                totalAula = totalAula + ocupacion[i][j];
            }
            System.out.println("Total del Aula " + (i + 1) + ": " + totalAula);
        }

        System.out.println();

        // ========================================================
        // 3.4 TOTAL DE ESTUDIANTES POR HORARIO
        // ========================================================
        System.out.println("-------------------- 3.4 TOTAL DE ESTUDIANTES POR HORARIO --------------------");

        for (int j = 0; j < ocupacion[0].length; j++) {
            int totalHorario = 0;
            for (int i = 0; i < ocupacion.length; i++) {
                totalHorario = totalHorario + ocupacion[i][j];
            }
            System.out.println("Total del Horario " + (j + 1) + ": " + totalHorario);
        }

        System.out.println();

        // ========================================================
        // 3.5 CELDA CON MAYOR OCUPACION
        // ========================================================
        System.out.println("-------------------- 3.5 CELDA CON MAYOR OCUPACION --------------------");

        int mayor = ocupacion[0][0];
        int aulaMayor = 0;
        int horarioMayor = 0;

        for (int i = 0; i < ocupacion.length; i++) {
            for (int j = 0; j < ocupacion[i].length; j++) {
                if (ocupacion[i][j] > mayor) {
                    mayor = ocupacion[i][j];
                    aulaMayor = i;
                    horarioMayor = j;
                }
            }
        }

        System.out.println("Mayor ocupacion: " + mayor + " estudiantes");
        System.out.println("Indice de la celda: [" + aulaMayor + "][" + horarioMayor + "]");
        System.out.println("Ubicacion: Aula " + (aulaMayor + 1) + ", Horario " + (horarioMayor + 1));
        System.out.println();

        // ========================================================
        // 3.6 RECORRIDO DE LA MATRIZ
        // ========================================================
        System.out.println("-------------------- 3.6 RECORRIDO DE LA MATRIZ --------------------");
        System.out.println("Se utilizan dos ciclos for para recorrer la matriz.");
        System.out.println("El primer ciclo recorre las filas, que representan las aulas.");
        System.out.println("El segundo ciclo recorre las columnas, que representan los bloques horarios.");
        System.out.println("Es necesario recorrer varias posiciones de la matriz para calcular los totales por aula, los totales por horario y encontrar la celda con mayor ocupacion.");
        System.out.println();
    }
}