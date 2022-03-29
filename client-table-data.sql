-- MariaDB dump 10.19  Distrib 10.5.12-MariaDB, for Linux (x86_64)
--
-- Host: mysql.hostinger.ro    Database: u574849695_19
-- ------------------------------------------------------
-- Server version	10.5.12-MariaDB-cll-lve

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `client`
--

CREATE DATABASE `clients`

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `client` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `document` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (2,'0790 Erling Mount\nGerhardside, AL 84420','1972-07-31','\0','','sit'),(3,'485 Nash Stream\nElenorahaven, OH 38851-1986','2010-12-02','\0','','maxime'),(4,'88163 Swaniawski Prairie Suite 041\nGrahamhaven, MS 36150-8520','1983-04-29','\0','','libero'),(5,'91665 Elijah Land Apt. 568\nNew Everette, HI 14918','2009-02-12','\0','','facilis'),(6,'2267 Blick Drives\nWest Isobelhaven, MD 04577','2016-10-28','\0','','distinctio'),(7,'94217 Jessyca Loaf Apt. 245\nLake Kolbyland, NM 86237-2143','1982-02-08','\0','','occaecati'),(8,'151 Leannon Stream Suite 413\nSouth Ignatiusland, HI 74021','1984-12-29','\0','','modi'),(9,'108 Mohr Road Apt. 414\nLednerstad, MA 82089-7418','1971-06-21','\0','','quisquam'),(10,'5823 Albina Prairie Apt. 446\nEmelyview, VA 06906','2018-05-18','\0','','dolor'),(11,'8108 Rae Turnpike Apt. 768\nSouth Billport, AR 94371-4928','2006-02-04','\0','','et'),(12,'64105 O\'Hara Vista Apt. 427\nHuldamouth, TX 22338-1347','2002-04-07','\0','','est'),(13,'599 Pouros Roads\nEdashire, AK 21846','1972-10-13','\0','','ut'),(14,'57793 Elmore Crescent Suite 352\nEast Rodger, ND 05509','1977-04-23','\0','','quidem'),(15,'78490 Mante Ramp Suite 951\nGussieburgh, AZ 20772-8938','1986-01-03','\0','','optio'),(16,'46100 Kovacek Villages\nPort Elijahbury, NY 40144','2005-07-17','\0','','et'),(17,'456 Funk Route\nKshlerinchester, NH 92287-1757','1975-06-30','\0','','sit'),(18,'784 Walker Inlet\nLake Taraburgh, MI 03281','2006-02-13','\0','','sit'),(19,'198 Margot Well Suite 809\nNew Clemmieville, KY 72223','1985-12-25','\0','','exercitationem'),(20,'40239 Alexandre Canyon Suite 237\nBoyerbury, DC 61472','1993-08-06','\0','','distinctio'),(21,'567 Rowe Corner Suite 218\nNew Lucio, NV 98049-4114','1976-07-26','\0','','sed'),(22,'13243 Alycia Mountain Suite 316\nEast Marianne, MD 20819','1971-10-11','\0','','ipsum'),(23,'4549 Spinka Glens\nNorth Scarlettport, VT 48437','2015-03-06','\0','','qui'),(24,'920 Reinhold Alley Suite 847\nSmithfort, MA 44583','2002-01-16','\0','','ut'),(25,'3376 Citlalli Fork Suite 315\nEmardhaven, NE 00122-8955','1994-02-08','\0','','incidunt'),(26,'579 Braun Passage\nWest Rhodaside, DC 31540','1981-01-04','\0','','et'),(27,'25544 Cale Via Apt. 852\nSouth Kearaton, TX 03007','1994-07-02','\0','','esse'),(28,'7399 Jammie Terrace Suite 971\nNorth Amely, PA 57288-9339','2002-09-28','\0','','facere'),(29,'928 Lebsack Mount\nSouth Candelariochester, SC 36766-3340','2002-07-18','\0','','occaecati'),(30,'49326 Mante Mountain Apt. 003\nAlanisborough, NV 54465-4967','2004-05-18','\0','','vero'),(31,'66027 Konopelski Ridge\nNew Palmaside, KS 33839-0614','1983-06-16','\0','','mollitia'),(32,'756 Augustus Unions Apt. 417\nAltenwerthfurt, MT 77337','1994-02-24','\0','','consequuntur'),(33,'30591 Marley Common Suite 935\nEast Jeffland, IN 13236','2004-04-20','\0','','quis'),(34,'14549 Veum Rapid Suite 707\nKemmerstad, NY 47601','2000-08-04','\0','','unde'),(35,'77753 Benton Rapid Suite 898\nLake Jeromy, WA 40615','1970-08-06','\0','','perferendis'),(36,'8573 Vernon Radial Apt. 567\nWest Joanborough, MD 14084-2453','2001-04-05','\0','','molestiae'),(37,'5580 Mertz Prairie Apt. 719\nRosenbaummouth, DC 70373-2765','2007-09-21','\0','','dolores'),(38,'760 Landen Isle Suite 824\nGertrudefurt, CT 69899-8737','2002-09-24','\0','','sint'),(39,'770 Morar Loaf Suite 432\nBalistrerimouth, MA 79310-1218','1993-06-16','\0','','accusamus'),(40,'7284 Conroy Corner Suite 226\nWest Russell, NH 20890','2021-10-14','\0','','vero'),(41,'70791 Predovic Rapids\nNew Jarred, VA 18470-5494','2002-12-23','\0','','ut'),(42,'98266 Harber Loop Apt. 363\nLake Marguerite, WY 36731-6430','2016-11-10','\0','','sit'),(43,'49208 Spencer Mountains\nZiemestad, ND 30298','2005-05-19','\0','','voluptas'),(44,'5659 Carrie Via\nVictorport, NV 95327-9850','1990-05-06','\0','','dolore'),(45,'93798 Okuneva Forest Suite 404\nAhmedville, NC 02880-4148','2000-09-05','\0','','consequatur'),(46,'082 Gregg Stravenue Suite 362\nEast Bettie, NV 42421','2011-03-06','\0','','et'),(47,'16964 Harber Glen\nConortown, CT 52836-5176','2015-03-04','\0','','qui'),(48,'03935 Kunde Ranch\nCecilmouth, SD 40493-7210','1989-12-12','\0','','iusto'),(49,'1003 Bechtelar Roads Suite 969\nSchmelerville, KS 81076','1975-01-31','\0','','dolorem'),(50,'80086 Thelma Highway Apt. 870\nSalvadorland, CA 88602','1982-06-16','\0','','nobis'),(51,'89008 Yessenia Crossing\nPort Mallie, DC 27830','1984-07-26','\0','','dolorem'),(52,'1842 Savannah Green\nJaylinborough, NM 61027-5382','2011-06-08','\0','','beatae'),(53,'523 Hermann Mills\nWest Cordieborough, AZ 85114-8303','2015-04-21','\0','','atque'),(54,'30318 Devyn Mountains Apt. 037\nLockmantown, IN 12160','2017-10-23','\0','','repudiandae'),(55,'313 Lynn Island\nFraneckistad, IA 58263','1974-12-08','\0','','ut'),(56,'16752 Tevin Loaf\nMarisolberg, NJ 18431-2692','2001-02-05','\0','','iure'),(57,'110 Denesik Trail\nEast Madalynside, CO 91878','1997-07-13','\0','','aut'),(58,'2159 Brakus Fort Suite 702\nKatlynchester, NY 47790','1982-03-15','\0','','autem'),(59,'88222 Samanta Manors Apt. 300\nKirlinborough, WA 64205-5285','2012-04-15','\0','','similique'),(60,'6231 Rudy Parkways Apt. 071\nOmerland, IA 28028','1975-01-11','\0','','cumque'),(61,'7128 Aaliyah Highway Suite 098\nNorth Brannonberg, AZ 18873-8359','1986-11-25','\0','','illum'),(62,'95743 Rohan Lock Suite 142\nHuelsport, UT 48094','1998-10-11','\0','','aut'),(63,'379 Kip Heights Apt. 849\nWindlerton, WY 86097','2015-03-23','\0','','dignissimos'),(64,'9753 Forest Forges Suite 088\nSouth Lennie, MD 13553-7873','2014-10-31','\0','','itaque'),(65,'81588 Nicolas Branch\nTorpstad, NH 08157','2010-05-13','\0','','laborum'),(66,'8749 Gregg Mount Suite 697\nMitchellmouth, GA 33410-5476','2015-03-30','\0','','ab'),(67,'999 Korbin Drive\nHughland, IN 89075','1987-11-19','\0','','numquam'),(68,'810 Myrl Ridge Apt. 088\nNew Darrell, CA 37525','1990-12-25','\0','','ex'),(69,'51754 Hailey Throughway\nNorth Nicola, RI 97035','1973-09-28','\0','','eos'),(70,'551 Susan Meadows Apt. 934\nEast Daxville, KY 54582-8387','1994-08-09','\0','','similique'),(71,'5171 Conroy Land Suite 932\nStokesville, WV 19511','2012-09-25','\0','','quaerat'),(72,'3737 Pattie Mountain\nSouth Adell, LA 34051-7937','2012-12-23','\0','','debitis'),(73,'264 Robel Lodge\nWisozktown, WI 33130','2004-05-20','\0','','ipsa'),(74,'171 Bailey Path Apt. 958\nSouth Laisha, KS 34518','2009-04-20','\0','','quae'),(75,'0776 Johns Springs\nWest Tatyanafort, DC 84280','2008-06-24','\0','','rerum'),(76,'260 Jaylin Plains\nLamberttown, CT 37926','1971-07-04','\0','','incidunt'),(77,'26328 Emilie Road\nNorth Assunta, RI 61762','1983-10-03','\0','','laborum'),(78,'30125 Langosh Villages\nSmithamstad, MT 70608-0578','2011-01-13','\0','','incidunt'),(79,'76603 Reilly Prairie\nLake Berneicefurt, WV 93464','1991-06-13','\0','','aut'),(80,'66548 Ankunding Shoal Suite 610\nNorth Nikki, OK 71074-3663','1982-12-30','\0','','suscipit'),(81,'6448 Tyshawn Fort\nBatzside, IN 77831','1982-09-28','\0','','nihil'),(82,'84111 Hoeger Cliff\nPalmastad, OR 13484-0767','1970-02-08','\0','','quia'),(83,'830 Guiseppe Plaza\nChristyhaven, MT 01710-4793','2019-05-19','\0','','rerum'),(84,'9104 Peter Junctions Apt. 184\nNorth Cecile, RI 46643-6983','2015-06-26','\0','','est'),(85,'52831 Rolfson Falls Suite 538\nSantiagochester, AL 64362','2003-02-11','\0','','sit'),(86,'8334 Orlo Tunnel Suite 363\nNew Kaileyside, DE 32811','2001-04-12','\0','','nulla'),(87,'92011 DuBuque Pine\nLake Madie, NY 96562','2001-12-31','\0','','voluptatem'),(88,'52610 Goyette Wells\nSouth Kallie, NC 16329-9304','2020-10-17','\0','','delectus'),(89,'498 Bernhard Parkway Suite 153\nBergstromhaven, ME 26082','1979-12-06','\0','','ipsam'),(90,'1745 Champlin Pine Suite 925\nWest Dereckview, IA 27345-5000','2020-11-22','\0','','odit'),(91,'79506 Greenholt River\nPort Tobinmouth, AL 63831','1983-09-21','\0','','recusandae'),(92,'5072 Hailee Land Apt. 353\nMeganeborough, MD 83891-8514','2016-10-21','\0','','illo'),(93,'5398 Brown Coves\nWest Keenan, AL 03723-9993','1977-06-27','\0','','aliquid'),(94,'15861 Leuschke Mission\nKunzestad, WV 78396-4942','1984-07-10','\0','','qui'),(95,'64286 Dietrich Extensions Suite 184\nWarrenshire, WV 89495-8664','2015-12-04','\0','','voluptatem'),(96,'66860 Osinski Dale Apt. 372\nGrantburgh, SC 71142-2206','2014-10-11','\0','','qui'),(97,'838 Meaghan Roads Suite 702\nNorth Delbert, ME 42440','2009-07-09','\0','','consequatur'),(98,'43959 Jamil Locks\nNorth Malliefurt, WI 02160-1911','1998-07-09','\0','','tempore'),(99,'125 Faustino Courts\nPort Johnnie, CA 39027-0023','1997-06-28','\0','','ut'),(100,'042 Clarissa Neck Apt. 644\nDawsonfurt, NH 02672','2014-02-23','\0','','numquam'),(101,'88519 Brock Ferry Suite 749\nPort Chaim, MD 23649-2045','2010-03-30','\0','','enim');
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-28 14:10:01
