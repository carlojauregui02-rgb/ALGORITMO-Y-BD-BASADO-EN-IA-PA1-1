\# Actividad 3: Matrices y Recorrido Completo de Datos



\---



\## 3.1 Matriz Propuesta



La siguiente matriz de 4×5 representa la ocupación de aulas en diferentes bloques horarios:

&#x20;    Horario1  Horario2  Horario3  Horario4  Horario5



Aula 1 20 15 30 25 18

Aula 2 12 28 22 35 16

Aula 3 25 18 32 20 27

Aula 4 10 24 19 30 14





\*\*Características:\*\*

\- Filas = Aulas (4 filas, de Aula 1 a Aula 4)

\- Columnas = Bloques horarios (5 columnas, de Horario 1 a Horario 5)

\- Cada celda contiene el número de estudiantes en esa aula y horario

\- Total de celdas = 4 × 5 = 20



\*\*Código Java:\*\*

```java

int\[]\[] ocupacion = {

&#x20;   {20, 15, 30, 25, 18},  // Fila 0 = Aula 1

&#x20;   {12, 28, 22, 35, 16},  // Fila 1 = Aula 2

&#x20;   {25, 18, 32, 20, 27},  // Fila 2 = Aula 3

&#x20;   {10, 24, 19, 30, 14}   // Fila 3 = Aula 4

};

```



\---



\## 3.2 Filas, Columnas e Índices



\### Mapeo de Filas (Aulas)



Fila 0 = Aula 1

Fila 1 = Aula 2

Fila 2 = Aula 3

Fila 3 = Aula 4





\### Mapeo de Columnas (Horarios)



Columna 0 = Horario 1

Columna 1 = Horario 2

Columna 2 = Horario 3

Columna 3 = Horario 4

Columna 4 = Horario 5





\### Acceso a elementos

Para acceder a una celda se usa: `ocupacion\[fila]\[columna]`



\*\*Ejemplos:\*\*

\- `ocupacion\[0]\[0]` = 20 (Aula 1, Horario 1)

\- `ocupacion\[1]\[3]` = 35 (Aula 2, Horario 4)

\- `ocupacion\[3]\[4]` = 14 (Aula 4, Horario 5)



\---



\## 3.3 Algoritmo Total de Estudiantes por Aula



\### Pseudocódigo



ALGORITMO totalPorAula(matriz\[]\[], filas, columnas)

ENTRADA: matriz de ocupación, cantidad de filas y columnas

SALIDA: total de estudiantes por cada aula



PARA i = 0 HASTA filas-1 HACER

&#x20;   totalAula ← 0

&#x20;   

&#x20;   PARA j = 0 HASTA columnas-1 HACER

&#x20;       totalAula ← totalAula + matriz\[i]\[j]

&#x20;   FIN PARA

&#x20;   

&#x20;   IMPRIMIR "Total del Aula " + (i+1) + ": " + totalAula

FIN PARA



FIN ALGORITMO





\### Explicación



1\. El ciclo externo recorre cada fila (cada aula)

2\. Para cada aula, se inicializa un acumulador en 0

3\. El ciclo interno recorre todas las columnas (todos los horarios)

4\. Se suma el valor de cada celda al total

5\. Al terminar la fila, se imprime el total de esa aula



\### Resultados



Total del Aula 1: 20 + 15 + 30 + 25 + 18 = 108 estudiantes

Total del Aula 2: 12 + 28 + 22 + 35 + 16 = 113 estudiantes

Total del Aula 3: 25 + 18 + 32 + 20 + 27 = 122 estudiantes

Total del Aula 4: 10 + 24 + 19 + 30 + 14 = 97 estudiantes





\*\*Código Java:\*\*

```java

for (int i = 0; i < ocupacion.length; i++) {

&#x20;   int totalAula = 0;

&#x20;   for (int j = 0; j < ocupacion\[i].length; j++) {

&#x20;       totalAula = totalAula + ocupacion\[i]\[j];

&#x20;   }

&#x20;   System.out.println("Total del Aula " + (i + 1) + ": " + totalAula);

}

```



\---



\## 3.4 Algoritmo Total de Estudiantes por Horario



\### Pseudocódigo



ALGORITMO totalPorHorario(matriz\[]\[], filas, columnas)

ENTRADA: matriz de ocupación, cantidad de filas y columnas

SALIDA: total de estudiantes por cada horario



PARA j = 0 HASTA columnas-1 HACER

&#x20;   totalHorario ← 0

&#x20;   

&#x20;   PARA i = 0 HASTA filas-1 HACER

&#x20;       totalHorario ← totalHorario + matriz\[i]\[j]

&#x20;   FIN PARA

&#x20;   

&#x20;   IMPRIMIR "Total del Horario " + (j+1) + ": " + totalHorario

FIN PARA



FIN ALGORITMO





\### Explicación



1\. El ciclo externo recorre cada columna (cada horario)

2\. Para cada horario, se inicializa un acumulador en 0

