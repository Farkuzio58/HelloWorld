# Proyecto Hello World

## Descripción del proyecto
Este proyecto simple se compone de una Activity que muestra por pantalla Hola Mundo Muy Malo.

## Acciones realizadas

He creado un LinearLayout vertical con dos TextView en su interior (tvMessageStart y tvMessageEnd), los cuales cada uno ocupa un 50% del espacio.

Cada TextView tiene un backgound, el cual es un color definido manualmente desde color.xml.
También tienen un string asociado desde el atributo text, cada string está definido manualmente desde strings.xml, donde también he modificado el string "app_name", el cual está generado automáticamente con la creación del proyecto y su contenido es el nombre de la aplicación.
Se les ha modificado el textSize a 50dp.
Al iniciar la aplicación, se cambia el atributo text a tvMessageEnd mediante java en el archivo MainActivity.java.

También se han eliminado todas las carpetas (6) de iconos para la aplicación para posteriormente sustituirlas con nuestro propio icono personalizado.

He creado un Javadoc en la carpeta HelloWorld/app/doc, posteriormente he comentado en HelloWorld/app/build.gradle.kts la línea de código con la dependencia a necesaria para generar el Javadoc, ya que si no es comentada el proyecto no puede ser compilado.

He configurado el archivo gitignore para no subir a GitHub la carpeta .idea, la cual contiene configuraciones del proyecto.

He creado un Repositorio en GitHub.

## Contenidos aprendidos:
- Creación de colores
- Creación de strings
- Creación de iconos
- Uso de Layouts
- Uso de TextView
- Creación de datos con Data Binding y con código
- Generación de Javadoc
- Configuración del gitignore
- Creación de repositorio en GitHub

## Aspecto de la aplicación

![](https://drive.google.com/uc?export=view&id=1DPHuqRAqmnPbqGbwDJr9S-eWdajWPkzJ)