-- --------------------------------------------------------
-- Hôte:                         127.0.0.1
-- Version du serveur:           5.7.36 - MySQL Community Server (GPL)
-- SE du serveur:                Win64
-- HeidiSQL Version:             12.0.0.6468
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Listage des données de la table alapage_db.commande : ~0 rows (environ)
DELETE FROM `commande`;

-- Listage des données de la table alapage_db.editeur : ~0 rows (environ)
DELETE FROM `editeur`;

-- Listage des données de la table alapage_db.ligne_commande : ~0 rows (environ)
DELETE FROM `ligne_commande`;

-- Listage des données de la table alapage_db.manuel_scolaire : ~3 rows (environ)
DELETE FROM `manuel_scolaire`;
INSERT INTO `manuel_scolaire` (`id_manuel`, `classe_sco_manuel`, `isbn`, `prix_manuel`, `ref_manuel`, `statut_dispo_manuel`, `sujet_manuel`, `titre_manuel`, `annee_edition_manuel`, `id_editeur`, `id_utilisateur`) VALUES
	(1, 'TROISIEME', '11111111111111111', 2.99, 'REF-ABC-111111111111', 'NON_DISPONIBLE', 'HISTOIRE_GEO', 'Titre A', '1970-01-01 00:00:01.995000', NULL, NULL),
	(2, 'QUATRIEME', '22222222222222222', 3.99, 'REF-ABC-2222222222222', 'DISPONIBLE', 'HISTOIRE_GEO', 'Titre A', '1970-01-01 00:00:02.020000', NULL, NULL),
	(3, 'CM1', '3333333333333333333', 3.99, 'REF-ABC-33333333333333', 'DISPONIBLE', 'HISTOIRE_GEO', 'Titre A', '1970-01-01 00:00:02.020000', NULL, NULL);

-- Listage des données de la table alapage_db.role : ~2 rows (environ)
DELETE FROM `role`;
INSERT INTO `role` (`id_role`, `role_name`) VALUES
	(1, 'CLIENT'),
	(2, 'ADMINISTRATOR');

-- Listage des données de la table alapage_db.utilisateur : ~3 rows (environ)
DELETE FROM `utilisateur`;
INSERT INTO `utilisateur` (`id_utilisateur`, `adresse_utilisateur`, `naissance_utilisateur`, `email`, `nom_utilisateur`, `login`, `mdp`, `telephone_utilisateur`, `raison_ferme_utilisateur`, `prenom_utilisateur`) VALUES
	(1, 'Streeeeeet', '1970-01-01 00:00:02.025000', 'mohamedAhmed@alapage.com', 'Mohamed', 'moh', '$2a$10$OJeyLesXOauhoC8UCGNmZOwlleR8kfygJRMvGC5/oZ1HC70mBAmXG', 255444, NULL, 'Ahmed'),
	(2, NULL, NULL, 'melia@adam.com', 'Melia', 'b', '$2a$10$auFaHdX7TMzNyRDiFTn5s.fq15T9ifN/s/F/AHOoXRca1In2Klhcu', NULL, NULL, 'Melia'),
	(3, NULL, NULL, 'Adam@adam.com', 'Adam', 'a', '$2a$10$KIb4Ml4vndlBXEdoDbeFUO.Mum67wNM2ePPTSWhNGMnAOu62Ju6Vy', NULL, NULL, 'Adam');

-- Listage des données de la table alapage_db.utilisateur_role : ~3 rows (environ)
DELETE FROM `utilisateur_role`;
INSERT INTO `utilisateur_role` (`id_utilisateur`, `id_role`) VALUES
	(1, 2),
	(2, 1),
	(3, 1);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
