\# Actividad 4: Matrices Especiales y Decisión Técnica



\---



\## ¿Qué es una Matriz Cuadrada?



Una matriz cuadrada es aquella donde el número de filas es igual al número de columnas.



Notación: Matriz de orden n (n × n)



\### Ejemplos de matrices cuadradas:



Matriz 2×2:



| 1 | 2 |

| 3 | 4 |





Matriz 3×3:



| 1 | 2 | 3 |

| 4 | 5 | 6 |

| 7 | 8 | 9 |





Matriz 4×4:



| 1 | 2 | 3 | 4 |

| 5 | 6 | 7 | 8 |

| 9 | 10 | 11 | 12 |

| 13 | 14 | 15 | 16 |





\### Características principales:

\- Tiene una diagonal principal (elementos donde fila = columna)

\- Puede ser simétrica (si matriz\[i]\[j] = matriz\[j]\[i])

\- Puede ser invertible (si tiene inversa)

\- Permite operaciones especiales como cálculo de determinante



\### Ejemplos en contexto académico:

\- Matriz de aulas × aulas (comparación entre aulas)

\- Matriz de horarios × horarios (comparación entre horarios)

\- Matriz de estudiantes × cursos (si el número es igual)



\---



\## ¿Qué es una Matriz Poco Densa (Sparse Matrix)?



Una matriz poco densa (sparse matrix) es aquella donde la mayoría de elementos son cero o están vacíos, y solo un pequeño porcentaje contiene datos reales.



\### Características:

\- Muchas celdas vacías o con valor cero

\- Pocos elementos con datos significativos

\- Ocupa mucho espacio innecesario en memoria si se guarda como matriz completa



\### Ejemplo - Matriz Poco Densa (10×10 = 100 celdas)

H1  H2  H3  H4  H5  H6  H7  H8  H9 H10



A1 0 0 0 20 0 0 0 0 0 0

A2 0 28 0 0 0 0 0 0 0 0

A3 0 0 0 0 0 32 0 0 0 0

A4 0 0 0 30 0 0 0 14 0 0

A5 0 0 0 0 0 0 0 0 0 0

A6 0 0 0 0 0 0 0 0 0 0

A7 0 0 0 0 0 0 0 0 0 0

A8 0 0 0 0 0 0 0 0 0 0

A9 0 0 0 0 0 0 0 0 0 0

A10 0 0 0 0 0 0 0 0 0 0





Total: 100 celdas

Datos reales: 6 celdas

Celdas vacías: 94 celdas

Densidad: 6% lleno (94% vacío) - Es poco densa



\### Ventajas de identificar matrices poco densas:

\- Ahorra memoria significativamente

\- Aumenta la velocidad de procesamiento

\- Permite optimizar consultas

\- Reduce costos de almacenamiento



\---



\## Ejemplo Académico: Cuándo es Conveniente una Matriz Poco Densa



\### Situación Real



La institución académica tiene capacidad para:

\- 20 aulas disponibles (A1 a A20)

\- 15 bloques horarios (H1 a H15)

\- Matriz completa: 20 × 15 = 300 celdas



Pero en realidad:

\- Solo 8 aulas están en uso durante el semestre

\- Solo 5 horarios tienen clases

\- El resto del espacio está completamente vacío



\### Comparación de almacenamiento



\#### Opción 1: Usando Matriz Completa (20×15)



Código Java:

```java

int\[]\[] ocupacion = new int\[20]\[15];  // Reserva 300 espacios

// Pero solo usa \~40 espacios (8 aulas × 5 horarios)

// Desperdicia 260 espacios en memoria (87% vacío)

```



Consumo de memoria:



300 espacios × 4 bytes (int) = 1,200 bytes

De los cuales solo 160 bytes se usan (40 espacios × 4 bytes)

Desperdicio: 1,040 bytes (86.7%)





\#### Opción 2: Usando Estructura Poco Densa (Lista de ocupaciones)



Código Java:

```java

class Ocupacion {

&#x20;   int aula;

&#x20;   int horario;

&#x20;   int estudiantes;

}



// Almacenar solo los datos reales

Ocupacion\[] datos = new Ocupacion\[40];  // Solo 40 espacios

// Mucho más eficiente

```



Consumo de memoria:



40 ocupaciones × 12 bytes = 480 bytes

Ahorro: 1,200 - 480 = 720 bytes (60% de ahorro)





\### Diferencia de rendimiento



Matriz Completa:



Acceso: O(1) - muy rápido

Búsqueda: O(n×m) - 300 comparaciones

Memoria: 1,200 bytes



Matriz Poco Densa (Lista):



Acceso: O(n) - más lento

Búsqueda: O(n) - 40 comparaciones

Memoria: 480 bytes (60% de ahorro)



\---



\## Justificación Técnica



\### Cuándo usar Matriz Completa



Usar matriz completa cuando:

\- La mayoría de celdas contienen datos (mayor al 30% lleno)

\- El tamaño es pequeño (como nuestro caso 4×5)

\- El acceso directo es crítico

\- La velocidad es más importante que la memoria

\- Los datos se distribuyen uniformemente



Nuestro caso PA1: Matriz 4×5



Datos: 20 celdas, todas llenas

Densidad: 100% lleno

Conclusión: Matriz completa es la opción correcta





\### Cuándo usar Matriz Poco Densa



Usar matriz poco densa cuando:

\- Menos del 10% de las celdas tienen datos

\- La institución es grande pero utiliza poco espacio

\- La memoria es limitada

\- Se necesita escalar a muchas aulas y horarios

\- Los datos se distribuyen de forma dispersa



Ejemplo escalado:



Si la institución crece a 1,000 aulas × 1,000 horarios:



Matriz completa: 1,000,000 celdas

Pero solo usa 10,000 celdas reales (1% lleno)

Desperdicio: 990,000 celdas (99% vacío)

Usar matriz poco densa sería obligatorio



\---



\## Conclusión



Para nuestro caso de 4 aulas × 5 horarios, la matriz completa es la opción adecuada porque:



1\. El tamaño es pequeño (20 celdas)

2\. Todas las celdas contienen datos reales

3\. No hay desperdicio de memoria

4\. El acceso directo es rápido y eficiente

5\. La implementación es simple y clara



Sin embargo, si la institución escalara a 1,000 aulas y solo usara 100 de ellas, entonces sería conveniente implementar una matriz poco densa para optimizar memoria y rendimiento.



Regla práctica:



Si densidad > 30% - Usar matriz completa

Si densidad < 10% - Usar matriz poco densa

Si densidad entre 10-30% - Depende de los requisitos específicos

