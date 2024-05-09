-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: sistema_vendas
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `id` int NOT NULL,
  `nome` varchar(100) NOT NULL,
  `descricao` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'ELETRÔNICOS','Produtos eletrônicos'),(2,'MODA','asdf'),(3,'CASA E DECORAÇÃO',NULL),(4,'ALIMENTOS E BEBIDAS','asdasdasdasd asdasdasd'),(5,'SAÚDE E BELEZA',NULL),(6,'ESPORTES E LAZER',NULL),(7,'LIVROS E ENTRETENIMENTO',NULL),(8,'AUTOMÓVEIS',''),(9,'BRINQUEDOS E JOGOS',''),(10,'FERRAMENTAS E EQUIPAMENTOS',NULL),(12,'COMIDAS ORIENTAIS','Comidadas como:\n\n	* Yakissoba\n	* Suchi\n	* Sachimi'),(18,'dfaaaaaa','ffffffffffffffff'),(19,'NOVA CATEGORIA','DESCRIÇÃO ALTERADA'),(20,'asdfasdf','asdfasdf'),(21,'pppp','pppp');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cidade`
--

DROP TABLE IF EXISTS `cidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cidade` (
  `id` int NOT NULL,
  `id_estado` int NOT NULL,
  `nome` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_estado` (`id_estado`),
  CONSTRAINT `cidade_ibfk_1` FOREIGN KEY (`id_estado`) REFERENCES `estado` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cidade`
--

LOCK TABLES `cidade` WRITE;
/*!40000 ALTER TABLE `cidade` DISABLE KEYS */;
INSERT INTO `cidade` VALUES (1,16,'CAMPO MOURÃO'),(2,16,'MARINGÁ'),(3,16,'LONDRINA'),(4,16,'PEABIRU'),(5,16,'ENGENHEIRO BELTRÃO'),(6,16,'MAMBORÊ'),(7,16,'SÃO JOÃO DO IVAÍ'),(8,16,'GOIOERÊ'),(9,18,'UBIRATÃ'),(10,16,'CIANORTE');
/*!40000 ALTER TABLE `cidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id` int NOT NULL,
  `id_pessoa` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cliente_un` (`id_pessoa`),
  CONSTRAINT `cliente_FK` FOREIGN KEY (`id_pessoa`) REFERENCES `pessoa` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,10),(10,11),(11,12),(12,13),(13,14),(14,15),(15,16),(16,17),(17,18),(18,19),(19,20),(20,21);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `endereco` (
  `id` int NOT NULL,
  `id_cidade` int NOT NULL,
  `nome_rua` varchar(100) NOT NULL,
  `cep` varchar(10) NOT NULL,
  `numero_residencia` varchar(10) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_cidade` (`id_cidade`),
  CONSTRAINT `endereco_ibfk_1` FOREIGN KEY (`id_cidade`) REFERENCES `cidade` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES (1,1,'Avenida Comendador Norberto Marcondes','87000-000','100'),(2,3,'Rua dos Girassóis','00000-000','54'),(3,2,'Rua das Árvores','11111-111','1284'),(4,2,'Avenida Tamo Junto','21212121','54'),(5,3,'Rua do Furacão','848484','1687'),(6,1,'Rua dos buracos','12121212','25'),(7,1,'Avenida capitão Índio Bandeira','23232323','1010'),(8,1,'Rua Catarina','34343434','1125'),(9,1,'Rua Sidicreusa','45454545','3'),(10,2,'Rua das Borboletas','56565656','A3'),(11,2,'rrr','11','123132213'),(12,4,'rrr','11','123132213'),(13,8,'adsasdasdasd','asdasdasd','asdadsads'),(14,3,'Rua das Flores','80300-080','123'),(15,2,'TESTE 1','TESTE 1','TESTE 1'),(16,6,'ADSASD','ADAD','ADADS'),(17,1,'asdasd','asdasd','asdadsa'),(18,1,'asdasd','asdasd','asdasd'),(19,1,'a','a','a'),(20,8,'vb','bvvbv','vbvb'),(21,1,'asasd','aadss','aada'),(22,1,'asd','asd','asd'),(23,1,'asdasd','ads','asdasd'),(24,1,'asdada','asda','adad'),(25,1,'asdasd','asdasd','asdasd'),(26,1,'zxcxzc','zxczxc','zxczxczxc'),(27,1,'zxczxc','zxc','zxczxc'),(28,1,'aasd','asd','asd'),(29,4,'asdas','asd','asd'),(30,1,'aaaa','123','123'),(31,3,'Nada a ver','80.300-070','874'),(32,1,'asd','asd','asd'),(33,1,'asd','asd','ad');
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado`
--

DROP TABLE IF EXISTS `estado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estado` (
  `id` int NOT NULL,
  `id_pais` int NOT NULL,
  `nome` varchar(50) NOT NULL,
  `uf` varchar(2) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_pais` (`id_pais`),
  CONSTRAINT `estado_ibfk_1` FOREIGN KEY (`id_pais`) REFERENCES `pais` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado`
--

LOCK TABLES `estado` WRITE;
/*!40000 ALTER TABLE `estado` DISABLE KEYS */;
INSERT INTO `estado` VALUES (1,1,'ACRE','AC'),(2,1,'ALAGOAS','AL'),(3,1,'AMAPÁ','AP'),(4,1,'AMAZONAS','AM'),(5,1,'BAHIA','BA'),(6,3,'CEARÁ','CE'),(7,1,'DISTRITO FEDERAL','DF'),(8,1,'ESPÍRITO SANTO','ES'),(9,1,'GOIÁS','GO'),(10,1,'MARANHÃO','MA'),(11,1,'MATO GROSSO','MT'),(12,1,'MATO GROSSO DO SUL','MS'),(13,1,'MINAS GERAIS','MG'),(14,10,'PARÁ','PA'),(15,1,'PARAÍBA','PB'),(16,1,'PARANÁ','PR'),(17,1,'PERNAMBUCO','PE'),(18,1,'PIAUÍ','PI'),(19,1,'RIO DE JANEIRO','RJ'),(20,1,'RIO GRANDE DO NORTE','RN'),(21,1,'RIO GRANDE DO SUL','RS'),(22,1,'RONDÔNIA','RO'),(23,1,'RORAIMA','RR'),(24,1,'SANTA CATARINA','SC'),(25,1,'SÃO PAULO','SP'),(26,1,'SERGIPE','SE'),(27,4,'TOCANTINS','TO'),(28,5,'asdasdasdsad','as'),(29,1,'aaa','ff'),(30,2,'Texas','TX'),(31,1,'TESTEEEEE','TE'),(32,10,'asdasdadsadasd','as'),(33,2,'Texas','TX');
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado_civil`
--

DROP TABLE IF EXISTS `estado_civil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estado_civil` (
  `id` int NOT NULL,
  `nome` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado_civil`
--

LOCK TABLES `estado_civil` WRITE;
/*!40000 ALTER TABLE `estado_civil` DISABLE KEYS */;
INSERT INTO `estado_civil` VALUES (1,'CASADO(A)'),(2,'SOLTEIRO(A)'),(3,'DIVORCIADO(A)'),(4,'VIÚVO(A)'),(5,'asdasdasdasd');
/*!40000 ALTER TABLE `estado_civil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marca`
--

DROP TABLE IF EXISTS `marca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marca` (
  `id` int NOT NULL,
  `nome` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marca`
--

LOCK TABLES `marca` WRITE;
/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
INSERT INTO `marca` VALUES (1,'Sony'),(3,'Nike'),(4,'Dell'),(5,'Ford'),(6,'Coca Cola'),(7,'Natura'),(8,'Fender'),(9,'Cannondale'),(10,'Adidas'),(11,'ggggg');
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pais`
--

DROP TABLE IF EXISTS `pais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pais` (
  `id` int NOT NULL,
  `nome` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pais`
--

LOCK TABLES `pais` WRITE;
/*!40000 ALTER TABLE `pais` DISABLE KEYS */;
INSERT INTO `pais` VALUES (1,'BRASIL'),(2,'ESTADOS UNIDOS'),(3,'CANADÁ'),(4,'MÉXICO'),(5,'REINO UNIDO'),(6,'FRANÇA'),(7,'ALEMNHA'),(8,'ESPANHA'),(9,'ITÁLIA'),(10,'JAPÃO'),(11,'TESTEEE'),(12,'');
/*!40000 ALTER TABLE `pais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedido` (
  `id` int NOT NULL,
  `id_cliente` int NOT NULL,
  `id_produto` int NOT NULL,
  `data_pedido` date NOT NULL,
  `quantidade` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_cliente` (`id_cliente`),
  KEY `id_produto` (`id_produto`),
  CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`),
  CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
INSERT INTO `pedido` VALUES (1,1,1,'2023-05-01',1),(2,2,2,'2023-04-21',2),(3,3,5,'2023-08-02',1),(4,4,8,'2023-08-20',1),(5,5,1,'2023-10-20',1),(6,1,7,'2023-10-25',1),(7,1,1,'2023-10-25',1),(8,1,6,'2023-10-25',4),(9,3,6,'2023-10-25',3),(10,3,8,'2023-10-25',10),(11,18,11,'2023-10-25',1),(12,4,4,'2024-02-06',7),(13,4,5,'2024-02-06',3);
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoa`
--

DROP TABLE IF EXISTS `pessoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pessoa` (
  `id` int NOT NULL,
  `id_endereco` int NOT NULL,
  `id_estado_civil` int NOT NULL,
  `nome` varchar(30) NOT NULL,
  `sobrenome` varchar(30) NOT NULL,
  `genero` varchar(10) NOT NULL,
  `telefone` varchar(30) NOT NULL,
  `email` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `usuario` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `pessoa_un` (`id_endereco`),
  KEY `id_estado_civil` (`id_estado_civil`),
  CONSTRAINT `pessoa_ibfk_1` FOREIGN KEY (`id_endereco`) REFERENCES `endereco` (`id`),
  CONSTRAINT `pessoa_ibfk_2` FOREIGN KEY (`id_estado_civil`) REFERENCES `estado_civil` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa`
--

LOCK TABLES `pessoa` WRITE;
/*!40000 ALTER TABLE `pessoa` DISABLE KEYS */;
INSERT INTO `pessoa` VALUES (1,14,2,'Flávia','Santos','MASCULINO','99944-3333','flavia@email','flavia','1234'),(2,1,2,'Marcosasdasd','Santos','MASCULINO','99997-5854','santos@email','marcos','1234'),(3,2,1,'Marcelo','Dias','MASCULINO','99948-5757','marcelo.dias@email','marcelo','1234'),(4,3,1,'Ana','Marques','FEMININO','99731-2428','ana@email','ana','1234'),(5,4,2,'Silvia','Magalhães','FEMININO','99987-8758','silvia@email','silvia','1234'),(6,15,3,'TESTE 1','TESTE 1','MASCULINO','TESTE 1','TESTE 1','teste1','1234'),(7,16,1,'ASDASD','ASDASD','MASCULINO','ASDADSASD','ASDASDASDASD','asdasd','1234'),(8,17,1,'asdasd','asdasd','MASCULINO','asdasd','asdasasd','',''),(9,18,1,'asdasd','asdasd','MASCULINO','asdasd','asdasd','',''),(10,19,1,'b','b','MASCULINO','b','b','',''),(11,21,1,'adasd','adsasd','MASCULINO','adada','asdadasdasdasd','',''),(12,23,1,'adsad','adads','MASCULINO','adasd','adsadad','',''),(13,25,1,'asdasd','asdasd','MASCULINO','asdasda','asdasdasdadsasd','',''),(14,26,1,'zxczxc','zxczxczcx','MASCULINO','zxczxc','zxczxczxczxc','',''),(15,27,1,'zxc','zxczxc','MASCULINO','zxc','zxczxczxcxzc','',''),(16,28,1,'asd','asd','MASCULINO','asd','asd','',''),(17,29,1,'adsasd','asdasd','MASCULINO','asdasd','asdads','',''),(18,30,1,'123','123','FEMININO','123','123','novo','[C@2bf7af9f'),(19,31,2,'Jonas','Brother','MASCULINO','99958-2201','jonas_brother@hotmail.com','jonasb','159753'),(20,32,1,'asd','asd','MASCULINO','ad','asd','ads','asdf'),(21,33,1,'asd','asd','MASCULINO','asd','asd','ad','asd');
/*!40000 ALTER TABLE `pessoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `id` int NOT NULL,
  `id_categoria` int NOT NULL,
  `id_marca` int NOT NULL,
  `nome` varchar(100) NOT NULL,
  `descricao` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `preco` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_categoria` (`id_categoria`),
  KEY `id_marca` (`id_marca`),
  CONSTRAINT `produto_ibfk_1` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id`),
  CONSTRAINT `produto_ibfk_2` FOREIGN KEY (`id_marca`) REFERENCES `marca` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,8,5,'Ford Focus','carro extremamente confortável com apenas 10.000 km rodados.',55000.00),(2,1,4,'Notebook gamer','Notebook extremamente versátil e poderoso!',7500.00),(3,2,3,'Vaporfly','O melhor tênis de corrida já feito.',1200.00),(4,4,6,'Coca Cola lata',NULL,2.50),(5,1,1,'Playstation 5','Console de última geração.',5000.00),(6,5,7,'Shampoo','shampoo para todos os tipos de cabelos.',54.00),(7,10,8,'Fender Stratocaster','Guitarra clássica fabricada em 1970',20000.00),(8,6,9,'Montainbike aro 29',NULL,8500.00),(9,6,10,'Tênis Adidas Adizero','null',1120.00),(10,6,10,'Tênis Adidas Adizero',NULL,1200.00),(11,1,4,'Notebook Alienware','Perfeito para jogos de última geração.',12000.00),(12,4,6,'asdasdsad','asdsadasd',1222.00),(13,12,3,'NOVO PRODUTO TOP ALTERADOO','PRODUTO CARO ALTERADO',45000.00),(14,1,1,'Televisão','55 polegadas, 4K, Oled, Smart.',10000.00);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'sistema_vendas'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-09 10:36:55
