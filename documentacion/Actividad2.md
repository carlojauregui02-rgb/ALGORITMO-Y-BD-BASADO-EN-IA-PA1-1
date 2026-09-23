# Actividad 2: Modelado y Operaciones con Vectores

**Vector base:** [28, 15, 34, 21, 19, 40, 12, 26]

---

## 2.1 Representación e Índices

Índice: 0 1 2 3 4 5 6 7
Valor: 28 15 34 21 19 40 12 26

El vector contiene 8 elementos iniciales que representan la cantidad de inscritos en cada taller. Cada elemento se puede acceder directamente mediante su índice.

**Código Java:**

```java
for (int i = 0; i < usados; i++) {
    System.out.println("Indice " + i + " -> Valor: " + inscritos[i]);
}
```

**Salida esperada:**

Indice 0 -> Valor: 28
Indice 1 -> Valor: 15
Indice 2 -> Valor: 34
Indice 3 -> Valor: 21
Indice 4 -> Valor: 19
Indice 5 -> Valor: 40
Indice 6 -> Valor: 12
Indice 7 -> Valor: 26

---

## 2.2 Algoritmo para Encontrar Máximo y Mínimo

### Pseudocódigo

ALGORITMO encontrarMaximoYMinimo(vector[], usados)
ENTRADA: vector con valores, cantidad de elementos usados
SALIDA: valor mayor y valor menor

max ← vector[0]
min ← vector[0]

PARA i = 1 HASTA usados-1 HACER
    SI vector[i] > max ENTONCES
        max ← vector[i]
    FIN SI

    SI vector[i] < min ENTONCES
        min ← vector[i]
    FIN SI
FIN PARA

IMPRIMIR "Mayor cantidad de inscritos: " + max
IMPRIMIR "Menor cantidad de inscritos: " + min

FIN ALGORITMO

### Explicación

El algoritmo inicia con el primer elemento como máximo y mínimo. Luego recorre el vector desde la posición 1 hasta el final, comparando cada elemento:

- Si es mayor que el máximo actual, lo actualiza.
- Si es menor que el mínimo actual, lo actualiza.

Este proceso se repite hasta recorrer todos los elementos del vector.

### Resultado

- Mayor cantidad de inscritos: **40** (en índice 5)
- Menor cantidad de inscritos: **12** (en índice 6)

**Código Java:**


int max = inscritos[0];

int min = inscritos[0];
```java
for (int i = 1; i < usados; i++) {
    if (inscritos[i] > max) {
        max = inscritos[i];
    }

    if (inscritos[i] < min) {
        min = inscritos[i];
    }
}

System.out.println("Mayor cantidad de inscritos: " + max);
System.out.println("Menor cantidad de inscritos: " + min);
```

---

## 2.3 Algoritmo para Inserción de un Elemento

### Pseudocódigo

ALGORITMO insertar(vector[], posicion, valor, usados)
ENTRADA: vector, posición deseada, nuevo valor, elementos actuales
SALIDA: vector modificado con nuevo elemento insertado

SI posicion >= 0 Y posicion <= usados Y usados < capacidad ENTONCES
    PARA i = usados HASTA posicion+1 (decrementando) HACER
        vector[i] ← vector[i-1]
    FIN PARA

    vector[posicion] ← valor
    usados ← usados + 1

    IMPRIMIR "Se inserto " + valor + " en el indice " + posicion
    IMPRIMIR "Vector despues de la insercion:"
    MOSTRAR_VECTOR(vector, usados)
SINO
    IMPRIMIR "Posicion no valida o capacidad maxima alcanzada."
FIN SI

FIN ALGORITMO

### Explicación

1. Se valida que la posición sea válida (entre 0 y usados).
2. Se verifica que haya espacio disponible en el arreglo.
3. Se desplazan todos los elementos desde la posición hacia la derecha.
4. Se inserta el nuevo valor en la posición indicada.
5. Se incrementa el contador de elementos usados.

### Ejemplo

**Usuario ingresa:** valor = 18, posición = 1

Antes: [28, 15, 34, 21, 19, 40, 12, 26]

Desplazamiento:

[28, 15, 34, 21, 19, 40, 12, 26, __ ]
[28, __, 15, 34, 21, 19, 40, 12, 26]

Inserción:

[28, 18, 15, 34, 21, 19, 40, 12, 26]

Después: [28, 18, 15, 34, 21, 19, 40, 12, 26]
usados: 9 elementos

---

## 2.4 Algoritmo de Ordenamiento Ascendente (Burbuja)

### Pseudocódigo

ALGORITMO burbujaAscendente(vector[], usados)
ENTRADA: vector desordenado, cantidad de elementos
SALIDA: vector ordenado de menor a mayor

PARA i = 0 HASTA usados-2 HACER
    PARA j = 0 HASTA usados-2-i HACER
        SI vector[j] > vector[j+1] ENTONCES
            temporal ← vector[j]
            vector[j] ← vector[j+1]
            vector[j+1] ← temporal
        FIN SI
    FIN PARA
FIN PARA

IMPRIMIR "Vector ordenado de menor a mayor:"
MOSTRAR_VECTOR(vector, usados)

FIN ALGORITMO

### Explicación

El algoritmo burbuja funciona mediante comparaciones e intercambios:

1. El ciclo externo controla cuántas pasadas se hacen (0 a usados-2).
2. El ciclo interno compara pares de elementos adyacentes.
3. Si un elemento es mayor que el siguiente, se intercambian.
4. Después de cada pasada, el elemento mayor "burbujea" hacia el final.
5. En la siguiente pasada, se reduce el rango de comparación.

### Resultado

Antes: [28, 15, 34, 21, 19, 40, 12, 26]
Después: [12, 15, 19, 21, 26, 28, 34, 40]

---

## 2.5 Análisis de Eficiencia

**Método utilizado:** Ordenamiento Burbuja (versión estándar)

**Mejor caso: O(n²)**
- Incluso si el vector ya está ordenado.
- El algoritmo realiza todos los ciclos sin condición de salida anticipada.

**Peor caso: O(n²)**
- Cuando el vector está inversamente ordenado.
- Se realizan el máximo de comparaciones e intercambios.

### Justificación

La implementación no incorpora una condición de salida anticipada cuando el vector ya está ordenado, tanto en el mejor como en el peor caso mantiene una complejidad aproximada de O(n²).

Con n=8: 7+6+5+4+3+2+1 = 28 comparaciones = O(n²)

Fórmula: n(n-1)/2 = 8(7)/2 = 28
