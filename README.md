# 🚀 Proyecto POO: Catálogo de Contenidos Audiovisuales

<h1>📌 1. Objetivos y Propósito del Proyecto </h1>
<p>
Este proyecto tiene como propósito principal ampliar y mejorar un sistema de gestión de contenidos audiovisuales en Java, aplicando y demostrando conceptos avanzados de la Programación Orientada a Objetos (POO).
</p>

<h4>📌Conceptos de POO Implementados: </h4> 

- Herencia: Uso de la clase abstracta ContenidoAudiovisual para generar diferentes tipos de contenido (Pelicula, SerieDeTV, Clip, Film, Documental).
- Polimorfismo: Implementación del método abstracto mostrarDetalles() en cada subclase.
- Encapsulamiento: Uso de atributos private con getters y setters.
- Relaciones: Implementación de Asociación, Agregación y Composición entre clases.

<h2>🌟 2. Clases y Funcionalidades Nuevas Añadidas </h2> 
Se han incorporado tres clases de relación y dos nuevas subclases de contenido, extendiendo significativamente el modelo original.

Clase Nueva | Relación Implementada | Clase Contenedora | Funcionalidad Clave
------------- | -------------------------- | ---------------------- | -----------------------
Temporada | Composición  |SerieDeTV | Maneja el número de temporada y episodios. [cite: 34]
Investigador | Agregación  | Documental |Representa expertos asociados al tema principal. [cite: 35]
Actor |Asociación  | Pelicula|Maneja el elenco principal de la película. [cite: 33]

<h3>Nuevas Subclases (Iniciativa Propia)</h3>

- Clip: Hereda de ContenidoAudiovisual. Atributos/Métodos Específicos: plataformaOrigen, esPromocional, compartir().
- Film: Hereda de ContenidoAudiovisual. Atributos/Métodos Específicos: director, presupuestoMillones, obtenerPresupuesto().

<h2>🛠️ 3. Instrucciones de Instalación y Uso</h2>
Este proyecto está configurado para ser ejecutado en el entorno de desarrollo Eclipse con Java (JRE).
<h3> Requisitos</h3>

- Java Development Kit (JDK) instalado. 
- Eclipse IDE para Java Developers.
- Git para clonar el repositorio.

<h4>Pasos para Clonar y Ejecutar</h4>

1. **Clonar el Repositorio:** Utiliza el siguiente enlace para obtener el código fuente:
```
git clone [ENLACE DE TU REPOSITORIO]
```
2. **Importar en Eclipse:** En Eclipse, ve a File > Import > Git > Projects from Git > Existing local repository.
3. **Ejecutar:** El punto de entrada del sistema es la clase poo.PruebaAudioVisual.java. Ejecuta el método main de esta clase para ver la demostración de todas las relaciones y funcionalidades. 

<h2>📈 4. Evidencia de Gestión del Proyecto</h2>
- Estructura del Proyecto: El código fuente se encuentra en la carpeta src/main/java.
- Commits Mínimos: El proyecto incluye un mínimo de 3 commits adicionales para trazar el progreso de las Etapas 2 y 4.
+ **Mejoras Adicionales:**
 * Robustez del Código: Validación en Setters
 * Claridad y Mantenimiento: Sobreescritura en mostrarDetalles()
 * Usabilidad y Buenas Prácticas: Abstracción de Duración

![](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6Ge6246HLa9r6GwERAAcubqhkTHC_B-_ALA&s)
