
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `bank_a`
-- ----------------------------
DROP TABLE IF EXISTS `bank_a`;
CREATE TABLE `bank_a` (
  `money` int DEFAULT NULL,
  `user` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bank_a
-- ----------------------------
INSERT INTO `bank_a` VALUES ('50', 'zhang');