3\. El ciclo interno recorre todas las filas (todas las aulas)

4\. Se suma el valor de cada celda al total

5\. Al terminar la columna, se imprime el total de ese horario



\### Resultados



Total del Horario 1: 20 + 12 + 25 + 10 = 67 estudiantes

Total del Horario 2: 15 + 28 + 18 + 24 = 85 estudiantes

Total del Horario 3: 30 + 22 + 32 + 19 = 103 estudiantes

Total del Horario 4: 25 + 35 + 20 + 30 = 110 estudiantes

Total del Horario 5: 18 + 16 + 27 + 14 = 75 estudiantes





\*\*Código Java:\*\*

```java

for (int j = 0; j < ocupacion\[0].length; j++) {

&#x20;   int totalHorario = 0;

&#x20;   for (int i = 0; i < ocupacion.length; i++) {

&#x20;       totalHorario = totalHorario + ocupacion\[i]\[j];

&#x20;   }

&#x20;   System.out.println("Total del Horario " + (j + 1) + ": " + totalHorario);

}

```



\---



\## 3.5 Algoritmo Celda con Mayor Ocupación



\### Pseudocódigo



ALGORITMO encontrarMayorOcupacion(matriz\[]\[], filas, columnas)

ENTRADA: matriz de ocupación, cantidad de filas y columnas

SALIDA: valor mayor, fila y columna de la celda con mayor ocupación



mayor ← matriz\[0]\[0]

aulaMayor ← 0

horarioMayor ← 0



PARA i = 0 HASTA filas-1 HACER

&#x20;   PARA j = 0 HASTA columnas-1 HACER

&#x20;       SI matriz\[i]\[j] > mayor ENTONCES

&#x20;           mayor ← matriz\[i]\[j]

&#x20;           aulaMayor ← i

&#x20;           horarioMayor ← j

&#x20;       FIN SI

&#x20;   FIN PARA

FIN PARA



IMPRIMIR "Mayor ocupacion: " + mayor + " estudiantes"

IMPRIMIR "Indice de la celda: \[" + aulaMayor + "]\[" + horarioMayor + "]"

IMPRIMIR "Ubicacion: Aula " + (aulaMayor+1) + ", Horario " + (horarioMayor+1)



FIN ALGORITMO





\### Explicación



1\. Se inicializa el mayor con el primer elemento de la matriz

2\. Se recorren todas las filas y columnas

3\. En cada celda, se compara con el mayor actual

4\. Si es mayor, se actualiza el valor y se guardan sus coordenadas

5\. Al terminar, se imprime el resultado con índices y ubicación



\### Resultado



Mayor ocupacion: 35 estudiantes

Indice de la celda: \[1]\[3]

Ubicacion: Aula 2, Horario 4





\*\*Código Java:\*\*

```java

int mayor = ocupacion\[0]\[0];

int aulaMayor = 0;

int horarioMayor = 0;



for (int i = 0; i < ocupacion.length; i++) {

&#x20;   for (int j = 0; j < ocupacion\[i].length; j++) {

&#x20;       if (ocupacion\[i]\[j] > mayor) {

&#x20;           mayor = ocupacion\[i]\[j];

&#x20;           aulaMayor = i;

&#x20;           horarioMayor = j;

&#x20;       }

&#x20;   }

}



System.out.println("Mayor ocupacion: " + mayor + " estudiantes");

System.out.println("Indice de la celda: \[" + aulaMayor + "]\[" + horarioMayor + "]");

System.out.println("Ubicacion: Aula " + (aulaMayor + 1) + ", Horario " + (horarioMayor + 1));

```



\---



\## 3.6 Recorrido de la Matriz



\### Explicación



Se utilizan dos ciclos for anidados para recorrer la matriz:



1\. \*\*Ciclo externo (filas):\*\* Recorre las filas que representan las aulas

2\. \*\*Ciclo interno (columnas):\*\* Recorre las columnas que representan los bloques horarios



\### ¿Por qué es necesario recorrer varias posiciones?



Es necesario recorrer varias posiciones de la matriz para:



1\. \*\*Calcular totales por aula:\*\* Requiere sumar todos los elementos de una fila (5 elementos por cada aula)

2\. \*\*Calcular totales por horario:\*\* Requiere sumar todos los elementos de una columna (4 elementos por cada horario)

3\. \*\*Encontrar la celda con mayor ocupación:\*\* Requiere comparar todos los elementos (20 elementos totales)

4\. \*\*Validar datos:\*\* Es posible necesitar revisar múltiples celdas para análisis



Sin recorrer múltiples posiciones, no podríamos obtener información agregada o comparativa de los datos.



\### Patrón de recorrido común



PARA i = 0 HASTA filas-1 HACER

PARA j = 0 HASTA columnas-1 HACER

// Procesar matriz\[i]\[j]

FIN PARA

FIN PARA





Este patrón recorre la matriz de izquierda a derecha, de arriba hacia abajo, accediendo a cada celda exactamente una vez.

