
🎬[Diapositivas de la sesión](https://www.canva.com/design/DAGFuLDnVdc/jQZDmOvPlaLTKLnNqHignA/edit?utm_content=DAGFuLDnVdc&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)

<div align="center">

Sesión Práctica
# Patrones de diseño<br>en<br>
<img  src="https://hibernate.org/images/hibernate-logo.svg"/>

</div>

## Requerimientos

- [Java 21](https://adoptium.net/temurin/releases/?os=windows&arch=x64&package=jdk).
    > Esta demo fue hecha con Java 21. Es posible que al ser un ejemplo básico pueda funcionar con versiones inferiores como 20 o 17, en caso de usar otra versión especifique en el archivo [`app/build.gradle`](app/build.gradle) en el apartado `java.toolchain`

    En caso de usar Visual Studio Code como IDE:
- [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack://)
- [Gradle for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-gradle)


## SetUp

Asegúrate de que estás usando la versión de Java correcta, verifícalo en [`app/build.gradle`](app/build.gradle)

### Visual Studio Code
Verifica que la detecte las depencias, esto demorará unos momentos debido a que Gradle al ser la primera vez abriendo el proyecto, estará descargando las dependencias especificadas en [`app/build.gradle`](app/build.gradle), las cuales son:

- [Hibernate](https://mvnrepository.com/artifact/org.hibernate/hibernate-core): `org.hibernate.orm:hibernate-core:6.5.1.Final`, de lo que se trata esta sesión práctica.
- [H2 Database](https://mvnrepository.com/artifact/com.h2database/h2): `com.h2database:h2:2.2.224`, usado para realizar las pruebas a una base de datos en memoria.

![alt](assets/java-projects-referenced_libraries.png)


Es posible que Visual Studio Code no detecte las librerías, en ese caso necesitarás **recargar el proyecto** con la extensión de Java incluida en el pack de extensiones recomendado.
 
![alt](assets/reload-java-project.png)

#### Run, Build, Debug...

Ahora puedes ejecutar *tasks* de Gradle, ya sea por terminal, ejecutando `./gradlew <task>` (ejem. `./gradlew run`) o por la extensión Gradle For Java que te permite debugear, ver todas las tareas, entre otras cosas.

![alt](assets/gradle-projects-extension.png)
