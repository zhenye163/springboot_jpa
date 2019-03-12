/*
Navicat MySQL Data Transfer
Source Server         : cloud
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : springboot_jpa
Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001
Date: 2017-09-25 18:29:25
*/
 
SET FOREIGN_KEY_CHECKS=0;
 
-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `class_no` int(11) DEFAULT NULL COMMENT '班级号-一个老师可能有多个班级号',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `phone_num` varchar(255) DEFAULT NULL COMMENT '手机号',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别',
  `subject` varchar(255) DEFAULT NULL COMMENT '老师授课学科',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
 
-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '武汉', '43', '1', '易中天', '65432', '男', '语文');
INSERT INTO `teacher` VALUES ('2', '武汉', '43', '3', '易中天', '65432', '男', '语文');
INSERT INTO `teacher` VALUES ('3', '杭州', '40', '2', '于丹', '88858', '女', '政治');
INSERT INTO `teacher` VALUES ('4', '杭州', '40', '3', '于丹', '88858', '女', '政治');
INSERT INTO `teacher` VALUES ('5', '北京', '35', '1', '华罗庚', '74147', '男', '数学');
INSERT INTO `teacher` VALUES ('6', '北京', '35', '2', '华罗庚', '74147', '男', '数学');