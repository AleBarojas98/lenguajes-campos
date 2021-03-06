
--PRIMERO GENERAMOS LA TABLA CLIENTE

CREATE TABLE CLIENTE(ID_CLIENTE INTEGER PRIMARY KEY
 AUTO_INCREMENT,
NOMBRE VARCHAR(30),
EMAIL VARCHAR(40) );

-- GENERAMOS LA SEGUNDA TABLA: PRODUCTO
CREATE TABLE PRODUCTO(ID_PRODUCTO  INTEGER PRIMARY KEY
 AUTO_INCREMENT,
    ID_CLIENTE INTEGER,
    NOMBRE VARCHAR(120),
     CANTIDAD INTEGER,
     PRECIO   FLOAT,
FOREIGN KEY(ID_CLIENTE) REFERENCES CLIENTE(ID_CLIENTE) );

DROP TABLE PRODUCTO;

describe producto;
desc cliente;

--empezamoS con la sentencia INSERT. SE USA PARA GUARDAR FILAS
-- EN UNA TABLA
INSERT INTO CLIENTE(NOMBRE, EMAIL) VALUES('ANA','ANA@X.COM');

-- AHORA VAMOS VAMOS CON LA SENTENCIA SELECT QUE SE USA
--PARA HACER BUSCQUEDAS O ELABORAR REPORTES

--USAMOS LA SENTENCIA PARA LA SIGUIENTE CONSULTA
 SELECT * FROM CLIENTE;
SELECT * FROM PRODUCTO;
DROP TABLE PRODUCTO;
DROP TABLE CLIENTE;
--TRATAREMOS DE GUARDAR UN REGISTRO CON IN IDE EXISTENTE

INSERT INTO CLIENTE VALUES(2,'BATMAN','BAT@GMAIL.COM');

SELECT * FROM PRODUCTO;






--ESTE EJEMPLO ES INCORRECTO
INSERT INTO CLIENTE(ID_CLIENTE, NOMBRE, EMAIL)
 VALUES(5,'MALO','MAL@REPROBADO.COM');

-- VAMOS A VER A CONTINUACION LA SENTENCIA DELETE
-- SE USA PARA BORRAR UNO O MAS REGISTROS



-- EFECTUAMOS UNA CONSULTA PARA VERIFICAR QUE HA SIDO BORRADO
SELECT * FROM CLIENTE;

-- OTRA MODALIDAD DEL SELECT
-- VAMOS A BUSCAR TODOS LOS EMAIL CONTENIDOS
SELECT EMAIL FROM CLIENTE;
SELECT EMAIL, NOMBRE FROM CLIENTE;

-- VAMOS A BUSCAR EL EMAIL DEL REGISTRO CON ID=1
SELECT EMAIL FROM CLIENTE WHERE ID_CLIENTE=1;

SELECT * FROM CLIENTE;
SELECT * FROM PRODUCTO;

--VAMOS A EFECTUAR UN UPDATE (ACTUALIZACION) SUSITUIREMOS
-- EL NOMBRE DEL ID_CLIENTE=1 CON EL CHUPACABRAS
UPDATE CLIENTE SET NOMBRE='CHUPACABRAS' WHERE ID_CLIENTE=1;

-- HACEMOS QQUE EL CHUPACABRAS CUYO ID_CLIENTE =1
-- COMPRE LOS PRODUCTOS QUE LE GUSTAN

INSERT INTO PRODUCTO VALUES(6,3,'PUNGUINOS',1,13);

SELECT  * FROM PRODUCTO;

INSERT INTO PRODUCTO VALUES(2,1,'GANSITO',1,10);
INSERT INTO PRODUCTO VALUES(3,1,'CHOCORROLES',1,12);
INSERT INTO PRODUCTO VALUES(4,1,'TAKIS FUEGO',1,12);
INSERT INTO PRODUCTO VALUES(5,1,'JARRITO LOCO',10,30);




--ALGO UN POCO MAS DIFICIL
 
SELECT P.NOMBRE, C.NOMBRE  FROM PRODUCTO AS P  INNER JOIN
CLIENTE AS C ON P.ID_CLIENTE=C.ID_CLIENTE;


SELECT * FROM CLIENTE;
--ejecuta una busqueda en la tabla cliente en la cual
-- solo aparezca el nombre cuyo id es 1
select NOMBRE, EMAIL FROM CLIENTE WHERE ID_CLIENTE=1;


SELECT * FROM PRODUCTO;

-- SELECCIONAMOS EL CLIENTE PARA VERLO
SELECT * FROM CLIENTE;



 