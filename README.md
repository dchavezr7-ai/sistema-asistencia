# Sistema de Visualización de Asistencia de Trabajadores

Este sistema fue desarrollado para simular el apartado de Recursos Humanos donde los encargados pueden entrar y revisar de manera uniforme la lista de asistencia de los empleados, viendo específicamente sus datos personales (ID, nombre, apellido, teléfono) y las horas exactas en las que registraron su entrada y su salida.

## Estructura del Repositorio
Para que el proyecto esté ordenado y cumpla con los estándares de limpieza que se evalúan, el código se ha dividido en las siguientes carpetas dentro de src:

- model: Contiene las clases Trabajador y RegistroAsistencia, que son las que guardan los datos básicos y controlan que no ocurran errores si un empleado aún no marca su salida.
- collection: Aquí está la estructura principal del sistema, que es el ArbolTrabajadores junto con la interfaz Agregado.
- iterator: Contiene la interfaz Iterator y la clase ArbolInorderIterator, donde se maneja la lógica para recorrer el árbol.
- Main.java: Es el archivo principal que se encuentra en la raíz de src. Sirve para cargar los 12 trabajadores de prueba y simular la pantalla de Recursos Humanos.

## Justificación del Sistema y el uso del Patrón Iterator

La razón por la que elegí usar un Árbol Binario de Búsqueda junto con el patrón Iterator es principalmente por un tema de orden, limpieza y eficiencia en el código. Como el profesor va a evaluar la forma en que recorremos la información, conectar un árbol con un iterador propio es la mejor alternativa para este problema.

Cuando el encargado de Recursos Humanos entra a revisar la asistencia, lo ideal es que vea a los empleados organizados. Si hubiera guardado los datos en una lista común y corriente, me habría visto obligado a programar un algoritmo de ordenamiento extra (como un BubbleSort o un QuickSort) para acomodarlos antes de mostrarlos en pantalla, lo cual gasta más recursos del sistema. En lugar de eso, al usar un árbol binario y registrar a los trabajadores usando su ID como clave, el propio árbol se encarga de acomodarlos de manera automática a medida que van ingresando. Al momento de mostrar la lista, el algoritmo de recorrido Inorder (que va del lado izquierdo al derecho pasando por la raíz) hace que los empleados se impriman ya ordenados de menor a mayor sin ningún esfuerzo extra.

Por otro lado, para aplicar el patrón Iterator sin llenar el Main de código complejo, encapsulé toda la lógica del recorrido dentro de la clase ArbolInorderIterator. Moverse entre los nodos de un árbol puede ser enredado, pero al guardarlo en el iterador, el Main se olvida por completo de eso. Además, para que el recorrido sea seguro, utilicé una pila (Stack) interna para manejar los nodos de forma iterativa. Esto es mucho mejor que usar la recursividad tradicional, ya que si la empresa llega a crecer y llega a tener miles de empleados, la recursividad podría saturar la memoria de la aplicación y colgar el programa, mientras que con la pila el consumo de memoria está controlado.

...
