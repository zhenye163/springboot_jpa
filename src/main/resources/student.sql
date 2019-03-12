/*
Navicat MySQL Data Transfer
Source Server         : cloud
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : springboot_jpa
Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001
Date: 2017-09-25 18:28:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `class_no` int(11) DEFAULT NULL COMMENT '班级号',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `phone_num` varchar(255) DEFAULT NULL COMMENT '手机号',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '蜀国', '54', '1', '刘备', '12306', '男');
INSERT INTO `student` VALUES ('2', '蜀国', '48', '1', '关羽', '88888', '男');
INSERT INTO `student` VALUES ('3', '蜀国', '46', '1', '张飞', '66666', '男');
INSERT INTO `student` VALUES ('4', '蜀国', '40', '1', '诸葛亮', '12581', '男');
INSERT INTO `student` VALUES ('5', '吴国', '45', '2', '孙权', '34543', '男');
INSERT INTO `student` VALUES ('6', '吴国', '32', '2', '周瑜', '99999', '男');
INSERT INTO `student` VALUES ('7', '吴国', '29', '2', '大乔', '56565', '女');
INSERT INTO `student` VALUES ('8', '吴国', '27', '2', '小乔', '12321', '女');
INSERT INTO `student` VALUES ('9', '魏国', '57', '3', '曹操', '74848', '男');
INSERT INTO `student` VALUES ('10', '魏国', '42', '3', '司马懿', '58581', '男');
INSERT INTO `student` VALUES ('11', '魏国', '35', '3', '曹丕', '69393', '男');
INSERT INTO `student` VALUES ('12', '魏国', '30', '3', '甄姬', '98778', '女');