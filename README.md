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
- **Stream**


### Endpoints

#### Usuario 
- **Crear usuario**
   - **URL: `/user/crear`**
   - **Metodo: `POST`**
   - **Descripcion:** Registra un nuevo usuario
   - **Cuerpo de la Solicitud:**
   
      { "nombre":"user" , "mail":"user98@gmail.com" , "password": "123456" }
 
     **Controller**

     [![save-Usuario.png](https://i.postimg.cc/KcpdH2fV/save-Usuario.png)](https://postimg.cc/146C8bLc)
 
      **Service**

     [![Save-Usuario-Service.png](https://i.postimg.cc/RCgj7qNN/Save-Usuario-Service.png)](https://postimg.cc/5jF7145V)

     [![save-Usuario-POSTMAN.png](https://i.postimg.cc/wvZn351z/save-Usuario-POSTMAN.png)](https://postimg.cc/yghLbZhp)

     [![Usuarios-My-SQL.png](https://i.postimg.cc/8C3ZbpNB/Usuarios-My-SQL.png)](https://postimg.cc/mcY3LGct)

     
 - **Listar todos los usuarios**
   - **URL: `/user`**
   - **Metodo: `GET`**
   - **Descripcion:** Retorna una lista en formato json de todos los usuarios registrados en la base de datos

      **Controller**
      
      [![getUsers.png](https://i.postimg.cc/4yZ8MWMW/getUsers.png)](https://postimg.cc/VrGB0Wzt)
  
      **Service**
  
      [![find-all-Usuario-Service.png](https://i.postimg.cc/DZyx0dQ5/find-all-Usuario-Service.png)](https://postimg.cc/hJ6L3m57)

      [![Lista-de-usuarios-Postman.png](https://i.postimg.cc/QtZS96Xj/Lista-de-usuarios-Postman.png)](https://postimg.cc/mcV7Kyzn)


- **Obtener un usuario**
  - **URL:`/user/"{id}"`**
  - **Metodo: `GET`**
  - **Descripcion:** Obtiene un usuario determinado segun el id proporcionado en la url
 
    **Controller**

    [![get-User-By-Id.png](https://i.postimg.cc/c4kpgNPZ/get-User-By-Id.png)](https://postimg.cc/CzDPX9F6)

    **Service**
    
    [![find-Usuario-by-id-Service.png](https://i.postimg.cc/Vv0B07J9/find-Usuario-by-id-Service.png)](https://postimg.cc/dZvTzjmD)

    [![get-User-By-Id-POSTMAN.png](https://i.postimg.cc/cC4zCDmr/get-User-By-Id-POSTMAN.png)](https://postimg.cc/LYwD03Gp)

- ***Eliminar un usuario**
  - **URL: `/user/"{id}"`**
  - **Metodo: `DELETE`**
  - **Descripcion:** Elimina un usuario determinado mediante el id obtenido de la url,previamente en la capa service, elimina cada topico asociado a dicho usuario

   **Controller**
   
   [![delete-User.png](https://i.postimg.cc/KY0BFJR9/delete-User.png)](https://postimg.cc/06Jb0GGm)

   **Service**

   [![delete-User-Service.png](https://i.postimg.cc/SRMM64V5/delete-User-Service.png)](https://postimg.cc/JHR089fc)

   [![delete-User-Querry.png](https://i.postimg.cc/t4HcwtZZ/delete-User-Querry.png)](https://postimg.cc/D8B5bGcn)


  ### Topico
  - **Crear topico**
    - **URL: `/topico`**
    - **Metodo: `POST`**
    - **Descripcion:** Registra un nuevo topico
    - **Cuerpo de la Solicitud:**

      { 
    "titulo":"Desarrollando una api con spring boot", 
    "mensaje":"Hoy nos vamos a poner a trabajar en el desarrollo de una api rest", 
    "fechaCreacion": "08/09/1998", 
    "autor": {
        "nombre":"user", 
        "mail":"user98@gmail.com", 
        "password": "123456" 
    }, 
    "status": "Ok", 
    "curso": "Programacion" 
} 

   **Controller**

   [![Save-Topico.png](https://i.postimg.cc/9fMt2NFX/Save-Topico.png)](https://postimg.cc/K16grfMC)

   **Service**

   [![Save-Topico-service.png](https://i.postimg.cc/KYwp4gzM/Save-Topico-service.png)](https://postimg.cc/Y4Nzs0Qr)

   [![Save-Topico-POSTMAN.png](https://i.postimg.cc/509cfJQY/Save-Topico-POSTMAN.png)](https://postimg.cc/wtr4kSVg) 

   [![TopicoBD.png](https://i.postimg.cc/rsPzSQ2j/TopicoBD.png)](https://postimg.cc/GTvcRP2T) 


 - **Listar topicos**
    - **URL: `/topico`**
    - **Metodo: `GET`**
    - **Descripcion:** Retorna un listado con todos los topicos
   
   **Controller**

   [![find-all-topico.png](https://i.postimg.cc/CLxCTxMT/find-all-topico.png)](https://postimg.cc/vDCx5M63)

   **Service**

   [![find-all-topico-service.png](https://i.postimg.cc/44Bt5R68/find-all-topico-service.png)](https://postimg.cc/jCnLx9kN)

   [![find-all-topico-postman.png](https://i.postimg.cc/WzwdYKfw/find-all-topico-postman.png)](https://postimg.cc/p5yVp0vm)


 - **Listar topicos por curso**
    - **URL: `/topico/{curso}`**
    - **Metodo: `GET`**
    - **Descripcion:** Retorna un listado con todos los topicos del curso especificado

   **Controller**

   [![Find-By-Curso.png](https://i.postimg.cc/g2bp9wPg/Find-By-Curso.png)](https://postimg.cc/gnsQ82jh)

   **Service**

   [![Find-By-Curso-service.png](https://i.postimg.cc/y6JWsSwK/Find-By-Curso-service.png)](https://postimg.cc/Th6TchdN)

   **Repository**

   [![Find-By-Curso-repository.png](https://i.postimg.cc/XqFVF9by/Find-By-Curso-repository.png)](https://postimg.cc/9wm5HRzW)

   [![Find-By-Curso-postman.png](https://i.postimg.cc/Bv64pr33/Find-By-Curso-postman.png)](https://postimg.cc/nX6ycwMS)


- **Seleccionar topico por id **
    - **URL: `/topico/id={id}`**
    - **Metodo: `GET`**
    - **Descripcion:** Retorna el topico con el id especificado

   **Controller**
  
   [![Find-By-id.png](https://i.postimg.cc/kMx3QJS8/Find-By-id.png)](https://postimg.cc/6T5mwNY5)

  **Service**

   [![Find-By-id-service.png](https://i.postimg.cc/44124mt8/Find-By-id-service.png)](https://postimg.cc/7bfnmPK7)

   [![Find-By-id-postman.png](https://i.postimg.cc/T1PV3YMS/Find-By-id-postman.png)](https://postimg.cc/9RvRx2ft)

  
- **Seleccionar topico por nombre de usuario **
    - **URL: `/topico/name={nombre}`**
    - **Metodo: `GET`**
    - **Descripcion:** Retorna una lista de los topicos de un determinado usuario segun su nombre

      **Controller**
      
      [![Find-By-name.png](https://i.postimg.cc/xTJmxZ0K/Find-By-name.png)](https://postimg.cc/56JjjnQ0)

      **Service**

      [![Find-By-name-service.png](https://i.postimg.cc/76hhCChg/Find-By-name-service.png)](https://postimg.cc/dkMwpV81)

      **Repository**

      [![Find-By-name-repository.png](https://i.postimg.cc/YCtWrC6x/Find-By-name-repository.png)](https://postimg.cc/N5PMbYPy)

      [![Find-By-name-postman.png](https://i.postimg.cc/DwWKbqPf/Find-By-name-postman.png)](https://postimg.cc/TKXsz5sB)



  - **Editar un topico **
    - **URL: `/topico/{id}`**
    - **Metodo: `PUT`**
    - **Descripcion:** Edita un topico determinado especificado mediante el id, y pasando los datos nuevos en el cuerpo de la solicitud. Los campos que se pueden editar son: Mensaje , Titulo y Curso
    - **Cuerpo de la Solicitud:**
      { "titulo" : "Conociendo los elementos"  , "mensaje" : "Hoy vamos a conocer los elementos de la tabla periodica" }
      
    **Controller**

   [![editar-topico.png](https://i.postimg.cc/rsrFffhF/editar-topico.png)](https://postimg.cc/m1TsDyf0)

    **Service**

   [![editar-topico-service.png](https://i.postimg.cc/26kVkpzq/editar-topico-service.png)](https://postimg.cc/jW1scFnK)

  
    

