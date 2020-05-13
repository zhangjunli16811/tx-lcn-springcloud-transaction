
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `bank_b`
-- ----------------------------
DROP TABLE IF EXISTS `bank_b`;
CREATE TABLE `bank_b` (
  `money` int DEFAULT NULL,
  `user` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bank_b
-- ----------------------------
INSERT INTO `bank_b` VALUES ('10', 'zhang');
