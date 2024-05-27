# Table of requirements

## Functional requirements

| ID | Description |
|----|-------------|
| RF1 | El sistema guardará los cursos en la nube. |
| RF2 | El usuario tendrá que registrarse en el sistema para poder acceder a los cursos. |
| RF3 | El sistema categoriza el contenido en su correspondiente soft skill. |
| RF4 | El sistema publica la lista de soft skills disponibles y de actividades específicas para cada una de las soft skills. |
| RF5 | El sistema contará con actividades interactivas. |
| RF6 | El sistema reconoce el progreso del usuario. |
| RF7 | El sistema guardará el progreso del usuario en un servidor. |
| RF8 | El sistema permite el acceso a contenido previamente completado. |
| RF9 | El sistema otorgará insignias por cada curso concluido. |
| RF10 | El sistema podrá validar que se está adquiriendo una soft skill (deseable). |
| RF11 | El sistema permitirá desbloquear contenido de acuerdo al avance del usuario. |

## Nonfunctional requirements

| ID | Description |
|----|-------------|
| **RNF1** | **Requerimientos de usabilidad** |
| RNF1.1 Comprensibilidad | La aplicación debe proporcionar un entorno de aprendizaje que los usuarios puedan entender fácilmente, permitiéndoles comprender cómo usarla para aprender y desarrollar habilidades blandas desde el primer contacto. |
| RNF1.2 Aprendibilidad | Debe ser fácil para los usuarios aprender a utilizar la aplicación, incluyendo la navegación por el contenido del curso, la participación en actividades de aprendizaje y la comprensión de cómo se evalúan sus habilidades blandas. |
| RNF1.3 Atractivo | La aplicación debe ser visual y funcionalmente atractiva( funcionalmente atractiva:= satisface las necesidades y expectativas de los usuarios de manera eficiente, haciendo que su experiencia sea no solo placentera desde el punto de vista estético sino también satisfactoria) para los usuarios, incentivando su uso continuado y compromiso con el contenido de aprendizaje. |
| **RNF2** | **Requerimiento de confiabilidad** |
| RNF2.1 | El progreso del usuario será persistente entre dispositivos |
| RNF2.2 | El contenido de los cursos y actividades casi siempre estarán disponibles para su consulta. |
| RNF2.3 | El sistema estará mayormente disponible durante las horas de mayor actividad o eventos de alto tráfico. Se espera que el tiempo de inactividad del sistema se mantenga dentro de límites aceptables, lo que resultará en una espera razonable por parte de los usuarios. |
| RNF2.4|El sistema debe ser capaz de reconocer el progreso del usuario en la mayoría de las ocasiones. Se espera que las fallas en el reconocimiento del progreso sean extremadamente raras y se deben evitar en la medida de lo posible. |
| **RNF3** | **Flexibilidad** |
| RNF3.1 | Se podrán agregar nuevos cursos y actividades al sistema fácilmente. |
| RNF3.2 | Se priorizará que la comunicación entre los módulos del sistema sea mínima, alta cohesión y bajo acoplamiento. (ASP net lo maneja) |
| RNF3.3 | Se podrá modificar un curso en específico sin afectar de alguna forma a los ya existentes y/o a la estructura del sistema. |
| RNF3.4 | El sistema permitirá adaptarse a cualquier base de datos haciendo mínimas modificaciones a la estructura del sistema. |
| RNR3.5 | El sistema permitirá adaptarse a la creciente cantidad de usuarios haciendo mínimas modificaciones al mismo. |
| **RNF4** | **Requerimiento de seguridad** |
| RNF4.1 | El usuario solo podrá acceder a su avance, contenido y actividades accediendo con su usuario y contraseña. |
| RNF4.2 | La cuenta del usuario se mantendrá abierta en el dispositivo y sólo se cerrará cuando el usuario la cierre manualmente |
