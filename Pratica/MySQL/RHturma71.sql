CREATE DATABASE db_rhturma71;

USE db_rhturma71;


CREATE TABLE tb_rhturma71(
    matricula BIGINT AUTO_INCREMENT,
	nome VARCHAR(255) NOT NULL,
	contratacao date,
    cargo varchar (255) NOT NULL,
	setor VARCHAR (255)  NOT NULL,
    PRIMARY KEY (matricula)
);

INSERT INTO tb_rhturma71(nome, contratacao, cargo, setor) 
VALUES ("Daniel Lugli","20230112", "Analista de RH", "Recursos Humanos");

SELECT * FROM tb_rhturma71;



INSERT INTO tb_rhturma71(nome, contratacao, cargo, setor) 
VALUES ("Giovanna Oliveria","20230325", "Desenvolvedora JAVA Junior", "T.I");
INSERT INTO tb_rhturma71(nome, contratacao, cargo, setor) 
VALUES ("Marina Gonçalves ","20230411", "Desenvolvedora JAVA Pleno", "T.I");
INSERT INTO tb_rhturma71(nome, contratacao, cargo, setor) 
VALUES ("Luciana Dandara","20230325", "Project Owner", "T.I");
INSERT INTO tb_rhturma71(nome, contratacao, cargo, setor) 
VALUES ("Ana Eliza Silva","20230711", "Desenvolvedora JAVA Senior", "T.I");
INSERT INTO tb_rhturma71(nome, contratacao, cargo, setor) 
VALUES ("Giovanni Tagliere","20230515", "Analista de Marketing", "Marketing");


SELECT * FROM tb_rhturma71;

ALTER TABLE tb_rhturma71 ADD salario decimal(6,4);

SELECT * FROM tb_rhturma71;

UPDATE tb_rhturma71 SET salario = 1.500 WHERE matricula = 1;
UPDATE tb_rhturma71 SET salario = 2.500 WHERE matricula  = 2;
UPDATE tb_rhturma71 SET salario = 5.000 WHERE matricula  = 3;
UPDATE tb_rhturma71 SET salario = 8.000 WHERE matricula  = 4;
UPDATE tb_rhturma71 SET salario = 7.000 WHERE matricula  = 5;
UPDATE tb_rhturma71 SET salario = 1.800 WHERE matricula  = 6;

SELECT * FROM tb_rhturma71;

ALTER TABLE tb_rhturma71 MODIFY salario DECIMAL(6,3);

SELECT * FROM tb_rhturma71;

SELECT * FROM tb_rhturma71 Where salario > 2.000;
SELECT * FROM tb_rhturma71 Where salario < 2.000;


