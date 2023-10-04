-- MySQL dump 10.13  Distrib 8.0.32, for Linux (x86_64)
--
-- Host: localhost    Database: logics
-- ------------------------------------------------------
-- Server version	5.7.42

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `Name` varchar(50) DEFAULT NULL,
  `Persons` varchar(50) DEFAULT NULL,
  `Days` varchar(50) DEFAULT NULL,
  `FromD` varchar(50) DEFAULT NULL,
  `ToD` varchar(50) DEFAULT NULL,
  `NoofRooms` varchar(50) DEFAULT NULL,
  `Roomtype` varchar(50) DEFAULT NULL,
  `total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('Anand','1','1','2023-04-27','2023-04-28','1','Deluxe',10000),('Shibi','2','3','2023-04-27','2023-04-29','1','Suit',45000),('Selva','2','4','2023-04-26','2023-04-29','1','Deluxe',40000),('Arun','4','2','2023-05-24','2023-05-26','2','Normal',20000),('Jeevitha','2','2','2023-04-29','2023-04-30','1','Suit',30000),('Riffith','2','4','2023-07-17','2023-07-20','1','Suit',60000),('Akash','5','3','2023-08-15','2023-08-17','2','Deluxe',60000),('YogaVignesh','3','3','2023-09-20','2023-09-22','2','Suit',90000),('Avinash','10','5','2023-09-05','2023-09-09','3','Suit',225000),('Shaj','2','3','2023-07-14','2023-07-16','1','Normal',15000),('Vijay','3','4','2023-08-28','2023-08-31','2','Suit',120000),('Vinoth','2','2','2023-04-03','2023-04-05','1','Deluxe',20000);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-04 14:23:37
