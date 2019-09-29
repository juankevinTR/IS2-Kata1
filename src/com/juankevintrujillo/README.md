# IS2-Kata1

**Objetivos:**
- Crear una clase Person para el cálculo de la edad.
- Editar el código con el apoyo de los atajos de teclado de Netbeans.
- Guardar el proyecto en un repositorio local Git.
- Subir el repositorio a GitHub.

## VERSIÓN 1
En KATA1 se trata de crear un proyecto con una clase Person
que tenga dos atributos (name, birthdate) y un método getAge() (calcula la
edad). En la primera versión se utiliza la utilidad Date() que está obsoleta
(deprecated ).

## VERSIÓN 2
En la segunda versión de esta práctica se sustituye Date por las clases Calendar y GregorianCalendar (implementación del Calendario Gregoriano). La clase Calendar es una clase abstracta base para convertir entre un objeto de tipo Date (java.util.Date) y un conjunto de campos enteros como YEAR (año), MONTH (mes), DAY (día), HOUR (hora), etc.

## VERSIÓN 3
Se propone que los estudiantes creen la clase Person pero que en esta versión deben usar la librería de Java 8, LocalDate
