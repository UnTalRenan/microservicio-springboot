
# Microservicios con Spring Boot y Spring Cloud

![Spring Boot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/postgresql-4479A1?style=for-the-badge&logo=mysql&logoColor=white)


## 🚀 Descripción General

Este repositorio contiene un ejemplo práctico y completo de una **arquitectura de microservicios** desarrollada con el ecosistema de **Spring Boot y Spring Cloud**. El objetivo principal es demostrar cómo diferentes servicios pueden colaborar entre sí, gestionando la configuración, el descubrimiento y la comunicación de manera centralizada.

El proyecto simula una aplicación básica de donde se registra personas/vehiculos en una base de datos Mysql y Postgresql.

## ![PostgreSQL](https://img.shields.io/badge/youtube-f44336?style=for-the-badge&logo=youtube&logoColor=white) Explicación Detallada en YouTube 📺

Explicación el código y pruebas con postman de cada microservicio está disponible en la siguiente lista de reproducción de YouTube. ¡Ideal si quieres entender el porqué de cada pieza de código!

<a href="URL_DE_TU_PLAYLIST_DE_YOUTUBE" title="Ver explicación en YouTube">
  <img src="https://i.ytimg.com/vi/2jp_eu1dPvw/hqdefault.jpg" alt="Explicación en YouTube" width="480"/>
</a>

**[➡️ Ver la lista de reproducción en YouTube](https://www.youtube.com/playlist?list=PLOwXhVwAXdAHJE7gIxGOANFDi3eV1pzaY)**

## 💡 Microservicios Incluidos

El ecosistema está compuesto por los siguientes servicios:

| Servicio                            | Puerto | Descripción                                                                                                |
| ----------------------------------- | ------ | ---------------------------------------------------------------------------------------------------------- |
| **`microservicio-eureka-server`** | 8762   | **Service Discovery:** Actúa como el servidor de registro y descubrimiento (usando Netflix Eureka). Permite que los demás servicios se encuentren dinámicamente en la red. |
| **`microservicio-gateway-server`** | 80   | **API Gateway:** Es el punto de entrada único para todas las peticiones externas. Enruta las solicitudes al microservicio correspondiente y puede manejar el balanceo de carga. |
| **`microservicio-personas`** | 8001   | **Servicio de Personas (clientes):** Gestiona toda la lógica de negocio relacionada con guardar registro de clientes/personas en la base de datos (crear, leer, actualizar, eliminar). |
| **`microservicio-vehiculo`** | 9091   | **Servicio de Vehiculo:** Gestiona toda la lógica de negocio relacionada con guardar registro de vehiculo/articulo en la base de datos (crear, leer, actualizar, eliminar). |
| **`proximamante-otros (verificar las nuevas ramas)..`** | 0001   | proximamente: configuración centralizada, manejo de errores, encriptamiento, cron etc.. |

## 🛠️ Tecnologías y Patrones

- **Lenguaje:** Java 17+
- **Framework:** Spring Boot
- **Gestión de dependencias:** Gradle

## ✒️ Autor

* **Renan** - [UnTalRenan](https://github.com/UnTalRenan)

---
