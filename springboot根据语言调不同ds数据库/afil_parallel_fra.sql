# Host: localhost  (Version 5.7.17-log)
# Date: 2017-12-25 17:52:32
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "user"
#

CREATE TABLE `user` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户表';

#
# Data for table "user"
#

INSERT INTO `user` VALUES (1,'ming','france'),(2,'hong','france'),(3,'russian','france'),(4,'gang','france');
