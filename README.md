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
- **Crear usuario**
   - **URL: `/user/crear`**
   - **Metodo: `POST`**
   - **Descripcion:** Registra un nuevo usuario
   - **Cuerpo de la Solicitud:**
   
      { "nombre":"user" , "mail":"user98@gmail.com" , "password": "123456" }

     [![save-Usuario.png](https://i.postimg.cc/KcpdH2fV/save-Usuario.png)](https://postimg.cc/146C8bLc)

     [![save-Usuario-POSTMAN.png](https://i.postimg.cc/wvZn351z/save-Usuario-POSTMAN.png)](https://postimg.cc/yghLbZhp)

     [![Usuarios-My-SQL.png](https://i.postimg.cc/8C3ZbpNB/Usuarios-My-SQL.png)](https://postimg.cc/mcY3LGct)

     
 - **Listar todos los usuarios**
   - **URL: `/user`**
   - **Metodo: `GET`**
   - **Descripcion:** Retorna una lista en formato json de todos los usuarios registrados en la base de datos

      [![getUsers.png](https://i.postimg.cc/4yZ8MWMW/getUsers.png)](https://postimg.cc/VrGB0Wzt)

     [![Lista-de-usuarios-Postman.png](https://i.postimg.cc/QtZS96Xj/Lista-de-usuarios-Postman.png)](https://postimg.cc/mcV7Kyzn)


- **Obtener un usuario**
  - **URL:`/user/"{id}"`**
  - **Metodo: `GET`**
  - **Descripcion:** Obtiene un usuario determinado segun el id proporcionado en la url

    [![get-User-By-Id.png](https://i.postimg.cc/c4kpgNPZ/get-User-By-Id.png)](https://postimg.cc/CzDPX9F6)

    [![get-User-By-Id-POSTMAN.png](https://i.postimg.cc/cC4zCDmr/get-User-By-Id-POSTMAN.png)](https://postimg.cc/LYwD03Gp)

- ***Eliminar un usuario**
  - **URL: `/user/"{id}"`**
  - **Metodo: `DELETE`**
  - **Descripcion:** Elimina un usuario determinado mediante el id obtenido de la url,previamente en la capa service, elimina cada topico asociado a dicho usuario

   [![delete-User.png](https://i.postimg.cc/KY0BFJR9/delete-User.png)](https://postimg.cc/06Jb0GGm)

   [![delete-User-Service.png](https://i.postimg.cc/SRMM64V5/delete-User-Service.png)](https://postimg.cc/JHR089fc)

   [![delete-User-Querry.png](https://i.postimg.cc/t4HcwtZZ/delete-User-Querry.png)](https://postimg.cc/D8B5bGcn)


  ### Topico
  - **Crear topico**
    - **URL: `/topico`**
    - **Metodo: `POST`**
    - **Descripcion:** Registra un nuevo topico
    - **Cuerpo de la Solicitud:**

      {
    "titulo":"as230fgsdag",
    "mensaje":"gjlgsdh120.ask",
    "fechaCreacion": "12/7/2024",
    "autor": {
        "nombre":"TobPlas",
        "mail":"Tobplas68@gmail.com",
        "password": "$2y$10$Wqo.nOGe3Qcb.gW1uzuFg.NkytXnJwe5a9t.jKp.x.BE5QIF6vPcO"
    },
    "status": "Ok",
    "curso": "Matematica"
}










  

