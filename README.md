# Informações gerais

Sistema desktop didático utilizado no curso de Programador de Sistemas do SENAC de Campo Mourão - PR.

O intuito desse sistema foi ensinar os alunos a desenvolver um sistema de ponta-a-ponta:
  * Requierimentos;
    * Requisitos funcionais e não funcionais
  * Design;
  * Implementação;
  * Teste;
  * Implantação;
  * Manutenção.   

Para desenvolver esse sistema foi utilizado a linguagem Java (IDE Netbeans) para codificação, a biblioteca Swing para a criação das telas e o banco de dados MySql 8+.

O projeto segue o design pattern MVC.

# Configuração do banco de dados

* **Driver**: O driver de conexão (.jar) com o banco de dados encontra-se em **SistemaVendasComBDSemMaven\MySqlDriver\mysql-connector-j-8.3.0**. O mesmo já vem adicionado à pasta **Libraries** do projeto, porém, caso exista a necessidade de adicioná-lo novamente isso pode ser feito seguindo os seguintes passos:
  * Clique com o botão direito do mouse na pasta **Libraries** e selecione a opção **Add JAR/Folder...**;
    
  * Em seguinda, navegue até a pasta que contém o arquivo **mysql-connector-j-8.3.0.jar** e clique no botão **open** da tela assistente;
    
  * Feito isso, deverá aparecer um novo item dentro da pasta **Libraries** contendo o nome do driver, neste caso: **mysql-connector-j-8.3.0.jar**.

* **Dump**: O banco de dados utilizado já vem em um arquivo dump, que por sua vez encontre-se na pasta **SistemaVendasComBDSemMaven\Dumps** bastando apenas restaurá-lo dentro do MySql. A forma de realizar a restauração dependo do gerenciador de banco de dados que se está utilizando. Segue um exemplo utilizando o DBeaver:
  * Crie uma conexão com o seu banco de dados MySql;
    
  * Crie um novo banco de dados com o nome de **sistema_vendas**. Obs: caso o banco de dados esteja com outro nome, será necessário mudar também na classe de conexão com o banco de dados.
    
  * Clique com o botão direito do mouse no banco de dados criado e selecione as opções **Ferramentas** **->** **Restore database**. Na janela que se abrirá, na guia **Input**, selecione o ícone de pasta. Por fim, navegue até o arquivo de dump do banco de dados contido em **SistemaVendasComBDSemMaven\Dumps**.
 
  * Para finalizar, clique no botão **iniciar** na parte inferior da janela para iniciar o processo de restauração do banco de dados.
