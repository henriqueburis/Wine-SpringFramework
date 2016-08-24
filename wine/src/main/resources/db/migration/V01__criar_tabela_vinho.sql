CREATE TABLE vinho (
	codigo BIGINT (50) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR (50) NOT NULL,
	tipo VARCHAR (50) NOT NULL,
	safra INT NOT NULL,
	volume INT NOT NULL,
	valor DECIMAL (10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



--CREATE TABLE vinhos
--(
--  codigo bigint,
--  nome "char",
--  tipo "char",
--  safra integer,
--  volume integer,
--  valor money
--)
--WITH (
--  OIDS=FALSE
--);
--ALTER TABLE vinhos
--  OWNER TO postgres;