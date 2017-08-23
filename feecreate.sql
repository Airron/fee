/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50173
Source Host           : 127.0.0.1:3306
Source Database       : feecreate

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2017-08-14 08:23:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for feediagnosescount
-- ----------------------------
DROP TABLE IF EXISTS `feediagnosescount`;
CREATE TABLE `feediagnosescount` (
  `diagnosesId` int(11) NOT NULL,
  `diagnosesDate` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `diagnosesHospitalId` int(11) DEFAULT NULL,
  `diagnosesCount` int(255) DEFAULT NULL,
  PRIMARY KEY (`diagnosesId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of feediagnosescount
-- ----------------------------

-- ----------------------------
-- Table structure for feefile
-- ----------------------------
DROP TABLE IF EXISTS `feefile`;
CREATE TABLE `feefile` (
  `fileId` int(11) NOT NULL AUTO_INCREMENT,
  `filePath` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `fileName` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `fileType` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`fileId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of feefile
-- ----------------------------

-- ----------------------------
-- Table structure for feehospital
-- ----------------------------
DROP TABLE IF EXISTS `feehospital`;
CREATE TABLE `feehospital` (
  `hospitalId` int(11) NOT NULL,
  `hospitalAreaId` int(11) DEFAULT NULL,
  `hospitalName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `hospitalShortname` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`hospitalId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of feehospital
-- ----------------------------
INSERT INTO `feehospital` VALUES ('1', '1', '黄州区堵城镇卫生院', '堵城镇卫生院');
INSERT INTO `feehospital` VALUES ('2', '1', '黄冈市中医医院', '中医医院');
INSERT INTO `feehospital` VALUES ('3', '1', '黄冈市陈策楼镇中心卫生院', '陈策楼镇中心卫生院');
INSERT INTO `feehospital` VALUES ('4', '1', '黄冈市中医医院陶店分院', '中医医院陶店分院');
INSERT INTO `feehospital` VALUES ('5', '1', '黄冈市康泰医院', '康泰医院');
INSERT INTO `feehospital` VALUES ('6', null, null, '南湖社区卫生服务中心\r\n佳福骨科医院\r\n白果中心卫生院\r\n新开镇卫生院\r\n南湖社区卫生服务中心\r\n南湖社区卫生服务中心');
INSERT INTO `feehospital` VALUES ('7', null, null, '佳福骨科医院\r\n佳福骨科医院');
INSERT INTO `feehospital` VALUES ('8', null, null, '白果中心卫生院\r\n白果中心卫生院');
INSERT INTO `feehospital` VALUES ('9', null, null, '新开镇卫生院\r\n新开镇卫生院');
INSERT INTO `feehospital` VALUES ('10', null, null, null);

-- ----------------------------
-- Table structure for feehospitalareaname
-- ----------------------------
DROP TABLE IF EXISTS `feehospitalareaname`;
CREATE TABLE `feehospitalareaname` (
  `feeHospitalAreaId` int(11) NOT NULL AUTO_INCREMENT,
  `feeHospitalAreaName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`feeHospitalAreaId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of feehospitalareaname
-- ----------------------------
INSERT INTO `feehospitalareaname` VALUES ('1', '黄州');
INSERT INTO `feehospitalareaname` VALUES ('2', '麻城');
INSERT INTO `feehospitalareaname` VALUES ('3', '黄梅');
INSERT INTO `feehospitalareaname` VALUES ('4', '团风');
INSERT INTO `feehospitalareaname` VALUES ('5', '溪水');
INSERT INTO `feehospitalareaname` VALUES ('6', '罗田');
INSERT INTO `feehospitalareaname` VALUES ('7', '英山');
INSERT INTO `feehospitalareaname` VALUES ('8', '武穴');
INSERT INTO `feehospitalareaname` VALUES ('9', '蕲春');
INSERT INTO `feehospitalareaname` VALUES ('10', '未知');

-- ----------------------------
-- Table structure for feeuser
-- ----------------------------
DROP TABLE IF EXISTS `feeuser`;
CREATE TABLE `feeuser` (
  `fee_user_id` int(11) NOT NULL,
  `fee_user_role` int(11) DEFAULT '0',
  `fee_user_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `fee_user_password` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`fee_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of feeuser
-- ----------------------------
