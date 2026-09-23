# Actividad 4: Matrices Especiales y Decisión Técnica

## 1. ¿Qué es una matriz cuadrada?

Una matriz cuadrada es aquella que tiene la misma cantidad de filas y columnas.

Por ejemplo, una matriz de 3 × 3 tiene 3 filas y 3 columnas:

|   |   |   |
|---|---|---|
| 10 | 20 | 30 |
| 15 | 25 | 35 |
| 12 | 18 | 22 |

En este caso, la matriz es cuadrada porque tiene 3 filas y 3 columnas.

## 2. ¿Qué es una matriz poco densa?

Una matriz poco densa es aquella en la que la mayoría de sus posiciones no contienen datos o tienen valor 0, mientras que solo unas pocas posiciones contienen información.

Por ejemplo:

|   | H1 | H2 | H3 | H4 | H5 |
|---|---:|---:|---:|---:|---:|
| A1 | 0 | 0 | 25 | 0 | 0 |
| A2 | 0 | 0 | 0 | 0 | 0 |
| A3 | 0 | 18 | 0 | 0 | 0 |
| A4 | 0 | 0 | 0 | 0 | 0 |
| A5 | 0 | 0 | 0 | 32 | 0 |

En esta matriz existen muchas posiciones vacías y solamente algunas contienen información.

## 3. Ejemplo aplicado al caso académico

Supongamos que una institución tiene 20 aulas y 15 bloques horarios.

Esto generaría:

20 × 15 = 300 posiciones

Sin embargo, durante un periodo determinado solamente se utilizan 10 aulas y algunos horarios. Por lo tanto, una gran cantidad de posiciones quedarían vacías.

En este caso sería conveniente utilizar una estructura que almacene solamente las ocupaciones que realmente existen, en lugar de reservar las 300 posiciones.

### Justificación

La matriz poco densa sería conveniente porque permitiría evitar el almacenamiento de muchas posiciones que no contienen información.

Además, si la institución aumenta la cantidad de aulas y horarios, se podría ahorrar espacio de memoria al almacenar únicamente los datos que realmente se utilizan.

Por lo tanto, cuando existen muchas posiciones vacías y pocos datos utilizados, una matriz poco densa puede ser una alternativa más conveniente que una matriz completa.
