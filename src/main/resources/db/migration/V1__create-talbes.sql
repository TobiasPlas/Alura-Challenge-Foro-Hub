CREATE TABLE Usuario (
      id BIGINT PRIMARY KEY,
      nombre VARCHAR(100),
      mail VARCHAR(100),
      password VARCHAR(100)
  );
CREATE TABLE Topico (
    id BIGINT PRIMARY KEY,
    titulo VARCHAR(255),
    mensaje TEXT,
    fecha_creacion VARCHAR(50),
    status VARCHAR(20),
    autor_id BIGINT,
    FOREIGN KEY (autor_id) REFERENCES Usuario(id)
);
CREATE TABLE Respuesta (
    id SERIAL PRIMARY KEY,
    mensaje TEXT,
    topico_id BIGINT,
    fecha_creacion VARCHAR(50),
    autor_id BIGINT,
    solucion VARCHAR(10),
    FOREIGN KEY (topico_id) REFERENCES Topico(id),
    FOREIGN KEY (autor_id) REFERENCES Usuario(id)
);
