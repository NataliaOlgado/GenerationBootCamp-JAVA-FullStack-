CREATE DATABASE db_aquarela;

USE db_aquarela;

CREATE TABLE tb_aquarela (
id BIGINT AUTO_INCREMENT,
nome VARCHAR (300) NOT NULL,
quantidade INT,
datavalidade DATE,
preco DECIMAL NOT NULL,
PRIMARY KEY (id)
); 

SELECT* FROM tb_aquarela;

INSERT INTO tb_aquarela (nome,quantidade,datavalidade,preco)
VALUES ("Tomate", 100,"2023-12-15",8.00);
INSERT INTO tb_aquarela (nome,quantidade,datavalidade,preco)
VALUES ("Laranja", 50,"2023-12-18",3.00);
INSERT INTO tb_aquarela (nome,quantidade,datavalidade,preco)
VALUES ("Mexirica", 50,"2023-11-18",7.00);

ALTER TABLE tb_aquarela MODIFY preco DECIMAL(6,2);

ALTER TABLE tb_aquarela ADD descricao VARCHAR(255);

UPDATE tb_aquarela SET preco = 2.99 WHERE Id = 3;
UPDATE tb_aquarela SET descricao = "Vegetal" WHERE Id = 1;
UPDATE tb_aquarela SET descricao = "Fruta" WHERE Id = 2;
UPDATE tb_aquarela SET descricao = "Fruta" WHERE Id = 3;


SELECT * FROM tb_aquarela;