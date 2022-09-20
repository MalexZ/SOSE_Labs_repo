-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sys
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `lab4tbl`
--

DROP TABLE IF EXISTS `lab4tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lab4tbl` (
  `WF_id` varchar(255) NOT NULL,
  `Service1` varchar(255) DEFAULT NULL,
  `Service2` varchar(255) DEFAULT NULL,
  `Service3` varchar(255) DEFAULT NULL,
  `FitnessValue` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`WF_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lab4tbl`
--

LOCK TABLES `lab4tbl` WRITE;
/*!40000 ALTER TABLE `lab4tbl` DISABLE KEYS */;
INSERT INTO `lab4tbl` VALUES ('WF0','S12','S22','S37','0.9733562319237147'),('WF1','S11','S38',' ','1.7369835365853659'),('WF10','S12','S31',' ','1.4185102032520325'),('WF11','S11','S37',' ','1.752225'),('WF12','S14','S31',' ','1.8856691304347828'),('WF13','S12','S33',' ','1.702783333333333'),('WF14','S12','S34',' ','1.506471111111111'),('WF15','S14','S34',' ','1.954986296296296'),('WF16','S12','S34',' ','1.506471111111111'),('WF17','S11','S32',' ','2.0992249999999997'),('WF18','S11','S23','S32','0.9555921344537814'),('WF19','S15','S23','S34','0.8537900288786482'),('WF2','S13','S35',' ','1.3415823920070526'),('WF20','S13','S31',' ','1.6341729151483602'),('WF21','S14','S32',' ','2.5178342424242426'),('WF22','S15','S35',' ','1.2388957105943152'),('WF23','S13','S33',' ','2.002960606060606'),('WF24','S15','S31',' ','1.4900288888888888'),('WF25','S11','S21','S38','1.2144191442048518'),('WF26','S11','S32',' ','2.0992249999999997'),('WF27','S15','S21','S38','1.080843275862069'),('WF28','S13','S32',' ','1.9639185714285714'),('WF29','S14','S21','S35','1.099581333333333'),('WF3','S12','S36',' ','1.336402358490566'),('WF30','S12','S35',' ','1.181268888888889'),('WF31','S11','S36',' ','1.6013284883720929'),('WF32','S12','S37',' ','1.415271923076923'),('WF33','S11','S33',' ','2.1451666666666664'),('WF34','S15','S38',' ','1.4857195652173913'),('WF35','S14','S31',' ','1.8856691304347828'),('WF36','S13','S35',' ','1.3415823920070526'),('WF37','S15','S38',' ','1.4857195652173913'),('WF38','S14','S35',' ','1.5470209523809524'),('WF39','S14','S36',' ','1.7808866666666665'),('WF4','S11','S37',' ','1.752225'),('WF40','S13','S38',' ','1.6560008245243127'),('WF41','S12','S31',' ','1.4185102032520325'),('WF42','S12','S23','S34','0.8795455999999998'),('WF43','S15','S36',' ','1.372596666666667'),('WF44','S12','S38',' ','1.4545895098039217'),('WF45','S13','S22','S37','1.06974308875502'),('WF46','S14','S31',' ','1.8856691304347828'),('WF47','S12','S23','S37','0.7325071999999999'),('WF48','S15','S36',' ','1.372596666666667'),('WF49','S14','S35',' ','1.5470209523809524'),('WF5','S12','S36',' ','1.336402358490566'),('WF6','S14','S34',' ','1.954986296296296'),('WF7','S15','S31',' ','1.4900288888888888'),('WF8','S13','S37',' ','1.6440283838383838'),('WF9','S11','S33',' ','2.1451666666666664');
/*!40000 ALTER TABLE `lab4tbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-16 18:45:11
