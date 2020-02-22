# ecommerceApp
App for ecommerce (TEST)

## Para ejecutar el proyecto se debe hacer da la siguiente manera

* Tener una instalado MySql
* Crear un esquema llamado ecommerce_db

## Configurar proyectos apicustomer, apiproduct y appbuy
Modiifcar el archivo application.properties en los proyectos apicustomer, apiproduct y appbuy de la siguiente manera:

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=Pass@word1
server.port=8788

### NOTA: 
* Se debe configurar un puerto diferente para cada proyecto. server.port=XXXX
* Los valores de username y password pueden ser los que normalmente se usan para concetarse a la base de datos.

## Configurar el proyecto apigateway
Modiifcar el archivo application.properties en el proyectos apigateway de la siguiente manera:
server.port=8790

### NOTA:
Este valor debe ser diferente al de los otros tres proyectos

## Arrancar el proyecto
Para arrancar el proyecto se debe ejecutar primero los servicios apicustomer, apiproduct y appbuy. Esto se hace de la siguiente manera:
Dar clic derecho sobre el proyecto y seleccionar Run > Spring Boot App. 
Una vez han iniciado los tres proyectos se procede a ejecutar el proyecto apigateway de la misma manera. Clic derecho > Run > Spring Boot App


