-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: community
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `category` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(45) NOT NULL,
  PRIMARY KEY (`category_id`),
  UNIQUE KEY `categoryName_UNIQUE` (`category_name`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (13,'公益'),(5,'动漫'),(12,'教育'),(11,'时尚'),(8,'明星'),(10,'汽车'),(7,'游戏'),(2,'热门'),(3,'电影'),(4,'电视剧'),(1,'简易社区'),(9,'财经'),(6,'音乐');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `collected_post`
--

DROP TABLE IF EXISTS `collected_post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `collected_post` (
  `cp_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `post_id` int(11) NOT NULL,
  PRIMARY KEY (`cp_id`),
  KEY `cpUser_idx` (`user_id`),
  KEY `cpPost_idx` (`post_id`),
  CONSTRAINT `cpPost` FOREIGN KEY (`post_id`) REFERENCES `post` (`post_id`),
  CONSTRAINT `cpUser` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `collected_post`
--

LOCK TABLES `collected_post` WRITE;
/*!40000 ALTER TABLE `collected_post` DISABLE KEYS */;
/*!40000 ALTER TABLE `collected_post` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `floor`
--

DROP TABLE IF EXISTS `floor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `floor` (
  `floor_id` int(11) NOT NULL AUTO_INCREMENT,
  `post_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `floor_num` int(11) NOT NULL,
  `floor_text` varchar(255) DEFAULT NULL,
  `public_time` varchar(45) NOT NULL,
  PRIMARY KEY (`floor_id`),
  KEY `floorUser_idx` (`user_id`),
  KEY `floorPost_idx` (`post_id`),
  CONSTRAINT `floorPost` FOREIGN KEY (`post_id`) REFERENCES `post` (`post_id`),
  CONSTRAINT `floorUser` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `floor`
--

LOCK TABLES `floor` WRITE;
/*!40000 ALTER TABLE `floor` DISABLE KEYS */;
INSERT INTO `floor` VALUES (1,1,1,1,'1','2020-05-06 20:29:10'),(2,1,1,2,'2','2020-05-06 20:30:10'),(3,1,1,3,'3','2020-05-06 20:31:10'),(4,1,1,4,'4','2020-05-06 20:32:10'),(5,2,1,1,'2','2020-05-06 20:01:10'),(6,3,1,1,'3','2020-05-06 20:33:10'),(7,4,1,1,'4','2020-05-06 20:34:10'),(8,5,1,1,'5','2020-05-14 21:23:10'),(9,6,1,1,'dasd','2020-05-14 22:13:21'),(10,7,1,1,'asfasfas','2020-05-14 22:14:44'),(11,8,1,1,'asdasd','2020-05-14 22:15:39'),(12,9,1,1,'fasfasggjhgjghk','2020-05-14 22:16:39'),(13,10,1,1,'这一次一定要成功','2020-05-14 22:18:38'),(14,11,1,1,'怎，','2020-05-14 22:19:34'),(15,12,1,1,'来','2020-05-14 22:20:37'),(16,13,1,1,'111111','2020-05-14 22:21:28'),(17,14,1,1,'大叔大婶','2020-05-14 22:22:40'),(18,15,1,1,'大师法是否·','2020-05-14 22:24:44'),(19,16,1,1,'飒飒大师','2020-05-14 22:25:18'),(20,17,1,1,'来吧','2020-05-14 22:27:17'),(21,18,1,1,'nice！！！','2020-05-14 22:27:33'),(22,18,1,2,'测试回复','2020-05-16 20:56:41'),(24,19,1,1,'反正只是测试','2020-05-18 15:27:32'),(25,19,1,2,'测试楼层功能','2020-05-18 15:27:46'),(26,10,1,2,'其实还行吧','2020-10-18 10:40:34'),(27,20,1,1,'新的测试帖子','2020-10-18 10:41:34'),(28,20,1,2,'说实话，这个回车绑定了啥呀','2020-10-18 10:42:09'),(29,21,1,1,'别在意','2020-10-18 10:42:51'),(30,22,1,1,'所以建一个试试','2020-10-18 10:44:13'),(31,7,1,2,'新的楼层','2020-10-28 17:54:40'),(32,23,1,1,'法师法师法','2020-11-03 22:30:45'),(33,23,1,2,'发的什么国防生的看过了上东国际','2020-11-03 22:30:51'),(34,1,1,5,'大叔大婶大所大所多','2020-11-04 18:58:20'),(35,3,1,2,'31241423432','2020-11-04 19:08:02'),(36,24,1,1,'股份第三个是大法官施工队','2020-11-04 19:08:20');
/*!40000 ALTER TABLE `floor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plate`
--

DROP TABLE IF EXISTS `plate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `plate` (
  `plate_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_id` int(11) NOT NULL DEFAULT '1',
  `user_id` int(11) NOT NULL,
  `plate_name` varchar(45) NOT NULL,
  `plate_img` varchar(255) DEFAULT NULL,
  `plate_introduction` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`plate_id`),
  UNIQUE KEY `plateName_UNIQUE` (`plate_name`),
  KEY `plateUser_idx` (`user_id`),
  KEY `plateCategory_idx` (`category_id`),
  CONSTRAINT `plateCategory` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`),
  CONSTRAINT `plateUser` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plate`
--

LOCK TABLES `plate` WRITE;
/*!40000 ALTER TABLE `plate` DISABLE KEYS */;
INSERT INTO `plate` VALUES (1,1,1,'test1',NULL,'为测试而创建的版块，此版块长度设计会较长，因此再水一点字吧'),(2,1,1,'test2',NULL,'为测试而创建的版块，简介长度略长'),(3,1,1,'test3',NULL,'为测试而创建的版块，简介长度略长'),(4,1,1,'test4',NULL,'为测试而创建的版块'),(5,1,1,'测试版块',NULL,'在网页上创建的版块'),(6,1,1,'新的设计',NULL,'结束'),(7,1,1,'机甲大师的',NULL,'大的萨达');
/*!40000 ALTER TABLE `plate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `post`
--

DROP TABLE IF EXISTS `post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `post` (
  `post_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `plate_id` int(11) NOT NULL,
  `post_name` varchar(45) DEFAULT NULL,
  `post_img` varchar(255) DEFAULT NULL,
  `post_text` varchar(255) DEFAULT NULL,
  `public_time` datetime NOT NULL,
  PRIMARY KEY (`post_id`),
  KEY `postUser_idx` (`user_id`),
  KEY `postPlate_idx` (`plate_id`),
  CONSTRAINT `postPlate` FOREIGN KEY (`plate_id`) REFERENCES `plate` (`plate_id`),
  CONSTRAINT `postUser` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post`
--

LOCK TABLES `post` WRITE;
/*!40000 ALTER TABLE `post` DISABLE KEYS */;
INSERT INTO `post` VALUES (1,1,1,'T1','http://localhost/Community/upload/001.jpg','1','2020-04-24 21:52:10'),(2,1,1,'T2','http://localhost/Community/upload/002.jpg','2','2020-04-24 21:53:10'),(3,1,1,'T3',NULL,'3','2020-04-24 21:54:10'),(4,1,1,'T4',NULL,'4','2020-04-24 21:55:10'),(5,1,1,'T5','http://localhost/Community/upload/003.jpg','5','2020-05-14 21:23:10'),(6,1,2,'fd1',NULL,'dasd','2020-05-14 22:13:21'),(7,1,2,'fasfasf',NULL,'asfasfas','2020-05-14 22:14:44'),(8,1,2,'fasf',NULL,'asdasd','2020-05-14 22:15:39'),(9,1,2,'asdasdas','http://localhost/Community/upload/004.jpg','fasfasggjhgjghk','2020-05-14 22:16:39'),(10,1,3,'测试发帖','http://localhost/Community/upload/005.jpg','这一次一定要成功','2020-05-14 22:18:38'),(11,1,3,'这。。','http://localhost/Community/upload/angle.jpg','怎，','2020-05-14 22:19:34'),(12,1,3,'再一次','http://localhost/Community/upload/lense.png','来','2020-05-14 22:20:37'),(13,1,3,'再试试',NULL,'111111','2020-05-14 22:21:28'),(14,1,3,'大',NULL,'大叔大婶','2020-05-14 22:22:40'),(15,1,3,'dasd',NULL,'大师法是否·','2020-05-14 22:24:44'),(16,1,3,'奇怪',NULL,'飒飒大师','2020-05-14 22:25:18'),(17,1,3,'这回应该可以了',NULL,'来吧','2020-05-14 22:27:17'),(18,1,3,'yes',NULL,'nice！！！','2020-05-14 22:27:33'),(19,1,5,'测试帖子',NULL,'反正只是测试','2020-05-18 15:27:32'),(20,1,1,'T6',NULL,'新的测试帖子','2020-10-18 10:41:34'),(21,1,5,'随便建的',NULL,'别在意','2020-10-18 10:42:51'),(22,1,4,'这个地方还没有帖子',NULL,'所以建一个试试','2020-10-18 10:44:13'),(23,1,6,'天山大街',NULL,'法师法师法','2020-11-03 22:30:45'),(24,1,1,'飞洒发三份',NULL,'股份第三个是大法官施工队','2020-11-04 19:08:20');
/*!40000 ALTER TABLE `post` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reply`
--

DROP TABLE IF EXISTS `reply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `reply` (
  `reply_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `floor_id` int(11) NOT NULL,
  `reply_num` int(11) NOT NULL,
  `reply_text` varchar(255) NOT NULL,
  `public_time` varchar(45) NOT NULL,
  `reply_user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`reply_id`),
  KEY `replyFloor_idx` (`floor_id`),
  KEY `replyUser2_idx` (`reply_user_id`),
  KEY `replyUser_idx` (`user_id`,`reply_user_id`) /*!80000 INVISIBLE */,
  KEY `replyUser_idx1` (`reply_id`,`reply_user_id`),
  CONSTRAINT `replyFloor` FOREIGN KEY (`floor_id`) REFERENCES `floor` (`floor_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reply`
--

LOCK TABLES `reply` WRITE;
/*!40000 ALTER TABLE `reply` DISABLE KEYS */;
INSERT INTO `reply` VALUES (1,1,4,1,'测试内容','2020-04-28 20:28:10',1),(2,1,1,1,'测试内容2','2020-04-28 20:29:10',1),(3,1,1,2,'测试内容3','2020-04-28 20:30:10',1),(4,1,1,3,'测试内容4','2020-04-28 20:31:10',1),(5,1,1,4,'测试内容5','2020-04-28 20:32:10',1),(6,1,2,1,'测试内容6','2020-04-28 20:33:10',1),(7,1,3,1,'测试内容9','2020-04-28 20:34:10',1),(8,1,5,1,'测试回复','2020-05-17 10:35:43',1),(9,1,25,1,'测试回复功能','2020-05-18 15:27:51',1),(10,1,13,1,'好像还能用','2020-10-18 10:40:24',1),(11,1,27,1,'其实一楼不做这种会比较好','2020-10-18 10:41:52',1),(12,1,10,1,'gtj','2020-10-28 17:54:22',1),(13,1,31,1,'感觉跟实时刷新一样','2020-10-28 17:54:53',1),(14,1,32,1,'法师法师法发·','2020-11-03 22:30:48',1),(15,1,4,1,'测试回复','2020-11-04 18:58:15',1),(16,1,6,1,'434324324','2020-11-04 19:08:00',1);
/*!40000 ALTER TABLE `reply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subscribe`
--

DROP TABLE IF EXISTS `subscribe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `subscribe` (
  `subscribe_id` int(11) NOT NULL AUTO_INCREMENT,
  `subscribe_user_id` int(11) NOT NULL,
  `fans_id` int(11) NOT NULL,
  PRIMARY KEY (`subscribe_id`),
  KEY `subscribeUser_idx` (`subscribe_user_id`),
  KEY `subscribeFans_idx` (`fans_id`),
  CONSTRAINT `subscribeFans` FOREIGN KEY (`fans_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `subscribeUser` FOREIGN KEY (`subscribe_user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subscribe`
--

LOCK TABLES `subscribe` WRITE;
/*!40000 ALTER TABLE `subscribe` DISABLE KEYS */;
/*!40000 ALTER TABLE `subscribe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `user_Id` int(11) NOT NULL AUTO_INCREMENT,
  `user_Name` varchar(45) NOT NULL,
  `user_Password` varchar(255) NOT NULL,
  `name` varchar(45) NOT NULL,
  `sex` int(11) NOT NULL DEFAULT '1',
  `birth` date DEFAULT NULL,
  `introduction` varchar(255) DEFAULT '这人很懒什么都没写',
  `user_Permissions` int(11) NOT NULL DEFAULT '1',
  `userimg` varchar(255) DEFAULT 'http://localhost/Community/upload/head.png',
  PRIMARY KEY (`user_Id`),
  UNIQUE KEY `userName_UNIQUE` (`user_Name`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Wind8cs','Wind3604','Test1',1,NULL,'这人很懒什么都没写',5,NULL),(2,'lent','123','Test2',1,NULL,'这人很懒什么都没写',1,NULL),(3,'yt','212312','2144',1,NULL,'这人很懒什么都没写',1,NULL),(4,'oniak','1544371ADEE7EA2C0E6E42A48595C87FDB0F66AF94748E1C4722BF0D','鬼贻',1,'1998-08-08','这人很懒什么都没写',0,'http://localhost/Community/upload/head.png'),(5,'Wind3604','E57B30FDC8926F4643628EF70E71DBD7CEE0408C873707763316399A','官方人员',1,'1998-08-08','这人很懒什么都没写',0,'http://localhost/Community/upload/head.png'),(7,'18819794531','CF8CEB5DE79FBDC3E429AF5C4648AAC81749CDC4095075ABA6ED9806','奇翼',1,'1998-08-08','这人很懒什么都没写',0,'http://localhost/Community/upload/head.png');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-27 13:29:53
