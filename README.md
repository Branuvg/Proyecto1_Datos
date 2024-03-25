## Proyecto No. 1 Algoritmos y Estructura de Datos

Gabriel Bran 23590  
David Dominguez 23712  
Luis Padilla 23663  


## Interprete Evaluador de Expresiones Lisp
Este proyecto consiste en un programa Java que funciona como interprete para evaluar expresiones en el lenguaje Lisp. Permite realizar operaciones aritméticas, comparaciones, y verificar propiedades de los elementos de las expresiones Lisp, defun.

## Funcionalidades principales
Evaluación de Expresiones: El programa puede evaluar expresiones Lisp proporcionadas por el usuario e identificar si son átomos o listas.

Operaciones Aritméticas: Permite realizar operaciones básicas como suma, resta, multiplicación y división entre números.

Comparaciones: Puede comparar valores numéricos para verificar si son iguales, mayores o menores que otros.

Verificación de Propiedades: Permite verificar si un valor es un átomo o una lista según la definición en Lisp.

Cómo funciona
El programa consta de varias clases que se encargan de diferentes aspectos de la evaluación de expresiones Lisp:

Main
La clase Main sirve como punto de entrada del programa. Coordina la interacción con el usuario, lee las expresiones a evaluar y las pasa al Interprete para su procesamiento.

Interprete
La clase Interprete interpreta las expresiones recibidas del usuario, realiza operaciones y gestiona variables y funciones. Utiliza instancias de las clases PrefixCalc, Operator, Tokenizer y otras estructuras de datos como HashMap y ArrayList.

Leedor
La clase Leedor se encarga de leer y analizar archivos para convertir su contenido en instrucciones comprensibles por el intérprete. Proporciona el método Parse para realizar esta tarea.

Operator
La clase Operator contiene métodos para realizar operaciones específicas, como comparar valores, verificar si un valor es un átomo o una lista en el contexto de Lisp.

PrefixCalc
La clase PrefixCalc proporciona funcionalidad para calcular expresiones en notación prefija, como sumar, restar, multiplicar y dividir. Utiliza una estructura de datos Stack para realizar los cálculos.

Stack
La clase Stack implementa una pila genérica utilizando un ArrayList y proporciona operaciones básicas de pila como push, pop, top, isEmpty y count.

Tokenizer
La clase Tokenizer se encarga de tokenizar comandos de Lisp y determinar su tipo de comando. Convierte comandos de texto en listas de tokens y proporciona métodos para esta tarea.


## Estructuras del Java Collections Framework Utilizadas
El programa hace uso de varias estructuras de datos proporcionadas por el Java Collections Framework para gestionar y manipular datos de manera eficiente. Estas son algunas de las estructuras utilizadas junto con la razón de su uso:

ArrayList:

Razón de Uso: Se utiliza para almacenar listas dinámicas de elementos, como tokens, instrucciones, nombres de funciones, etc. Es eficiente en la inserción, eliminación y acceso aleatorio a elementos.
Referencia de Uso: [Documentación de Oracle sobre ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)  
HashMap:

Razón de Uso: Se utiliza para almacenar pares clave-valor, como variables, funciones y parámetros. Proporciona un acceso rápido a los valores basado en la clave.
Referencia de Uso: [Documentación de Oracle sobre HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)  
LinkedHashMap:

Razón de Uso: Similar a HashMap pero mantiene el orden de inserción de los elementos. Se utiliza para mantener el orden de las variables y funciones tal como se ingresaron.
Referencia de Uso: [Documentación de Oracle sobre LinkedHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html)  
Estas estructuras del Java Collections Framework proporcionan la base para la implementación eficiente de diversas funcionalidades del programa, como el almacenamiento de datos, la manipulación de variables y funciones, y la gestión de parámetros.

## Diagramas
![UML Diagrama de Clases](https://github.com/Branuvg/Proyecto1_Datos/assets/84152698/e4a67e14-7c4f-4d2f-9920-d669934ce2f4)
![Diagrama de Secuencia](https://github.com/Branuvg/Proyecto1_Datos/assets/84152698/d72ad82e-bc3d-4896-8aaa-f757a42694f5)


## Uso del Programa
Para utilizar el programa, simplemente ejecuta la clase Main y sigue las instrucciones en consola para ingresar las expresiones Lisp que deseas evaluar. El programa mostrará el resultado de la evaluación.  
![Diagrama de caso de uso](https://github.com/Branuvg/Proyecto1_Datos/assets/84152698/a6b61d0a-0ce6-45d2-98f1-6f2ec20b7a03)

## Requisitos
El programa está desarrollado en Java y requiere un entorno de ejecución Java (JRE) instalado en tu sistema para ejecutarse correctamente. Además, utiliza las siguientes clases y paquetes de Java:

java.io.BufferedReader: Para leer texto de un flujo de entrada de caracteres, como un archivo.
java.io.FileReader: Para leer caracteres de un archivo de texto.
java.io.IOException: Para manejar excepciones de entrada/salida (E/S).
java.util.ArrayList: Para almacenar y manipular listas de elementos.
java.util.Arrays: Para trabajar con matrices y realizar operaciones en ellas.
java.util.HashMap: Para almacenar pares clave-valor y acceder a ellos de manera eficiente.
java.util.LinkedHashMap: Similar a HashMap, pero mantiene el orden de inserción de los elementos.
java.util.regex.Matcher: Para realizar operaciones de coincidencia de patrones utilizando expresiones regulares.
java.util.regex.Pattern: Para representar un patrón de expresión regular compilado.
Asegúrate de tener estas clases y paquetes disponibles en tu entorno de desarrollo Java para ejecutar el programa sin problemas.
