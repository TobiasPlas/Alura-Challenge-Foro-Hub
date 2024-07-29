# API FORO-HUB

### Descripción

Esta API proporciona las funcionalidades necesarias para gestionar un foro en línea. Permite a los usuarios registrarse, crear temas, publicar respuestas, y más.

### Tecnologías Utilizadas

- **Java 17**
- **Spring Boot 3.3.1**
- **Hibernate**
- **MySQL Database**
- **Maven**

### Librerias Utilizadas

- **Spring data jpa**
- **Spring Validation**
- **Spring web**
- **Spring devtools**
- **Spring security**
- **Flyway-core**
- **Flyway-mysql**
- **MySQL Driver**
- **Lombok**


### Endpoints

#### Usuario 

- **URL: `/user/crear`**
- **Metodo: `POST`**
- **Descripcion:Registra un nuevo usuario**
- **Cuerpo de la Solicitud:**
   
   { "nombre":"user" , "mail":"user98@gmail.com" , "password": "123456" }

  [![save-Usuario.png](https://i.postimg.cc/KcpdH2fV/save-Usuario.png)](https://postimg.cc/146C8bLc)

  [![save-Usuario-POSTMAN.png](https://i.postimg.cc/wvZn351z/save-Usuario-POSTMAN.png)](https://postimg.cc/yghLbZhp)

  [![Usuarios-My-SQL.png](https://i.postimg.cc/8C3ZbpNB/Usuarios-My-SQL.png)](https://postimg.cc/mcY3LGct)
 
  
