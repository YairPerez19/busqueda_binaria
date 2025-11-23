# 🔍 Búsqueda Binaria (Binary Search) en Java

> Este proyecto implementa el algoritmo de **Búsqueda Binaria** en Java. Lee una lista de números y un valor objetivo de un archivo de texto, y determina la posición del objetivo en la lista.

## 📋 Tabla de Contenidos

* [Concepto Clave: Búsqueda Binaria](#-concepto-clave-búsqueda-binaria)
* [Instrucciones de Uso](#-instrucciones-de-uso)
* [Ejemplo de Funcionamiento](#-ejemplo-de-funcionamiento)

---

## 🧠 Concepto Clave: Búsqueda Binaria

La **Búsqueda Binaria** es un algoritmo eficiente para encontrar un elemento específico dentro de un arreglo **ordenado**. Funciona dividiendo repetidamente por la mitad la porción del arreglo que podría contener el elemento.

### Condición Fundamental

La Búsqueda Binaria **solo funciona** si el arreglo de entrada está **previamente ordenado** (ascendente o descendente).

### Funcionamiento (Divide y Vencerás)

1.  **Punto Medio:** El algoritmo compara el valor objetivo con el elemento en el punto **medio** del arreglo.
2.  **Decisión:**
    * Si el valor objetivo es igual al elemento central, ¡la búsqueda termina con éxito!
    * Si el valor objetivo es **menor** que el elemento central, la búsqueda continúa solo en la mitad **inferior** del arreglo.
    * Si el valor objetivo es **mayor** que el elemento central, la búsqueda continúa solo en la mitad **superior** del arreglo.
3.  **Repetición:** Este proceso se repite hasta que se encuentra el elemento o el sub-arreglo a buscar se reduce a cero. 

[Image of Binary Search algorithm steps]


| Característica | Detalle |
| :--- | :--- |
| **Tiempo (Asintótico)** | $O(\log n)$ (Muy rápido para grandes conjuntos de datos). |
| **Ventaja** | Mucho más rápida que la Búsqueda Lineal ($O(n)$). |
| **Desventaja** | Requiere que el arreglo esté ordenado. |

---

## 🛠️ Instrucciones de Uso

Esta aplicación en Java lee el arreglo (la lista de números) y el número objetivo de un archivo de texto de dos líneas, realiza la búsqueda binaria, y escribe el resultado en un archivo de salida.

### Requisitos

Necesitas tener instalado el **Java Development Kit (JDK 8 o superior)**.

### 1. Preparar el Archivo de Entrada

El programa espera que exista un archivo llamado `entrada_busquedabinaria.txt` en el mismo directorio de ejecución. **DEBE** contener dos líneas: la lista ordenada y el objetivo.

* **Nombre del Archivo:** `entrada_busquedabinaria.txt`
* **Línea 1 (Arreglo):** Números enteros ordenados, separados por comas.
* **Línea 2 (Objetivo):** El número entero que se desea buscar.

**Ejemplo de contenido para `entrada_busquedabinaria.txt`:**