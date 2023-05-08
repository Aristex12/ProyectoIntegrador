DROP TABLE IF EXISTS areas;
DROP TABLE IF EXISTS alumnos;
DROP TABLE IF EXISTS proyectos;

/*CREAMOS LAS TABLAS*/
CREATE TABLE PROYECTOS(
    idProyecto INT AUTO_INCREMENT,
    curso VARCHAR(30),
    año INT (4),
    nombreProyecto VARCHAR(80),
    urlGithub VARCHAR(200),
    notaObtenida INT (2),
    PRIMARY KEY (idProyecto)
);

CREATE TABLE ALUMNOS(
    numExpediente INT,
    nombre VARCHAR(20),
    apellidos VARCHAR(60),
    idProyectoFK INT,
    PRIMARY KEY (numExpediente),
    CONSTRAINT fk_proyecto FOREIGN KEY (idProyectoFK) REFERENCES PROYECTOS(idProyecto)
);

CREATE TABLE AREAS (
    codArea INT AUTO_INCREMENT,
    nombre VARCHAR(30),
    descripcion VARCHAR(900),
    idProyectoFK2 INT,
    PRIMARY KEY (codArea)
);


/*HACEMOS LOS INSERT DE LA TABLA PROYECTOS*/
INSERT INTO proyectos(curso, año, nombreProyecto, urlGithub, notaObtenida) VALUES ('DAW', '1', 'ATOM', 'https://github.com/aristex12/ProyectoIntegrador', '10');
INSERT INTO proyectos(curso, año, nombreProyecto, urlGithub, notaObtenida) VALUES ('DAM', '1', 'CodeCrafters', 'https://github.com/nolose/ProyectoIntegrador2', '7');
INSERT INTO proyectos(curso, año, nombreProyecto, urlGithub, notaObtenida) VALUES ('DAW', '2', 'ByteBuiders', 'https://github.com/byte/ProyectoIntegrador3', '9');
INSERT INTO proyectos(curso, año, nombreProyecto, urlGithub, notaObtenida) VALUES ('DAM', '2', 'LogicLabs', 'https://github.com/labs/ProyectoIntegrador4', '3');
INSERT INTO proyectos(curso, año, nombreProyecto, urlGithub, notaObtenida) VALUES ('DAM', '2', 'SyntaxSquad', 'https://github.com/squad/syntaxerror5', '0');

/*HACEMOS LOS INSERT DE LA TABLA ALUMNOS*/
INSERT INTO ALUMNOS VALUES ('22149413', 'Dani', 'Garrido', '1'); 
INSERT INTO ALUMNOS VALUES ('22459876', 'Juan', 'Lopez', '2'); 
INSERT INTO ALUMNOS VALUES ('22908754', 'Aris', 'Kuhs', '3'); 
INSERT INTO ALUMNOS VALUES ('22761245', 'Gustavo', 'Fring', '4'); 
INSERT INTO ALUMNOS VALUES ('22985647', 'Josep', 'Serrano', '5'); 

/*LOS INSERT DE LA TABLA AREAS*/
INSERT INTO AREAS(nombre, descripcion) VALUES ('BaseDeDatos','Asignatura dedicada a la creación, modificación, y borrado de bases de datos, impartida por una gran profesora');
INSERT INTO AREAS(nombre, descripcion) VALUES ('Programación','Enseñanza de los fundamentos de programación, aprender a utilizar el código e implementarlo en casos de uso reales');
INSERT INTO AREAS(nombre, descripcion) VALUES ('LenguajeDeMarcas','Dedicada especialmente al desarrollo de páginas web, se enseñan cosas como HTML, CSS y JS');
INSERT INTO AREAS(nombre, descripcion) VALUES ('FOL','Profundizas en el mundo laboral, aprendes sobre las empresas, procesos legales / medidas de protección o prevención, etc.');
INSERT INTO AREAS(nombre, descripcion) VALUES ('SistemasInformaticos','Aprendizaje sobre los diferentes sistemas operativos, su historia, como usarlos, como funcionan desde dentro, etc');