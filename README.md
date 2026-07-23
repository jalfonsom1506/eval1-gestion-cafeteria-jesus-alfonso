# Sistema de Gestión de Cafetería Java ☕

Breve aplicación desarrollada en Java enfocada en la gestión comercial de pedidos, facturación y control de inventario para un establecimiento de restauración. El proyecto ha sido profesionalizado aplicando metodologías y herramientas avanzadas de ingeniería de software.

## 🛠️ Tecnologías y Herramientas Aplicadas

* **Lenguaje:** Java 25 (JDK 25)
* **Gestor de Dependencias:** Maven (coordinación mediante `pom.xml`)
* **Testing Automático:** JUnit 5 (Pruebas unitarias automatizadas)
* **Documentación:** Javadoc (Manual técnico exportado en HTML interactivo)
* **Control de Versiones:** Git y GitHub aplicando flujo de trabajo por ramas (`main`, `dev`, `feature/*`)

## 📋 Requisitos para Compilar y Ejecutar

Para poder compilar y arrancar este proyecto en tu entorno local, asegúrate de cumplir con los siguientes prerrequisitos:
1. Tener instalado el **Java Development Kit (JDK 17 o superior)** (Recomendado JDK 25).
2. Tener instalado **Apache Maven** (o disponer de soporte Maven integrado en tu IDE como IntelliJ IDEA, VS Code o Eclipse).
3. Disponer de una terminal compatible con comandos Git.

## 🚀 Instrucciones de Uso

### 1. Compilación del Proyecto
Para compilar el código principal y descargar las librerías automáticamente mediante Maven, ejecuta en la raíz:
```bash
mvn clean compile
```

### 2. Ejecución de la Aplicación
Para iniciar el simulador de la cafetería y visualizar la generación del ticket con sus formatos de dos decimales, ejecuta:
```bash
mvn exec:java -Dexec.mainClass="Main"
```

### 3. Lanzar las Pruebas Unitarias (JUnit)
Para validar la lógica matemática de los descuentos y las sumas acumuladas de la factura, ejecuta la suite de testing automático:
```bash
mvn test
```

## 📂 Estructura del Repositorio

* `/src/main/java/` -> Código fuente de la lógica de negocio (Clases base, hijas e interfaz).
* `/src/test/java/` -> Clases de pruebas unitarias automatizadas con JUnit 5.
* `/docs/` -> Documentación técnica del software en formato HTML generada por Javadoc.
* `.gitignore` -> Configuración para excluir archivos basura e internos del IDE.

## ✒️ Autoría y Licencia

* **Autor:** Jesús Alfonso Muñoz
* **Curso:** 1º de Desarrollo de Aplicaciones Web (DAW)
* **Módulo:** Entornos de Desarrollo
* **Licencia:** Este proyecto es de uso académico y privado para la evaluación continua del módulo.
