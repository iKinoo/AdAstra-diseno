# ISO/IEC 25010
El modelo de calidad es la piedra angular de un sistema de evaluación de calidad del producto. El modelo de calidad determina qué características de calidad se tendrán en cuenta al evaluar las propiedades de un producto de software.

La calidad de un sistema es el grado en que el sistema satisface las necesidades declaradas e implícitas de sus diversos interesados, y por lo tanto proporciona valor. Las necesidades de esos interesados (funcionalidad, rendimiento, seguridad, mantenibilidad, etc.) son precisamente lo que se representa en el modelo de calidad, que categoriza la calidad del producto en características y subcaracterísticas.

El modelo de calidad del producto definido en ISO/IEC 25010 comprende las nueve características de calidad mostradas en la siguiente figura:

[![iso-25010-en.png](https://i.postimg.cc/Gm2SNTXz/iso-25010-en.png)](https://postimg.cc/56h3QydF)

## Seguridad
Grado en que un producto o sistema se defiende contra patrones de ataque por actos maliciosos y protege la información y los datos para que las personas u otros productos o sistemas tengan el grado de acceso a los datos apropiado para sus tipos y niveles de autorización. Esta característica está compuesta por las siguientes subcaracterísticas:

- Confidencialidad: Grado en que un producto o sistema garantiza que los datos solo sean accesibles para aquellos autorizados a tener acceso.

- Integridad: Grado en que un sistema, producto o componente asegura que el estado de su sistema y datos estén protegidos contra modificaciones o eliminaciones no autorizadas, ya sea por acción maliciosa o error informático.

- No repudio: Grado en que acciones o eventos pueden ser demostrados que han tenido lugar para que los eventos o acciones no puedan ser negados más tarde.

- Responsabilidad: Grado en que las acciones de una entidad pueden ser rastreadas de manera única hasta la entidad.

- Autenticidad: Grado en que la identidad de un sujeto o recurso puede demostrarse que es la que se reclama.

- Resistencia: Grado en que el producto o sistema mantiene sus operaciones mientras está siendo atacado por un actor malicioso.


| No Funcional | Descripción                                                                                                       |
|--------------|-------------------------------------------------------------------------------------------------------------------|
| RNF 6.1      | El usuario solo podrá acceder a su avance, contenido y actividades accediendo con su usuario y contraseña.       |
| RNF 6.2      | La cuenta del usuario se mantendrá abierta en el dispositivo y sólo se cerrará cuando el usuario la cierre manualmente. |

## Caso de uso

El Sistema de Información Académica (AIS) es una herramienta CASE que puede mejorar la eficiencia y eficacia operativa de una universidad. Es necesario garantizar su calidad de seguridad. Además, AIS tiene características diferentes a otros software. Este estudio tiene como objetivo establecer un marco para medir la calidad de la seguridad en el dominio de aplicaciones AIS. 
El marco está construido sobre la base del modelo de calidad ISO/IEC 25010. El marco resultante demostró que puede medir 20 aspectos de seguridad adicionales y producir un valor de seguridad agregado en comparación con el estándar de medición de calidad existente. También puede mejorar la calidad del sistema de estudio de caso con un aumento en el valor de seguridad del 15,6%.  

Para determinar las propiedades de las mediciones, se define el objetivo de medición de cada subcaracterística sobre la calidad de seguridad. El objetivo se puede definir identificando qué queremos saber y qué información debe representarse mediante la medición de cada subcaracterística. En esta etapa también se determina la entidad objetivo a medir. La entidad objetivo puede ser un producto, un comportamiento del sistema o partes interesadas como un usuario, desarrollador o mantenedor de AIS. 

Luego se determinan las propiedades de la entidad objetivo asociada con cada objetivo de medición de subcaracterística. La propiedad debe poder representarse mediante números.
El siguiente paso es determinar el método de medición que proporciona un paso para transformar los valores de propiedad que se obtuvieron en la etapa anterior para producir un valor que represente el propósito de medir la calidad de cada subcaracterística de seguridad. El método se genera en forma de función matemática con una unidad de medida estándar. En esta etapa también se especificó la limitación de las mediciones. Los parámetros de medición se determinan mapeando las necesidades de AIS en los estándares de calidad de seguridad ISO/IEC 25010 e ISO/IEC 27002.


El marco propuesto tiene un método de medición jerárquico, donde las métricas de medición están en el nivel más bajo que formará los valores de las subcaracterísticas. Cada métrica y subcaracterística se pondera en una escala de 0 a 1 de acuerdo con los requisitos de seguridad en el dominio de la aplicación AIS. La ponderación del método de medición del marco propuesto se realiza mediante el proceso de jerarquía analítica (AHP) utilizado por Bekhamal, Kahani y Kazem. El proceso de ponderación se lleva a cabo determinando el nivel de importancia de cada métrica y subcaracterística mediante cuestionarios. Se distribuyeron cuestionarios a seis expertos, entre los que se incluyen académicos y profesionales del campo de la seguridad del software y/o AIS. A continuación se explica cada una de las subcaracterísticas y la ponderación. $1$.

## Referencias

$1$. Saptarini, I., Rochimah, S., & Yuhana, U. L. (2017). Security Quality Measurement Framework for Academic Information System (AIS) Based on ISO/IEC 25010 Quality Model. IPTEK Journal of Proceedings Series, 3(2), 128-135. https://iptek.its.ac.id/index.php/jps/article/view/2310