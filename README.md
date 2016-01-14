# config-client
Ejemplo de cliente para utilizar con Config Server

Este proyecto está dividido en tres repositorios:
* [config-server](https://github.com/beeva-manuelduran/config-server): Repositorio con el Config Server encargado de gestionar los cambios realizados en el repositorio de Git para actualizar las propiedades. En este proyecto puedes encontrar toda la información necesaria.
* [config-repo](https://github.com/beeva-manuelduran/config-repo): Repositorio con los ficheros de propiedades
* [config-client](https://github.com/beeva-manuelduran/config-client): Repositorio con un ejemplo de cliente conectado al Config Server y al Cloud Bus.

## Configuración
Hay que añadir una mínima información al fichero `bootstrap.properties` cargado por Spring Boot al arrancar la aplicación:
- `spring.cloud.config.uri`: url del Config Server
- `spring.application.name`: nombre de la aplicación. Coincidirá con la variable `application` en el Config Server.
- `spring.profiles.active`: perfiles activos, separados por comas. Corresponde a la variable `profile` en el Config Server.

En el fichero de propiedades `applicacion.properties` es necesario indicar, como mínimo, `host`, `port`, `username` y `password` de la cola de mensajes para su conexión.
