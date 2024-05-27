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

En Ad-Astra, la flexibilidad es importante, ya que hay que preparar al sistema para un posible aumento en la demanda de usuarios y una creciente cantidad de cursos a futuro sin tener que modificar gran parte del sistema.

Además, es deseable que el sistema pueda ser exportado a distintos sistemas operativos con una sola arquitectura. Por último, es deseable que las piezas del sistema sean lo más modular posible para, si se requiere en un futuro, migrar a microservicios de forma fácil, sin tener que rediseñar gran parte del diseño.

De acuerdo a los requerimientos no funcionales RNF3:

| Código | Categoría |Descripción |
|--------|-----------|-------------|
| **RNF3.1** | Escalabilidad | Se podrán agregar nuevos cursos y actividades al sistema fácilmente. |
| **RNF3.2** | Escalabilidad | Se priorizará que la comunicación entre los módulos del sistema sea mínima, alta cohesión y bajo acoplamiento. (ASP net lo maneja) |
| **RNF3.3** | Escalabilidad | Se podrá modificar un curso en específico sin afectar de alguna forma a los ya existentes y/o a la estructura del sistema. |
| **RNF3.4** | Instalabilidad | El sistema permitirá adaptarse a cualquier base de datos haciendo mínimas modificaciones a la estructura del sistema. |
| **RNR3.5** | Escalabilidad | El sistema permitirá adaptarse a la creciente cantidad de usuarios haciendo mínimas modificaciones al mismo. |

## Funcionalidades en diagramas, donde veamos que cumple el rnf

<!-- Posiblemente: Mapeando los requerimientos no funcionales a funcionalidades del sistema, podemos ver que la escalabilidad se puede lograr con un diseño modular y una arquitectura de microservicios. La instalabilidad se puede lograr con una arquitectura de contenedores y una base de datos que permita fácilmente la migración de un sistema a otro. -->

## Ejemplo

## Bibliografía

ISO 25010. (s. f.). <https://iso25000.com/index.php/en/iso-25000-standards/iso-25010>

Gutierrez, O. O., Salgado, R. S., Díaz, O. G. F., & Pérez, J. R. (2019). Métricas para la Medición del Factor de Flexibilidad y el Factor de Herencia de Implementación de Sistemas de Software. Dialnet. <https://dialnet.unirioja.es/servlet/articulo?codigo=7425388>
