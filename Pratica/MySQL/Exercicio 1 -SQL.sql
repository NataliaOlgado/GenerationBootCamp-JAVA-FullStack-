CREATE DATABASE db_generation_game_online;

USE  db_generation_game_online;

CREATE TABLE  tb_classes (
id BIGINT AUTO_INCREMENT,
nome VARCHAR (300) NOT NULL,
classe varchar (300),
PRIMARY KEY (id) ); 

INSERT INTO tb_classes (nome,classe)
VALUES ("Harry Potter", "Bruxo");
INSERT INTO tb_classes (nome,classe)
VALUES ("Katros", "Guerreiro");
INSERT INTO tb_classes (nome,classe)
VALUES ("P.I", "Duende");
INSERT INTO tb_classes (nome,classe)
VALUES ("Sofie", "Sereia");
INSERT INTO tb_classes (nome,classe)
VALUES ("Palomar", "Bruxa");

CREATE TABLE  tb_personagens (
id BIGINT AUTO_INCREMENT,
nomepersonagem  VARCHAR (300) NOT NULL,
classepersonagem varchar (300),
poder VARCHAR (300),
forca decimal,
PRIMARY KEY (id)); 


INSERT INTO tb_personagens (nomepersonagem,classepersonagem,poder,forca)
VALUES ("Harry Potter", "Bruxo","Elemental", 1500);
INSERT INTO tb_personagens (nomepersonagem,classepersonagem,poder,forca)
VALUES ("Katros", "Guerreiro","ForçaBruta",5000);
INSERT INTO tb_personagens (nomepersonagem,classepersonagem,poder,forca)
VALUES ("P.I", "Duende","Elemental",1000);
INSERT INTO tb_personagens  (nomepersonagem,classepersonagem,poder,forca)
VALUES ("Sofie", "Sereia","Aquatica", 9000);
INSERT INTO tb_personagens (nomepersonagem,classepersonagem,poder,forca)
VALUES ("Palomar", "Bruxa","MagiaNegra", 5000 );
INSERT INTO tb_personagens (nomepersonagem,classepersonagem,poder,forca)
VALUES ("Hermione", "Bruxa","Luz",4000 );
INSERT INTO tb_personagens (nomepersonagem,classepersonagem,poder,forca)
VALUES ("Rony", "Bruxo","MagiaNegra",3000 );
INSERT INTO tb_personagens (nomepersonagem,classepersonagem,poder,forca)
VALUES ("Dracula", "Vampiro","MagiaNegra", 1000 );


SELECT * FROM tb_classes;
SELECT * FROM tb_personagens;


ALTER TABLE tb_classes ADD CONSTRAINT fk_classes_personagens
FOREIGN KEY (id) REFERENCES tb_personagens (id);

SELECT * From tb_personagens where forca > 2000;

SELECT * From tb_personagens where forca BETWEEN 1000 and 2000;

SELECT * FROM tb_personagens WHERE nomepersonagem LIKE "%c%";

SELECT nome, classe, tb_personagens.poder,tb_personagens.forca
FROM tb_classes INNER JOIN tb_personagens 
ON tb_classes.id = tb_personagens.id;


SELECT tb_personagens.nomepersonagem, tb_personagens.classepersonagem, tb_personagens.poder, tb_personagens.forca
FROM tb_personagens
INNER JOIN tb_classes ON tb_personagens.classepersonagem = tb_classes.classe
WHERE tb_classes.classe = 'Bruxo';

