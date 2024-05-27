
# AdAstra-diseno


![](https://github.com/iKinoo/AdAstra-diseno/assets/112036753/23ee3c0d-e59b-420f-9194-5f65d377dc23)

## Integrantes
* Russel Adrian Bonilla Pech
* Jesús Mateo Ortíz Chay
* Rodrigo Joaquín Pacab Canul
* Orlando Isaías Rodríguez Couoh 


## Tareas del equipo:
[Aquí](https://github.com/iKinoo/AdAstra-diseno/tree/main/Tareas)

## Investigación previa de atributos de calidad:

* [RNF.1 Requerimientos de usabilidad](Tareas/InvestigacionRNF/Usabilidad) (Russel)
* [RNF 2. Requerimiento de confiabilidad](Tareas/InvestigacionRNF/Confiabilidad) (Rodrigo)
* [RNF 3. Requerimiento de Seguridad]() (Isaías)
* [RNF. 4 Requerimiento de Flexibilidad]() (Mateo)

## RNF elegidos y justificación:

Después de hacer la investigación y gracias a los aprendizajes obtenidos durante el curso, hemos decidido que los **Requerimientos No Funcionales** con los que trabajaremos serán **Flexibilidad** y **Mantenibilidad** debido a que son más relevantes para AdAstra actualmente y es más viable hacer la comprobación en la etapa de diseño


# Flexibilidad

## Definición

Siguiendo la definición de la ISO/IEC-25010 definimos el atributo de flexibilidad como:

>Capacidad del producto para adaptarse a cambios en sus requisitos, contextos de uso o entorno del sistema.

## Contextualización

En AdAstra es fundamental la flexibilidad debido a que el sistema aún está en una etapa temprana y está sujeto al cambio en la forma de los cursos y actividades, estos pueden ser presentados como videos, texto, o incluso minijuegos, y dependiendo de los resultados pueden evolucionar los requerimientos y/o necesidades del sistema, es por eso que tenemos los siguientes RNF:

| Código |Descripción |
|--------|-------------|
| *RNF4.1* | Se podrán agregar nuevos cursos, pilares y actividades al sistema fácilmente. () |
| *RNF4.2* | Se podrá realizar un CRUD de cualquier curso, pilar o actividad sin afectar de alguna forma a los ya existentes y/o la estructura del sistema. |
|*RNF4.3*| *RNF3.3* Se podrán crear actividades de distintos tipos  facilmente sin afectar a las actividades existentes o al sistema

## Funcionalidades en diagramas, donde veamos que cumplen los rnf

1. *RNF3.1* (Agregar nuevos cursos, pilares y actividades fácilmente):

1. *RNF3.2* (CRUD en un curso, pilar o actividad sin afectar otros):
  
### Solución:
En este diagrama se observa un sistema de gestión de cursos con clases para AdminPanel, Curso, Pilar y Actividad. Las relaciones y métodos definidos permiten agregar y gestionar estos elementos de manera modular.

RNF4.1
Se pueden agregar nuevos cursos, pilares y actividades fácilmente:

AdminPanel puede agregar cursos con agregarCurso(curso: Curso).
Curso puede agregar pilares con agregarPilar(pilar: Pilar).
Pilar puede agregar actividades con agregarActividad(actividad: Actividad).
RNF4.2
Las operaciones CRUD en un curso, pilar o actividad no afectan a otros:

<!--Diagrama uml de mateo-->
![UML patrones](Assets/AdminPanel_UML.png)

 
---
*RNF4.3* Se podrán crear actividades de distintos tipos  facilmente sin afectar a las actividades existentes o al sistema

### Solución 1
En este primer diagrama podemos observar la clase Actividad, al heredar de dicha clase se pueden crear distintos tipos de actividades, ya sean actividades teóricas, actividades prácticas, actividades de evaluación, etc. Al mismo tiempo se pueden crear diferentes tipos de evaluación por medio de la herencia, que se seguirán comportando como una Actividad dentro del programa, por lo que cumplimos con el RNF3.3, es decir, podremos crear actividades de distintos tipos  facilmente sin afectar a las actividades existentes o al sistema, sin embargo hay un pequeño problema con esto...
<!--mi diagrama con herencia...-->
<img src="Assets/AdAstra_ActividaesUML.png" alt="UML sin patrones" />

A largo plazo, podremos tener nuevos tipos de Actividades, o combinación de los tipos de actividades ya existentes, por ejemplo una actividad que sea una combinación entre Evaluación o práctica, o una Actividad que se comporte como teoría y práctica al mismo tiempo, y mientras más actividades existan tenndremos que recurrir a un árbol de herencia gigantesco que sí cumplirá con el requerimiento, pero de manera ineficiente, es por eso que tenemos la siguiente solución:

### Solución 2

Esta solución incluye el Patrón de diseño decorador, en el diagrama representamos una estructura que utiliza el patrón Decorator para añadir diferentes tipos de actividades sin modificar la estructura base.
* La clase abstracta ActividadDecorator permite añadir funcionalidades adicionales a las actividades.
* Cada decorador específico (Texto, Imagen, JsPlugin, Video, Formulario) extiende ActividadDecorator y añade su propia lógica al método cargarActividad().
* Los decoradores pueden ser combinados para añadir múltiples funcionalidades a una misma actividad.

De esta también cumplimos con el RNF3.3, es decir, podremos crear actividades de distintos tipos  facilmente sin afectar a las actividades existentes o al sistema, y al mismo tiempo a largo plazo nos permitirá crear diferentes tipos de actividades sin tener una estructura muy compleja y difícil de entender.

<!--mi Diagrama uml con el patron de diseño que está en uml.pu (es plant uml)-->

![UML patrones](Assets/umlDecoratorAdAstra.png)

---

### [Isaias y Rodrigo, pegar su parte]()

---
## Bibliografía

ISO 25010. (s. f.). <https://iso25000.com/index.php/en/iso-25000-standards/iso-25010>

Gutierrez, O. O., Salgado, R. S., Díaz, O. G. F., & Pérez, J. R. (2019). Métricas para la Medición del Factor de Flexibilidad y el Factor de Herencia de Implementación de Sistemas de Software. Dialnet. <https://dialnet.unirioja.es/servlet/articulo?codigo=7425388>

---