![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Sumativa 1: Realizando validación, excepciones y relaciones entre clases. – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** [Benjamín Andrés Fernández-Niño Morales]
- **Sección:** [003A]
- **Carrera:** Analista Programador Computacional
- **Sede:** [Modalidad Online]

---

## 📘 Descripción del proyecto

**SalmonttApp** es una aplicación Java que representa digitalmente las unidades operativas de la salmonera ficticia **Salmontt** mediante una jerarquía de clases orientada a objetos.

Funcionalidades implementadas:
- Jerarquía de clases con herencia (UnidadOperativa → CentroCultivo y PlantaProceso)
- Reutilización de código mediante atributos y comportamientos comunes
- Sobrescritura correcta de toString() con polimorfismo
- Carga automática de datos desde archivos .txt ubicados en resources/
- Uso de paquetes organizados por responsabilidad (model, data, ui)
- Javadoc completo y profesional en todas las clases
- Manejo de errores en lectura de archivos
- Estructura limpia y escalable para futuras funcionalidades

---

## 🧱 Estructura general del proyecto

Sem6_POO_BenjaminFernandezNino/
├── src/
│   ├── model/
│   │   ├── UnidadOperativa.java
│   │   ├── CentroCultivo.java
│   │   └── PlantaProceso.java
│   ├── data/
│   │   └── GestorUnidades.java
│   └── ui/
│       └── Main.java
├── resources/                    
│   ├── centros.txt
│   └── plantas.txt
├── README.md



## ✅Requisitos

- **Java JDK 17 o superior**
- **IntelliJ IDEA** (recomendado) o cualquier IDE Java
- Sistema operativo: Windows, macOS o Linux

## ⚙️ ## Instrucciones para Compilar y Ejecutar

### Opción 1 – Desde IntelliJ IDEA (recomendado para desarrollo)
1. Abre IntelliJ IDEA
2. Selecciona **Open** → busca la carpeta del proyecto
3. Espera a que Maven cargue las dependencias automáticamente
4. Abre la clase `com.salmontt.ui.Main`
5. Haz clic en el botón verde ▶️ o presiona **Shift + F10**
6. ¡Listo! La salida aparece en la consola

```bash
---

**Repositorio GitHub:** \[https://github.com/befernandezninoduoc/Sem6_POO_BenjaminFernandezNino.git]
**Fecha de entrega:** \[01/12/2025]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Sumativa 1: Realizando validación, excepciones y relaciones entre clases.
