CREATE DATABASE IF NOT EXISTS bdtransportes;
USE bdtransportes;

CREATE TABLE IF NOT EXISTS tblvehiculo (
	id int PRIMARY KEY AUTO_INCREMENT,
	placa varchar(10) NOT NULL,
	marca varchar(60) NOT NULL,
	modelo varchar(5) NOT NULL,
	valorcomercial double NOT NULL
);

CREATE TABLE IF NOT EXISTS tblconductor(
	id int PRIMARY KEY AUTO_INCREMENT,
    nombre_completo varchar(80) NOT NULL,
    telefono varchar(40) NOT NULL,
    direccion varchar(60) NOT NULL,
    fecha_creacion datetime
);

SELECT * FROM tblvehiculo;