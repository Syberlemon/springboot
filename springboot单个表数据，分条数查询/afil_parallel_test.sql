# Host: localhost  (Version 5.7.17-log)
# Date: 2017-12-25 17:59:27
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "afil_distribute"
#

CREATE TABLE `afil_distribute` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `tablename` varchar(255) DEFAULT NULL COMMENT '表名',
  `start` varchar(255) DEFAULT NULL COMMENT '开始值',
  `end` varchar(255) DEFAULT NULL COMMENT '结束值',
  `ip` varchar(255) DEFAULT NULL,
  `port` varchar(255) DEFAULT NULL,
  `microservice` varchar(255) DEFAULT NULL COMMENT '微服务',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='数据分布表';

#
# Data for table "afil_distribute"
#

INSERT INTO `afil_distribute` VALUES (1,'afil_fingerprint','0','5',NULL,NULL,'afil_fingerprint_1'),(2,'afil_fingerprint','10','20',NULL,NULL,'afil_fingerprint_2'),(3,'afil_fingerprint','20','30',NULL,NULL,'afil_fingerprint_3');

#
# Structure for table "afil_fingerprint"
#

CREATE TABLE `afil_fingerprint` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '人员名称',
  `finger` varchar(255) DEFAULT NULL COMMENT '指纹',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8 COMMENT='指纹表';

#
# Data for table "afil_fingerprint"
#

INSERT INTO `afil_fingerprint` VALUES (1,'user1','finger1'),(2,'user2','finger2'),(3,'user3','finger3'),(4,'user4','finger4'),(5,'user5','finger5'),(6,'user6','finger6'),(7,'user7','finger7'),(8,'user8','finger8'),(9,'user9','finger9'),(10,'user10','finger10'),(11,'user11','finger11'),(12,'user12','finger12'),(13,'user13','finger13'),(14,'user14','finger14'),(15,'user15','finger15'),(16,'user16','finger16'),(17,'user17','finger17'),(18,'user18','finger18'),(19,'user19','finger19'),(20,'user20','finger20'),(21,'user21','finger21'),(22,'user22','finger22'),(23,'user23','finger23'),(24,'user24','finger24'),(25,'user25','finger25'),(26,'user26','finger26'),(27,'user27','finger27'),(28,'user28','finger28'),(29,'user29','finger29'),(30,'user30','finger30'),(31,'user31','finger31'),(32,'user32','finger32'),(33,'user33','finger33'),(34,'user34','finger34'),(35,'user35','finger35'),(36,'user36','finger36'),(37,'user37','finger37'),(38,'user38','finger38'),(39,'user39','finger39'),(40,'user40','finger40'),(41,'user41','finger41'),(42,'user42','finger42'),(43,'user43','finger43'),(44,'user44','finger44'),(45,'user45','finger45'),(46,'user46','finger46'),(47,'user47','finger47'),(48,'user48','finger48'),(49,'user49','finger49'),(50,'user50','finger50');
