# SISTEMA DE REGISTRO DE USUARIOS CON MANEJO DE EXCEPCIONES

## ESTUDIANTE:

NOMBRE: Anderson Duran Hernandez

## MATRICULA:

MATRICULA: 10005367

## MATERIA:

Programacion 3

## DESCRIPCION:

Este proyecto consiste en una aplicación de consola desarrollada en Java que permite registrar usuarios mediante un sistema de validación de datos y manejo de excepciones. El objetivo principal del proyecto es aplicar los conceptos fundamentales del manejo de excepciones en Java, garantizando que la información ingresada por el usuario sea correcta antes de ser registrada.

La aplicación presenta un menú interactivo que permite registrar usuarios o salir del sistema. Durante el proceso de registro, se solicitan los datos personales del usuario y se realizan diferentes validaciones para asegurar la integridad de la información.

Las funcionalidades incluidas en el sistema son:

Registro de usuarios
Permite ingresar el nombre, edad, correo electrónico y salario mensual de un usuario.

Validación de nombre
Verifica que el nombre no esté vacío y que contenga al menos tres caracteres.

Validación de edad
Comprueba que la edad sea mayor o igual a 18 años y menor o igual a 100 años.

Validación de correo electrónico
Verifica que el correo contenga los caracteres "@" y "." para considerarse válido.

Validación de salario
Comprueba que el salario ingresado sea mayor que cero.

Manejo de excepciones personalizadas
Utiliza excepciones creadas por el desarrollador para controlar errores específicos relacionados con nombre, edad, correo y salario.

Manejo de excepciones del sistema
Controla errores de entrada de datos mediante InputMismatchException cuando el usuario introduce texto en lugar de números.

Mensajes de error personalizados
Muestra mensajes descriptivos utilizando el método getMessage() para informar al usuario sobre la causa del error.

Finalización del proceso
Utiliza el bloque finally para indicar la finalización del proceso independientemente del resultado de la validación.

Salir de la aplicación
Permite finalizar la ejecución del programa de manera segura.

## TECNOLOGIAS UTILIZADAS

Java

JDK 25

Visual Studio Code

Git

GitHub

### Estructura del Proyecto


### Estructura del Proyecto

### Estructura del Proyecto

```text
Tarea Manejo de Excepciones
├── Evidencias
│   ├── registro-exitoso.png
│   ├── error-nombre.png
│   ├── error-edad.png
│   ├── error-correo.png
│   ├── error-salario.png
├── CorreoInvalidoException.java
├── CorreoInvalidoException.class
├── EdadInvalidaException.java
├── EdadInvalidaException.class
├── Main.java
├── Main.class
├── NombreInvalidoException.java
├── NombreInvalidoException.class
├── SalarioInvalidoException.java
├── SalarioInvalidoException.class
├── ValidadorUsuario.java
├── ValidadorUsuario.class
└── README.md
```


## CONCEPTOS APLICADOS

* try
* catch
* múltiples catch
* finally
* throw
* throws
* getMessage()
* Excepciones personalizadas
* InputMismatchException
* Programación Orientada a Objetos
* Validación de datos
* Menús interactivos
