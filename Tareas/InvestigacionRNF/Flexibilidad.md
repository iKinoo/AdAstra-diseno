# Flexibilidad
<!-- 
+—-------------------------------+
|           RNF1:Name            |
+—-------------------------------+

- ISO/definición
- Contextualización a nuestro trabajo:
- Funcionalidades en diagramas, donde veamos que cumple el rnf:
- ejemplo: Crear un nuevo curso (diagrama donde se refleje la funcionalidad y podemos solucionar con un patrón de diseño como factory), un plus sería cómo se encuentra sin y con un patrón de diseño, pero ahorita hay que concentrarse en lo indispensable -->

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

Mapeando los requerimientos de flexibilidad con los requerimientos funcionales:

| RNF / RF | RF1 | RF2 | RF3 | RF4 | RF5 | RF6 | RF7 | RF8 | RF9 | RF10 | RF11 |
|----------|-----|-----|-----|-----|-----|-----|-----|-----|-----|------|------|
| **RNF3.1** | **X** | | **X** | **X** | **X** | | | | | | |
| **RNF3.2** | **X** | | | | | **X** | **X** | **X** | **X** | | **X** |
| **RNF3.3** | **X** | | | **X** | | | | **X** | | | |
| **RNF3.4** | **X** | | | | | | **X** | | | | |
| **RNR3.5** | | **X** | | | | **X** | **X** | **X** | | | **X** |

### Justificación del mapeo

1. **RNF3.1** (Agregar nuevos cursos y actividades fácilmente):
    - **RF1**: Guardar cursos en la nube requiere flexibilidad para agregar nuevos cursos.
    - **RF3**: Categorizar contenido de nuevas soft skills implica agregar actividades y cursos relacionados.
    - **RF4**: Publicar la lista de soft skills y actividades requiere fácil actualización y adición.
    - **RF5**: Actividades interactivas deben ser fácilmente agregables para mantener el sistema actualizado.

2. **RNF3.2** (Alta cohesión y bajo acoplamiento):
   - **RF1**: Guardar cursos en la nube debe ser un módulo independiente.
   - **RF6**: Reconocimiento de progreso debe ser modular y separado de otros procesos.
   - **RF7**: Guardar progreso en un servidor debe ser independiente de otras funcionalidades.
   - **RF8**: Acceso a contenido previamente completado requiere una interacción mínima con otros módulos.
   - **RF9**: Otorgar insignias debe ser un módulo separado.
   - **RF11**: Desbloqueo de contenido según avance debe estar desacoplado de otros procesos.

3. **RNF3.3** (Modificar un curso sin afectar otros):
   - **RF1**: Guardar cursos en la nube debe permitir modificaciones sin afectar la estructura global.
   - **RF4**: Publicar listas de soft skills y actividades debe permitir actualizaciones sin afectar el sistema.
   - **RF8**: Acceso a contenido completado debe ser independiente de las modificaciones en otros cursos.

4. **RNF3.4** (Adaptarse a cualquier base de datos):
   - **RF1**: Guardar cursos en la nube debe ser flexible para diferentes bases de datos.
   - **RF7**: Guardar progreso del usuario en un servidor debe ser adaptable a diferentes bases de datos.

5. **RNF3.5** (Adaptarse a creciente cantidad de usuarios):
   - **RF2**: Registro de usuarios debe manejar un volumen creciente de registros.
   - **RF6**: Reconocimiento de progreso debe escalar con la cantidad de usuarios.
   - **RF7**: Guardar progreso en un servidor debe soportar una mayor carga.
   - **RF8**: Acceso a contenido completado debe ser eficiente con más usuarios.
   - **RF11**: Desbloqueo de contenido debe escalar con el número de usuarios y sus progresos.

<!-- Posiblemente: Mapeando los requerimientos no funcionales a funcionalidades del sistema, podemos ver que la escalabilidad se puede lograr con un diseño modular y una arquitectura de microservicios. La instalabilidad se puede lograr con una arquitectura de contenedores y una base de datos que permita fácilmente la migración de un sistema a otro. -->

## Funcionalidades en diagramas, donde veamos que cumple el rnf

<!-- ## Diseño de la solución

Para cumplir con los requerimientos de flexibilidad, se propone una arquitectura de microservicios que permita la escalabilidad y adaptabilidad del sistema. Cada funcionalidad del sistema se dividirá en módulos independientes que se comunicarán entre sí a través de una API REST. -->

## Ejemplo

## Bibliografía

ISO 25010. (s. f.). <https://iso25000.com/index.php/en/iso-25000-standards/iso-25010>

Gutierrez, O. O., Salgado, R. S., Díaz, O. G. F., & Pérez, J. R. (2019). Métricas para la Medición del Factor de Flexibilidad y el Factor de Herencia de Implementación de Sistemas de Software. Dialnet. <https://dialnet.unirioja.es/servlet/articulo?codigo=7425388>
