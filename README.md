
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
* [RNF 2. Requerimiento de confiabilidad](Tareas/InvestigacionRNF/Confiabilidad) (Isaías y Rodrigo)
* [RNF 3. Requerimiento de Seguridad](Tareas/InvestigacionRNF/Seguridad) (Isaías)
* [RNF. 4 Requerimiento de Flexibilidad](Tareas/InvestigacionRNF/Flexibilidad) (Mateo y Russel)


### Requerimiento de Reusabilidad
[Documento de Reusabilidad](RNFs/Reusabilidad/Reusabilidad.md) 

<details>
<summary><i>expandir o colapsar</i></summary>
    
# Definición de Mantenibilidad según ISO/IEC 25010
La mantenibilidad se define como:

"La capacidad de un producto o sistema de software de ser modificado de forma efectiva y eficiente por los desarrolladores. Estas modificaciones pueden incluir corrección de errores, mejoras de rendimiento, adaptación a un entorno cambiante y agregación de nuevas funcionalidades."

> Para los propósitos de este proyecto, nos centraremos en la composición modular de los cursos y su estrecha relación con la reusabilidad, considerada un aspecto crítico de la mantenibilidad según la norma ISO/IEC 25010. 

## Reusabilidad 
### Definición de Reusabilidad según ISO/IEC 25010
La ISO/IEC 25010 es un estándar internacional que define un modelo de calidad para la evaluación de software. Dentro de la característica de mantenibilidad, la reusabilidad se define como:

"Capacidad de un producto o componente para ser utilizado en más de un sistema de software o en la construcción de otros productos o componentes."

### Contextualización en Ad-astra
En Ad-Astra, los cursos están compuestos por varios módulos a los que llamamos pilares. Algunos de estos módulos pueden ser parte de múltiples cursos. Si un estudiante completa un módulo en un curso y este mismo modulo aparece en otro curso, no es necesario que el estudiante lo vuelva a tomar. Esto indica que los pilares son reutilizables entre diferentes curso.

### Presencia de Reusabilidad
**Modularidad:**
Los pilares en Ad-astra están diseñados como módulos independientes que pueden ser combinados de diferentes maneras para formar distintas certificaciones. Esta modularidad es un aspecto clave de la reusabilidad.

**Bajo Acoplamiento y Alta Cohesión:**
Cada pilar tiene una responsabilidad específica (enseñar un tema particular) y puede ser usado de manera independiente en diferentes cursos sin que la estructura de los pilares dependa de las cursos en las que se incluyen. Este diseño de bajo acoplamiento (los pilares no dependen de la curso en la que están) y alta cohesión (cada pilar tiene un propósito bien definido) es un ejemplo clásico de componentes reutilizables.


**Eficiencia y Ahorro de Tiempo:**
Permitir a los estudiantes no repetir cursos ya completados en otras certificaciones aumenta la eficiencia del proceso de aprendizaje. Los estudiantes ahorran tiempo y esfuerzo, lo cual es un beneficio directo de la reusabilidad.

**Consistencia y Mantenimiento:**
Reutilizar cursos en diferentes certificaciones también asegura que la calidad y el contenido del curso son consistentes en todas las certificaciones. Además, mantener y actualizar un curso reutilizable es más sencillo porque los cambios se reflejan en todas las certificaciones que lo incluyen.

