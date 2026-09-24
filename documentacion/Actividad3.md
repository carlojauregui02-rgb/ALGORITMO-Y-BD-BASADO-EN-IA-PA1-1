# Actividad 3: Matrices y Recorrido Completo de Datos

## 3.1 Matriz Propuesta

La siguiente matriz de 4 × 5 representa la ocupación de aulas en diferentes bloques horarios:

|        | Horario 1 | Horario 2 | Horario 3 | Horario 4 | Horario 5 |
| ------ | --------: | --------: | --------: | --------: | --------: |
| Aula 1 |        20 |        15 |        30 |        25 |        18 |
| Aula 2 |        12 |        28 |        22 |        35 |        16 |
| Aula 3 |        25 |        18 |        32 |        20 |        27 |
| Aula 4 |        10 |        24 |        19 |        30 |        14 |

**Características:**

* Filas = Aulas
* Columnas = Bloques horarios
* Cada celda contiene el número de estudiantes
* Total de celdas = 4 × 5 = **20**

**Código Java:**

```java
int[][] ocupacion = {
    {20, 15, 30, 25, 18},
    {12, 28, 22, 35, 16},
    {25, 18, 32, 20, 27},
    {10, 24, 19, 30, 14}
};
```

---

## 3.2 Filas, Columnas e Índices

### Filas

* Fila 0 = Aula 1
* Fila 1 = Aula 2
* Fila 2 = Aula 3
* Fila 3 = Aula 4

### Columnas

* Columna 0 = Horario 1
* Columna 1 = Horario 2
* Columna 2 = Horario 3
* Columna 3 = Horario 4
* Columna 4 = Horario 5

### Acceso a elementos

Para acceder a una celda se utiliza:

```java
ocupacion[fila][columna]
```

**Ejemplos:**

* `ocupacion[0][0]` = 20
* `ocupacion[1][3]` = 35
* `ocupacion[3][4]` = 14

---

## 3.3 Total de Estudiantes por Aula

Se recorren las filas y se suman los estudiantes de cada horario.

### Resultados

* Aula 1: **108 estudiantes**
* Aula 2: **113 estudiantes**
* Aula 3: **122 estudiantes**
* Aula 4: **97 estudiantes**

**Código Java:**

```java
for (int i = 0; i < ocupacion.length; i++) {

    int totalAula = 0;

    for (int j = 0; j < ocupacion[i].length; j++) {
        totalAula = totalAula + ocupacion[i][j];
    }

    System.out.println("Total del Aula " + (i + 1) + ": " + totalAula);
}
```

---

## 3.4 Total de Estudiantes por Horario

Se recorren las columnas y se suman los estudiantes de cada aula.

### Resultados

* Horario 1: **67 estudiantes**
* Horario 2: **85 estudiantes**
* Horario 3: **103 estudiantes**
* Horario 4: **110 estudiantes**
* Horario 5: **75 estudiantes**

**Código Java:**

```java
for (int j = 0; j < ocupacion[0].length; j++) {

    int totalHorario = 0;

    for (int i = 0; i < ocupacion.length; i++) {
        totalHorario = totalHorario + ocupacion[i][j];
    }

    System.out.println("Total del Horario " + (j + 1) + ": " + totalHorario);
}
```

---

## 3.5 Celda con Mayor Ocupación

Se recorren todas las posiciones de la matriz para encontrar el valor más alto.

### Resultado

* Mayor ocupación: **35 estudiantes**
* Índice: **[1][3]**
* Ubicación: **Aula 2, Horario 4**

**Código Java:**

```java
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
System.out.println("Ubicacion: Aula " + (aulaMayor + 1)
        + ", Horario " + (horarioMayor + 1));
```

---

## 3.6 Recorrido de la Matriz

Para recorrer toda la matriz se utilizan dos ciclos `for`:

```java
for (int i = 0; i < ocupacion.length; i++) {

    for (int j = 0; j < ocupacion[i].length; j++) {

        System.out.println(ocupacion[i][j]);
    }
}
```

El primer ciclo recorre las **filas** y el segundo recorre las **columnas**.

Este recorrido permite:

1. Calcular los totales por aula.
2. Calcular los totales por horario.
3. Encontrar la mayor ocupación.
4. Revisar todos los datos de la matriz.

De esta manera se recorren las **20 posiciones** de la matriz de izquierda a derecha y de arriba hacia abajo.
