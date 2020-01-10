CREATE DATABASE IF NOT EXISTS db_exam;

USE db_exam;
DROP TABLE ORDEN_DE_COMPRA CASCADE;
DROP TABLE CLIENTE CASCADE;
DROP TABLE PRODUCTO CASCADE;

CREATE TABLE CLIENTE(
idCliente INT AUTO_INCREMENT,
rut VARCHAR(8),
dv VARCHAR(1),
paterno VARCHAR(100),
materno VARCHAR(100),
nombreCliente VARCHAR(100),
email VARCHAR(100),
PRIMARY KEY(idCliente));

CREATE TABLE PRODUCTO(
idProducto INT AUTO_INCREMENT,
nombreProducto VARCHAR(20),
descripcion VARCHAR(200),
marca varchar(25),
stock INT,
precio INT,
PRIMARY KEY(idProducto));

CREATE TABLE ORDEN_DE_COMPRA(
idOrden INT AUTO_INCREMENT,
fechaOrden TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
idProducto INT,
idCliente INT,
cantidad INT,
detalle VARCHAR(150),
total INT,
estado VARCHAR(100),
PRIMARY KEY(idOrden),
FOREIGN KEY(idProducto) REFERENCES PRODUCTO(idProducto),
FOREIGN KEY(idCliente) REFERENCES CLIENTE(idCliente));

INSERT INTO PRODUCTO (idProducto, nombreProducto, descripcion, marca, stock,precio) VALUES(0, 'pendrive', 'pendrive mini de 64gb', 'marca', 50, 5500);
INSERT INTO PRODUCTO (idProducto, nombreProducto, descripcion, marca, stock,precio) VALUES(0, 'parlante', 'parlante bluetooth de viaje', 'marca2', 15, 15000);
INSERT INTO CLIENTE (idCliente, rut, dv, paterno, materno, nombreCliente, email) VALUES(0, '15236441', '5', 'rodriguez', 'fernandez', 'francisco hernan', 'franherofer@gmail.com');
INSERT INTO CLIENTE (idCliente, rut, dv, paterno, materno, nombreCliente, email) VALUES(0, '12155489', '4', 'millanahuel', 'cayuqueo', 'roberto andres', 'roanmilca@gmail.com');
INSERT INTO ORDEN_DE_COMPRA (idOrden, idProducto, idCliente, cantidad, detalle, total,estado) VALUES(0, 1, 2, 5, 'pendrive ', 2500, 'pendiente');


SELECT * FROM detalle_orden



