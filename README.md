# MetroMendeley: Tablas de Dispersión (Hash Table)

## Descripción del Proyecto
MetroMendeley es un sistema de administración de artículos científicos diseñado para apoyar el trabajo de los investigadores. El programa utiliza **tablas de dispersión (Hash Tables)** para almacenar y buscar resúmenes de investigaciones científicas, permitiendo realizar búsquedas rápidas y análisis eficientes. La solución incluye una interfaz gráfica que mejora la interacción del usuario y emplea estructuras de datos eficientes para ofrecer un desempeño óptimo.

## Objetivos
1. Desarrollar un programa en **Java** que permita administrar resúmenes de investigaciones científicas mediante tablas de dispersión.
2. Implementar funcionalidades que optimicen la búsqueda y el análisis de palabras clave y autores en los resúmenes.
3. Ofrecer una interfaz gráfica intuitiva para facilitar la interacción con el sistema.

---

## Requerimientos Funcionales
1. **Agregar Resumen**  
   - Cargar un archivo de texto que contenga el resumen de una investigación.
   - Utilizar el título de la investigación como clave única generada por una función hash personalizada.
   - Almacenar información como título, autores, cuerpo del resumen y palabras clave en una tabla de dispersión.
   - Validar que no se ingresen resúmenes duplicados.

2. **Analizar Resumen**  
   - Listar las investigaciones almacenadas en orden alfabético.
   - Permitir al usuario seleccionar una investigación.
   - Mostrar estadísticas sobre la frecuencia de aparición de palabras clave en el resumen.

3. **Buscar Investigaciones por Palabra Clave**  
   - Buscar y listar investigaciones relacionadas con una palabra clave.
   - Permitir al usuario seleccionar una investigación para ver sus detalles.

4. **Buscar Investigaciones por Autor**  
   - Listar las investigaciones de un autor o coautor seleccionado por el usuario.
   - Mostrar detalles de las investigaciones seleccionadas.

5. **Salir del Sistema**  
   - Guardar la información de los resúmenes para que esté disponible en futuras ejecuciones.

---

## Requerimientos Técnicos
1. **Tablas de Dispersión**  
   - Utilizar tablas hash para garantizar una complejidad cercana a **O(1)** en operaciones de búsqueda e inserción.
   - Desarrollar una función hash eficiente basada en el título de las investigaciones.

2. **Interfaz Gráfica**  
   - Implementar una interfaz gráfica para mejorar la experiencia del usuario.
   - Proveer una navegación clara y amigable.

3. **Precarga de Datos**  
   - Precargar un conjunto de investigaciones al iniciar el sistema.

4. **Persistencia de Datos**  
   - Garantizar que la información almacenada persista entre ejecuciones.
