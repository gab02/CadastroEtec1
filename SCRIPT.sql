create db_etec
use db_etec
CREATE TABLE tb_etec(
codigo 	 	int 			primary key  	NOT NULL,
nome 	 	varchar(50) 					NOT NULL,
cep 	 	varchar(8) 						NOT NULL,
endereco 	varchar(50) 					NOT NULL,
bairro 	 	varchar(50) 					NOT NULL,
cidade 	 	varchar(50) 					NOT NULL,
dt_registro DATE							NOT NULL,
latitude	FLOAT							NOT NULL,
longitude	FLOAT							NOT NULL
)

