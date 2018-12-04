<h1>Problema 2 - Sistema Web Oobj </h1>

<i>OBS: O Problema escolhido foi o número 2, desenvolver um sistema Web. O uso dos templates foram reaproveitados de outros projetos meus 
desenvolvidos em um curso recentemente de Desenvolvedor Java Web. </i>

1. Passo - Fazer o download do projeto AvaliaçãoPratica; 

2. Passo - Importar para IDE (de preferencia Eclipse, mas não obrigatório); 

3. Passo - Criar banco de dados com o nome Oobj, no Postgres 

4. Passo  - Alterar dentro do arquivo persistence.xml a senha utilizada no banco de dados

5. Passo - Executar sripts abaixo

6. Passo - Na tela de Login da aplicação, o campo "Nome Usuário:" e "Senha" devem ser preenchidos de acordo com as informações adicionadas no banco de dados, com nome e sobrenome, em CapsLock seguindo o script.

7. Passo – Não esquecer de subir a aplicação pro servidor Tomcat


CREATE TABLE pessoa ( 

id SERIAL, 

email VARCHAR(35), 

empresa VARCHAR(255), 

nome VARCHAR(255), 

senha VARCHAR(255), 

telefone NUMERIC(30), 

CONSTRAINT pessoa_pkey PRIMARY KEY (id),

CONSTRAINT pessoa_empresa_key UNIQUE (empresa)
 
 )

<h5>
INSERT INTO pessoa (NOME,TELEFONE,EMAIL,EMPRESA,SENHA) VALUES ('JOAO LUCAS', 62999632520, 'JOAOLUCAS@GMAIL.COM', 'DAYTEN','SENHA1'); 

INSERT INTO pessoa (NOME,TELEFONE,EMAIL,EMPRESA,SENHA) VALUES ('MARIA FONTINELE', 62987276540, 'FONTINELE21@GMAIL.COM', 'NONE','SENHA2');

INSERT INTO pessoa (NOME,TELEFONE,EMAIL,EMPRESA,SENHA) VALUES ('JOSÉ FRANCISCO', 62999636363, 'FRANCISCOJOSE@GMAIL.COM', 'GOOGLE','SENHA3'); 

INSERT INTO pessoa (NOME,TELEFONE,EMAIL,EMPRESA,SENHA) VALUES ('GLUCION BAHIA', 62923215654, 'GLAUCIONBAHIA@GMAIL.COM', 'DIGITAL SISTEMAS','SENHA4');

INSERT INTO pessoa (NOME,TELEFONE,EMAIL,EMPRESA,SENHA) VALUES ('LETICIA SILVA', 62992931255, 'OKLETICIA@GMAIL.COM', 'ALDEIA','LETS'); 

INSERT INTO pessoa (NOME,TELEFONE,EMAIL,EMPRESA,SENHA) VALUES ('ISADORA MESQUITA', 6239416037, 'ISADORAMESQUITA@GMAIL.COM', 'APPLE','SENHA5'); 

INSERT INTO pessoa (NOME,TELEFONE,EMAIL,EMPRESA,SENHA) VALUES ('JONAS GABRIEL', 62982345679, 'JONASGABRIEL@OUTLOOK.COM', 'SEM','SENHA6'); 

INSERT INTO pessoa (NOME,TELEFONE,EMAIL,EMPRESA,SENHA) VALUES ('JHONES ALVES', 62992143120, 'ALVESJHONES@HOTMAIL.COM', 'NADA','SENHA7');

INSERT INTO pessoa (NOME,TELEFONE,EMAIL,EMPRESA,SENHA) VALUES ('MAYCON TULIO', 62999765432, 'MAYCONTULIOH@GMAIL.COM', 'AUTONOMO','SENHA8'); 

INSERT INTO pessoa (NOME,TELEFONE,EMAIL,EMPRESA,SENHA) VALUES ('GIOVANNA LOBO', 62981006310, 'GIOVANA_LOBO@GMAIL.COM', 'FACEBOOK','SENHA9');

INSERT INTO pessoa (NOME,TELEFONE,EMAIL,EMPRESA,SENHA) VALUES ('LUIZ CARLOS', 62982120765, 'LCCARLOS@HOTMAIL.COM', 'MMTE','SENHA10'); 

INSERT INTO pessoa (NOME,TELEFONE,EMAIL,EMPRESA,SENHA) VALUES ('EDITE CARVALHO', 62983231476, 'EDITECARVALHO@HOTMAIL.COM', 'DELL','SENHA11');

</h5



