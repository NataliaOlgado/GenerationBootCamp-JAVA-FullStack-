CREATE DATABASE db_pizarria_legal;

USE  db_pizarria_legal;

CREATE TABLE  tb_categorias (
id BIGINT AUTO_INCREMENT,
sabor VARCHAR (300) NOT NULL,
preco DECIMAL (6,2),
PRIMARY KEY (id) ); 

INSERT INTO tb_categorias (sabor,preco)
VALUES ("Mussarela", 50.00);
INSERT INTO tb_categorias (sabor,preco)
VALUES ("Calabresa", 70.00);
INSERT INTO tb_categorias (sabor,preco)
VALUES ("Palmito", 75.00 );
INSERT INTO tb_categorias (sabor,preco)
VALUES ("Espinafre", 80.00);
INSERT INTO tb_categorias (sabor,preco)
VALUES ("Abacaxi", 100.00);

CREATE TABLE  tb_pizzas (
idincremento BIGINT AUTO_INCREMENT,
toppings  VARCHAR (300) NOT NULL,
borda varchar (300),
ponto VARCHAR (300),
retirar VARCHAR (300),
PRIMARY KEY (idincremento)); 


INSERT INTO tb_pizzas (toppings,borda,ponto,retirar)
VALUES ("Catupiry", "queijo","bem passado", "cebola" );
INSERT INTO tb_pizzas (toppings,borda,ponto,retirar)
VALUES ("Cebola", "sem borda","mal passado","tomate");
INSERT INTO tb_pizzas (toppings,borda,ponto,retirar)
VALUES ("Cebola", "queijo","bem passado"," catupiry");
INSERT INTO tb_pizzas (toppings,borda,ponto,retirar)
VALUES ("Catupiry", "catupiry","bem passado", "Cheddar");
INSERT INTO tb_pizzas (toppings,borda,ponto,retirar)
VALUES ("Cebola", "cheddar"," mal passado", "catupiry" );
INSERT INTO tb_pizzas (toppings,borda,ponto,retirar)
VALUES ("Manjericao", "requeijao","normal","cebola" );
INSERT INTO tb_pizzas (toppings,borda,ponto,retirar)
VALUES ("Manjericao", "cheddar","normal","margarina" );
INSERT INTO tb_pizzas (toppings,borda,ponto,retirar)
VALUES ("Queijo", "requeijao","normal", "amor" );


SELECT * FROM tb_pizzas;
SELECT * FROM tb_categorias;


ALTER TABLE tb_categorias ADD CONSTRAINT fk_categorias_pizzas
FOREIGN KEY (id) REFERENCES tb_pizzas (idincremento);

SELECT * From tb_categorias where preco > 45;

SELECT * From tb_categorias where preco BETWEEN 50 and 100;

SELECT * FROM tb_categorias WHERE sabor LIKE "%m%";

SELECT * From tb_categorias INNER JOIN tb_pizzas
ON tb_categorias.id = tb_pizzas.idincremento;


SELECT * From tb_categorias INNER JOIN tb_pizzas
ON tb_categorias.id = tb_pizzas.idincremento
WHERE tb_pizzas.ponto = 'bem passado';

