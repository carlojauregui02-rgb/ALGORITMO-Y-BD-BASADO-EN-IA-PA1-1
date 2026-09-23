\# Actividad 1: Análisis del Problema y Selección de Estructura



\## 1. Diferencia entre estructura estática y estructura dinámica



Una \*\*estructura de datos estática\*\* tiene un \*\*tamaño fijo\*\* que se establece previamente y se mantiene durante la ejecución del programa. Un ejemplo es el arreglo, ya que se conoce de antemano la cantidad de posiciones que tendrá para almacenar información. Además, permite acceder directamente a una posición determinada.



Por otro lado, una \*\*estructura de datos dinámica\*\* puede \*\*variar su tamaño\*\* de acuerdo con la cantidad de información que se necesite almacenar. Un ejemplo es la lista, porque puede aumentar o disminuir la cantidad de elementos durante la ejecución del programa.



Para el caso planteado, se utilizarán \*\*estructuras lineales estáticas\*\*, debido a que esta primera etapa del sistema trabajará con este tipo de estructuras para organizar la información de los talleres estudiantiles.



\---



\## 2. ¿Por qué resulta adecuado trabajar con arreglos y matrices?



\### Arreglos



Los arreglos resultan adecuados porque permiten:

\- Almacenar un conjunto finito y ordenado de elementos homogéneos

\- Identificar cada elemento mediante una posición o índice

\- Establecer el tamaño previamente



En el caso de los arreglos, permiten representar la cantidad de inscritos por taller y trabajar con estos datos mediante operaciones como:

\- Encontrar el valor mayor y menor

\- Insertar un nuevo valor

\- Ordenar la información



\*\*Vector utilizado:\*\* \[28, 15, 34, 21, 19, 40, 12, 26]



\### Matrices



Las matrices resultan adecuadas para representar la distribución de estudiantes considerando \*\*dos aspectos del problema\*\*:

\- Las aulas (filas)

\- Los bloques horarios (columnas)



Por ello, se plantea una \*\*matriz de 4 filas por 5 columnas\*\* para representar la ocupación de las aulas según los horarios:



&#x20;        Horario1  Horario2  Horario3  Horario4  Horario5

Aula 1      20        15        30        25        18

Aula 2      12        28        22        35        16

Aula 3      25        18        32        20        27

Aula 4      10        24        19        30        14







\---



\## 3. Relación entre dato, algoritmo y estructura de datos



El \*\*dato\*\* es la información sobre la cual trabaja el algoritmo. El \*\*algoritmo\*\* es una secuencia ordenada de pasos que conduce a la solución de un problema, mientras que la \*\*estructura de datos\*\* permite organizar la información para que pueda ser procesada.



En la solución propuesta, la relación entre estos conceptos puede representarse de la siguiente manera:



DATO

Cantidad de estudiantes inscritos

&#x20;       ↓

ESTRUCTURA DE DATOS

Arreglo / Vector

&#x20;       ↓

ALGORITMO

Procesar y organizar los datos

&#x20;       ↓

RESULTADO

Información organizada para su consulta y análisis





\### Detalle de la relación:



\- \*\*Dato:\*\* Cantidad de estudiantes inscritos en cada taller

\- \*\*Estructura de datos:\*\* Arreglo o vector utilizado para almacenar dichas cantidades

\- \*\*Algoritmo:\*\* Conjunto de pasos utilizados para procesar los datos:

&#x20; - Recorrerlos

&#x20; - Compararlos (máximo, mínimo)

&#x20; - Insertar nuevos valores

&#x20; - Ordenarlos

\- \*\*Resultado:\*\* Información organizada que permite realizar consultas y analizar las cantidades de inscritos



Por lo tanto, los \*\*datos\*\* representan la información que se desea procesar, la \*\*estructura de datos\*\* determina cómo se organiza esa información y el \*\*algoritmo\*\* establece los pasos necesarios para procesarla y obtener un resultado. De esta manera, los tres conceptos se complementan para plantear una solución ordenada al problema de la coordinación académica.

