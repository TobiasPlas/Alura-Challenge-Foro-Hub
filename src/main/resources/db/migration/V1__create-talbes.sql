CREATE TABLE Usuario (
      id BIGINT AUTO_INCREMENT PRIMARY KEY ,
      nombre VARCHAR(100) not null unique,
      mail VARCHAR(100) not null unique,
      password VARCHAR(100) not null
  );
CREATE TABLE Topico (
    id BIGINT AUTO_INCREMENT PRIMARY KEY ,
    titulo VARCHAR(255) not null unique,
    mensaje VARCHAR(255) not null unique,
    fecha_creacion VARCHAR(50) not null,
    status VARCHAR(20) not null,
    curso VARCHAR(20) not null,
    autor_id BIGINT not null ,
    FOREIGN KEY (autor_id) REFERENCES Usuario(id)
);
CREATE TABLE Respuesta (
    id BIGINT AUTO_INCREMENT PRIMARY KEY ,
    mensaje VARCHAR(225) not null,
    topico_id BIGINT not null,
    fecha_creacion VARCHAR(50) not null,
    autor_id BIGINT not null,
    solucion VARCHAR(10) not null,
    FOREIGN KEY (topico_id) REFERENCES Topico(id) ,
    FOREIGN KEY (autor_id) REFERENCES Usuario(id)
);