[![imagen-2024-05-26-000024258.png](https://i.postimg.cc/JntnZ3rh/imagen-2024-05-26-000024258.png)](https://postimg.cc/1nhsZqNx)

Estas prácticas de reusabilidad directamente contribuyen a mejorar la mantenibilidad del sistema de la siguiente manera:

**Modularidad:** Al diseñar los cursos y pilares como módulos independientes y reutilizables, se aumenta la modularidad del sistema. Esto facilita la localización y modificación de partes específicas del sistema sin afectar al resto.
**Analizabilidad:** La reusabilidad permite analizar y entender fácilmente cómo se relacionan y utilizan los componentes en diferentes contextos. Esto hace que sea más fácil evaluar el impacto de los cambios y diagnosticar problemas.
**Modificabilidad:** La capacidad de reutilizar componentes reduce la cantidad de código nuevo que debe escribirse y probarse, lo que facilita la implementación de cambios y nuevas funcionalidades.

**Capacidad de Prueba (Testabilidad):** Los componentes reutilizables tienden a estar mejor probados, lo que facilita la verificación de que las modificaciones no introducen nuevos errores y que el software sigue cumpliendo con sus requisitos.

### BONUS
**¿Podemos implementar algún patrón de diseño?**

Dos patrones particularmente útiles para este tipo de escenarios son el Patrón Composite y el Patrón Strategy.

### Composite
El concepto básico del patrón Composite consiste en representar objetos simples y sus containers (o contenedores, también llamados colecciones en algunos lenguajes, o sea: grupos de objetos) en una clase abstracta de manera que puedan ser tratados uniformemente. Este tipo de estructura se conoce como jerarquía parte-todo (en inglés: part-whole hierarchy), en la que un objeto es siempre, o una parte de un todo, o un todo compuesto por varias partes.

[![structure-es.png](https://i.postimg.cc/MHq66gsg/structure-es.png)](https://postimg.cc/xJpDgpVP)


**¿Cómo nos beneficia usar este patrón?**

El patrón Composite ofrece una estructura jerárquica para representar cursos y sus componentes de manera flexible. Esto permite que los cursos estén formados por módulos que pueden contener submódulos, facilitando una organización clara y recursiva.

Además, promueve la reutilización de componentes al tratar tanto a los objetos individuales como a las composiciones de objetos de manera uniforme. Esto significa que los mismos módulos pueden ser utilizados en diferentes cursos, lo que simplifica el diseño y la implementación del sistema.

El mantenimiento y la modificación se simplifican con el patrón Composite, ya que las operaciones se aplican de la misma manera a objetos individuales y composiciones de objetos. Esto garantiza una consistencia en el código y facilita la actualización de componentes específicos sin afectar la estructura general.

Además, el patrón Composite es altamente escalable, lo que permite agregar nuevos componentes y cursos sin necesidad de cambiar la estructura del código existente. Esto es especialmente útil en entornos como Coursera, donde se manejan una gran cantidad de cursos y contenido educativo en constante evolución.

**Patrón Composite contextualizado en Ad-Astra:**

[![Patrón Composite en nuestro sistema](https://i.postimg.cc/W1RkVy2w/imagen-2024-05-25-235823094.png)](https://postimg.cc/GHQ2JqT4)

### Strategy
El patrón de diseño Strategy se encuentra entre los patrones de comportamiento que dotan al software con diferentes métodos de solución. Estas estrategias incluyen una variedad de algoritmos que son distintos del programa real y son autónomos (es decir, intercambiables). Un patrón de diseño de estrategia también incluye ciertas especificaciones y ayudas para los desarrolladores. Por ejemplo, los patrones de diseño de estrategia pueden describir cómo ensamblar clases, organizar un grupo de clases y crear objetos. Lo especial de los patrones de diseño de estrategia es que un programa variable y el comportamiento del objeto también pueden realizarse durante la ejecución del software.

[![structure-1.png](https://i.postimg.cc/rpRFQ10Z/structure-1.png)](https://postimg.cc/rdckpt95)

**¿Cómo nos beneficia usar este patrón?**

El patrón Strategy ofrece flexibilidad en la composición de cursos al permitir encapsular diferentes algoritmos en estrategias separadas. Esto posibilita cambiar dinámicamente cómo se componen los cursos en tiempo de ejecución, sin necesidad de modificar la estructura de las clases de curso. Por ejemplo, se pueden tener estrategias basadas en el nivel de dificultad o en las preferencias del estudiante.

La reusabilidad de estrategias es otra ventaja, ya que cada algoritmo de composición de cursos se encapsula en una estrategia separada, lo que facilita su reutilización en diferentes partes del sistema. Esto promueve la modularidad y simplifica el mantenimiento del código.

El patrón Strategy también fomenta la separación de responsabilidades al desacoplar las políticas de uso de las clases de curso (contexto) de las implementaciones concretas de la composición de cursos (estrategias). Esto hace que el código sea más comprensible, mantenible y testeable, ya que cada estrategia se ocupa de una única responsabilidad.

Agregar nuevas estrategias de composición de cursos es sencillo con el patrón Strategy, ya que no afecta el código existente. Esto es útil en entornos como Coursera, donde se pueden experimentar con diferentes enfoques de composición de cursos o agregar nuevas funcionalidades sin problemas.

Finalmente, la facilidad para cambiar de estrategia durante la ejecución del programa permite adaptar el sistema a las necesidades o preferencias de los usuarios sin interrumpir su funcionamiento. Esto proporciona una mayor flexibilidad y capacidad de respuesta en la gestión de los cursos en la plataforma.

**Patrón Composite contextualizado en Ad-Astra:**

[![imagen-2024-05-25-235613786.png](https://i.postimg.cc/6qyv6J2Y/imagen-2024-05-25-235613786.png)](https://postimg.cc/V0P64hFC)

</details>

### Requerimiento de Flexibilidad

[Documento de Flexibilidad](RNFs/Flexibilidad/Flexibilidad.md)

<details>
<summary><i>expandir o colapsar</i></summary>

# Flexibilidad

+—-------------------------------+
|           RNF1:Name            |
+—-------------------------------+

- ISO/definición
- Contextualización a nuestro trabajo:
- Funcionalidades en diagramas, donde veamos que cumple el rnf:
- ejemplo: Crear un nuevo curso (diagrama donde se refleje la funcionalidad y podemos solucionar con un patrón de diseño como factory), un plus sería cómo se encuentra sin y con un patrón de diseño, pero ahorita hay que concentrarse en lo indispensable

## Definición

Siguiendo la definición de la ISO/IEC-25010 definimos el atributo de flexibilidad como:

>Capacidad del producto para adaptarse a cambios en sus requisitos, contextos de uso o entorno del sistema. Esta característica se subdivide a su vez en las siguientes subcaracterísticas:
>
>- **Adaptabilidad**. Capacidad del producto que le permite ser adaptado de forma efectiva y eficiente a diferentes entornos determinados de hardware, software, operacionales o de uso.
>- **Escalabilidad**. Capacidad del producto para gestionar cargas de trabajo crecientes o decrecientes y para adaptar su capacidad a la variabilidad.
>- **Instalabilidad**. Facilidad con la que el producto se puede instalar y/o desinstalar de forma exitosa en un determinado entorno.
>- **Reemplazabilidad**. Capacidad del producto para ser utilizado en lugar de otro producto software determinado con el mismo propósito y en el mismo entorno.

## Contextualización

En el contexto de nuestro sistema, la flexibilidad es importante, ya que hay que preparar al sistema para un posible aumento en la demanda de usuarios y la creciente cantidad de cursos a futuro sin tener que modificar gran parte del sistema. Además, es deseable que el sistema pueda ser exportado para distintos sistemas operativos con una sola arquitectura. Por último, es deseable que las piezas del sistema sean lo más modular posible para, si se requiere en un futuro, migrar a microservicios de forma fácil, sin tener que rediseñar gran parte del diseño.

De acuerdo a los requerimientos no funcionales RNF3:

| Código | Descripción |
|--------|-------------|
| **RNF3.1** | Se podrán agregar nuevos cursos y actividades al sistema fácilmente. |
| **RNF3.2** | Se priorizará que la comunicación entre los módulos del sistema sea mínima, alta cohesión y bajo acoplamiento. (ASP net lo maneja) |
| **RNF3.3** | Se podrá modificar un curso en específico sin afectar de alguna forma a los ya existentes y/o a la estructura del sistema. |
| **RNF3.4** | El sistema permitirá adaptarse a cualquier base de datos haciendo mínimas modificaciones a la estructura del sistema. |
| **RNR3.5** | El sistema permitirá adaptarse a la creciente cantidad de usuarios haciendo mínimas modificaciones al mismo. |

## Funcionalidades en diagramas, donde veamos que cumple el rnf

## Ejemplo

## Bibliografía

ISO 25010. (s. f.). <https://iso25000.com/index.php/en/iso-25000-standards/iso-25010>

Gutierrez, O. O., Salgado, R. S., Díaz, O. G. F., & Pérez, J. R. (2019). Métricas para la Medición del Factor de Flexibilidad y el Factor de Herencia de Implementación de Sistemas de Software. Dialnet. <https://dialnet.unirioja.es/servlet/articulo?codigo=7425388>


</details>