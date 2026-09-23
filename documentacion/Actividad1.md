\# Actividad 1: Análisis del Problema y selección de Estructura


\## 1. Diferencia entre estructura estática y estructura dinámica

Una estructura de datos estática tiene un tamaño definido antes de ejecutar el programa y este no cambia durante su ejecución. Un ejemplo es el arreglo, porque se establece previamente la cantidad de posiciones que tendrá.

En cambio, una estructura de datos dinámica puede cambiar su tamaño durante la ejecución, dependiendo de la cantidad de información que se necesite almacenar. Un ejemplo es una lista, que puede agregar o quitar elementos.

Para este caso utilizaremos estructuras lineales estáticas, principalmente arreglos y matrices, porque permiten organizar la información de los estudiantes considerando las cantidades de inscritos, las aulas y los bloques horarios.


---


\## 2. ¿Por qué resulta adecuado trabajar con arreglos y matrices?


\### Arreglos

Los arreglos son adecuados para trabajar con las cantidades de estudiantes porque permiten guardar varios valores en posiciones determinadas mediante índices y con un tamaño establecido.

En nuestro caso, el arreglo representa la cantidad de inscritos por taller.

Vector utilizado:

[28, 15, 34, 21, 19, 40, 12, 26]

\### Matrices

Las matrices permiten organizar información considerando dos dimensiones. En nuestro caso, utilizamos:

Filas: aulas.
Columnas: bloques horarios.

Por ello, utilizamos una matriz de 4 filas por 5 columnas:

| | Horario 1 | Horario 2 | Horario 3 | Horario 4 | Horario 5 |
|---|---:|---:|---:|---:|---:|
| Aula 1 | 20 | 15 | 30 | 25 | 18 |
| Aula 2 | 12 | 28 | 22 | 35 | 16 |
| Aula 3 | 25 | 18 | 32 | 20 | 27 |
| Aula 4 | 10 | 24 | 19 | 30 | 14 |

De esta manera podemos representar la cantidad de estudiantes que corresponde a cada aula y horario.

---


\## 3. Relación entre dato, algoritmo y estructura de datos


Estos tres conceptos se relacionan directamente en nuestra solución.

| Concepto | Descripción |
|---|---|
| Dato | Cantidad de estudiantes inscritos |
| Estructura de datos | Arreglo / vector y matriz|
| Algoritmo | Permite procesar los datos |
| Resultado | Información obtenida |

En nuestro caso, primero tenemos los datos de los estudiantes, luego los almacenamos en una estructura y finalmente aplicamos los algoritmos necesarios para obtener los resultados.

