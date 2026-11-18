<div align="center">

# 🎓 Gestor de Alumnos

**Gestiona los alumnos de un curso desde la consola: altas, notas y estadísticas.**

![Estado](https://img.shields.io/badge/estado-terminado-50FA7B?style=for-the-badge&labelColor=1e0940)
![Java](https://img.shields.io/badge/java-24-ff8fd0?style=for-the-badge&logo=openjdk&logoColor=white&labelColor=1e0940)
![Tipo](https://img.shields.io/badge/consola-CLI-bd93f9?style=for-the-badge&labelColor=1e0940)

</div>

---

## 🌸 ¿Qué es?

Un programa por consola para llevar las notas de una clase. Le dices cuántos alumnos caben en el curso y a partir de ahí puedes darlos de alta, buscarlos por DNI, cambiarles las notas de **Programación** y **Base de Datos** y ver las estadísticas de todo el curso.

Lo hice para practicar **POO en Java**: clases, objetos y arrays de objetos.

---

## 🌙 Así se ve

```text
Introduce el tamaño de alumnos : 10

|=== === MENU === ===|

0.- Salir
1.- Alta alumno
2.- Listar alumnos
3.- Buscar alumnos por dni y mostrarlo
4.- Modificar nota de Programación
5.- Modificar nota de BD
6.- Mostrar estadísticas del curso
7.- Eliminar alumno
8.- Simulación

Introduce la opcion deseada : 1

Introduce su DNI (7 numeros y 1 letra): 1234567
Error : Debe tener 8 caracteres
```

---

## ⚔️ Qué puede hacer

| Opción | Qué hace |
|---|---|
| **Alta alumno** | Pide DNI, nombre y las dos notas, y lo guarda en el curso |
| **Listar alumnos** | Enseña todos los alumnos con sus notas |
| **Buscar por DNI** | Encuentra a un alumno y muestra sus datos |
| **Modificar notas** | Cambia la nota de Programación o de BD |
| **Estadísticas** | Medias y resumen del curso |
| **Eliminar alumno** | Lo quita del curso |
| **Simulación** | Rellena el curso con datos de prueba para probarlo rápido |

---

## 🏮 Cómo está hecho

- **Dos clases:** `Alumno` (los datos de cada alumno) y `Curso` (el menú y la lista de alumnos).
- **Encapsulación:** atributos privados con getters y setters.
- **Constructores** para crear cada alumno con sus datos.
- **Array de objetos:** cada alta ocupa la siguiente posición libre y el índice avanza para el siguiente.
- **Validación del DNI:** tiene que tener 8 caracteres (7 números y 1 letra).

---

## ⚡ Cómo ejecutarlo

Necesitas **Java** instalado. Desde la carpeta del proyecto:

```bash
# compila todo en la carpeta out
javac -encoding UTF-8 -d out *.java

# arranca el programa
java -cp out gestor_curso.Curso
```

También puedes abrirlo en **NetBeans** y darle a ▶ Run.

---

<div align="center">

<sub>Hecho por <a href="https://github.com/Diaz003">Zaid</a> · proyecto de clase de POO en Java 🌸</sub>

</div>
