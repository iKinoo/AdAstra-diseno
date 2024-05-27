
# AdAstra-diseno


![](https://github.com/iKinoo/AdAstra-diseno/assets/112036753/23ee3c0d-e59b-420f-9194-5f65d377dc23)

## Integrantes
* Russel Adrian Bonilla Pech
* Jesús Mateo Ortíz Chay
* Rodrigo Joaquín Pacab Canul
* Orlando Isaías Rodríguez Couoh 


## Tareas del equipo:
[Aquí](https://github.com/iKinoo/AdAstra-diseno/tree/main/Tareas)

# Modelo de calidad, Investigación y verificación del atributo de calidad:

* [RNF.1 Requerimientos de usabilidad](Tareas/InvestigacionRNF/Usabilidad) (Russel)
* [RNF 2. Requerimiento de confiabilidad](Tareas/InvestigacionRNF/Confiabilidad) (Rodrigo)
* [RNF 3. Requerimiento de Seguridad]() (Isaías)
* [RNF. 4 Requerimiento de Flexibilidad]() (Mateo)

# RNF elegidos y justificación:

...

# Flexibilidad

## Definición

Siguiendo la definición de la ISO/IEC-25010 definimos el atributo de flexibilidad como:

>Capacidad del producto para adaptarse a cambios en sus requisitos, contextos de uso o entorno del sistema.

## Contextualización

En AdAstra es fundamental la flexibilidad debido a que el sistema aún está en una etapa temprana y está sujeto al cambio en la forma de los cursos y actividades, estos pueden ser presentados como videos, texto, o incluso minijuegos, y dependiendo de los resultados pueden evolucionar los requerimientos y/o necesidades del sistema, es por eso que tenemos los siguientes RNF:

| Código |Descripción |
|--------|-------------|
| *RNF3.1* | Se podrán agregar nuevos cursos, pilares y actividades al sistema fácilmente. () |
| *RNF3.2* | Se podrá realizar un CRUD de cualquier curso, pilar o actividad sin afectar de alguna forma a los ya existentes y/o la estructura del sistema. |
|*RNF3.3*| Se podrán crear actividades de distintos tipos  facilmente sin afectar a las actividades existentes 

## Funcionalidades en diagramas, donde veamos que cumple el rnf

1. *RNF3.1* (Agregar nuevos cursos, pilares y actividades fácilmente):

1. *RNF3.2* (CRUD en un curso, pilar o actividad sin afectar otros):
  
<!--Diagrama uml de mateo-->

<!-- Posiblemente: Mapeando los requerimientos no funcionales a funcionalidades del sistema, podemos ver que la escalabilidad se puede lograr con un diseño modular y una arquitectura de microservicios. La instalabilidad se puede lograr con una arquitectura de contenedores y una base de datos que permita fácilmente la migración de un sistema a otro. -->
*RNF3.3* Se podrán crear actividades de distintos tipos  facilmente sin afectar a las actividades existentes

<!--mi diagrama con herencia...-->

<!--mi Diagrama uml con el patron de diseño que está en uml.pu (es plant uml)-->

<!-- ## Diseño de la solución

Para cumplir con los requerimientos de flexibilidad, se propone una arquitectura de microservicios que permita la escalabilidad y adaptabilidad del sistema. Cada funcionalidad del sistema se dividirá en módulos independientes que se comunicarán entre sí a través de una API REST. -->




## Ejemplo

## Bibliografía

ISO 25010. (s. f.). <https://iso25000.com/index.php/en/iso-25000-standards/iso-25010>

Gutierrez, O. O., Salgado, R. S., Díaz, O. G. F., & Pérez, J. R. (2019). Métricas para la Medición del Factor de Flexibilidad y el Factor de Herencia de Implementación de Sistemas de Software. Dialnet. <https://dialnet.unirioja.es/servlet/articulo?codigo=7425388>


### [Isaias y Rodrigo, pegar su parte]()