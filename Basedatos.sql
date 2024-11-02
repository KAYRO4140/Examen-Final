CREATE DATABASE Zoologico;
USE Zoologico;

CREATE TABLE Animales (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    fechaNacimiento DATE,
    especie VARCHAR(50) NOT NULL
);
