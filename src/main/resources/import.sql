CREATE TABLE IF NOT EXISTS `role` (`id_role` bigint NOT NULL AUTO_INCREMENT, `role_name` varchar(255) DEFAULT NULL)
INSERT INTO `role` (`role_name`) VALUES ('VISITOR'), ('ADMINISTRATOR');
