/*
Navicat MySQL Data Transfer

Source Server         : west
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2017-12-15 16:50:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `useable` tinyint(2) DEFAULT NULL,
  `addtime` varchar(255) DEFAULT NULL,
  `logintime` varchar(255) DEFAULT NULL,
  `loginip` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('4', 'user1512804627893', '1', '69868714@qq.com', '0', '2017-12-09 15:30:27', null, null);
INSERT INTO `t_user` VALUES ('5', 'user1512805484394', '123456', 'user1512805484394@test.com', '1', '2017-12-09 15:44:44', null, null);
INSERT INTO `t_user` VALUES ('6', 'user1512805720564', '123456', 'user1512805720564@test.com', '1', '2017-12-09 15:48:40', null, null);
INSERT INTO `t_user` VALUES ('7', 'user1512805749426', '123456', 'user1512805749426@test.com', '1', '2017-12-09 15:49:09', null, null);
INSERT INTO `t_user` VALUES ('8', 'user1512805836930', '123456', 'user1512805836930@test.com', '1', '2017-12-09 15:50:37', null, null);
INSERT INTO `t_user` VALUES ('9', '5', '5', '5', '0', '2017-12-09 15:53:16', null, null);
INSERT INTO `t_user` VALUES ('10', 'string', 'string', 'string', '0', '2017-12-09 16:53:05', null, null);
INSERT INTO `t_user` VALUES ('11', 'string', 'string', '', '0', '2017-12-09 16:53:37', null, null);
INSERT INTO `t_user` VALUES ('12', 'string', 'string', '', '0', '2017-12-09 16:55:05', null, null);
INSERT INTO `t_user` VALUES ('13', 'string', 'string', 'qwe', '0', '2017-12-09 17:02:04', null, null);
INSERT INTO `t_user` VALUES ('14', 'string', 'string', 'string', '0', '2017-12-09 17:17:41', null, null);
INSERT INTO `t_user` VALUES ('15', '124242', '42412', '1231323@qq.com', '0', '2017-12-09 17:21:00', null, null);
INSERT INTO `t_user` VALUES ('16', '124242', '42222222', '1231323@qq.com', '0', '2017-12-09 17:23:22', null, null);
