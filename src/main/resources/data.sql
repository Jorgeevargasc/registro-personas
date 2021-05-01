CREATE TABLE IF NOT EXISTS Persona(
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	nombre VARCHAR(20) NOT NULL,
	apellido VARCHAR(20) NOT NULL,
	preparado boolean not null default 0
);