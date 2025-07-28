-- Listage des données de la table alapage_db.manuel_scolaire : ~5 rows (environ)
INSERT INTO `manuel_scolaire` (`id_manuel`, `classe_sco_manuel`, `isbn`, `photo_manuel`, `prix_manuel`, `ref_manuel`, `statut_dispo_manuel`, `sujet_manuel`, `titre_manuel`, `annee_edition_manuel`, `id_editeur`) VALUES
	(1, 'CM2', '55555555555555', NULL, 3.99, 'REF-ABC-555555555555', 'DISPONIBLE', 'HISTOIRE_GEO', 'Titre 5555555555555555', '1970-01-01 00:00:01.999000', NULL),
	(2, 'CM2', '33333333333', NULL, 3.99, 'REF-ABC-3333333333', 'DISPONIBLE', 'HISTOIRE_GEO', 'Titre 3333333333333', '1970-01-01 00:00:01.999000', NULL),
	(3, 'CE1', '111111111111111111111', NULL, 20.95, 'REF-ABC-11111111111', 'NON_DISPONIBLE', 'HISTOIRE_GEO', 'Titre 11111111111', '1970-01-01 00:00:01.999000', NULL),
	(4, 'CE1', '444444444444444444444444', NULL, 20.95, 'REF-ABC-444444444444444444', 'NON_DISPONIBLE', 'HISTOIRE_GEO', 'Titre 4444444444444', '1970-01-01 00:00:02.005000', NULL),
	(5, 'CP', '77777777777777777', NULL, 20.95, 'REF-ABC-77777777777777777', 'DISPONIBLE', 'HISTOIRE_GEO', 'Titre 77777777777777777', '1970-01-01 00:00:02.005000', NULL);

-- Listage des données de la table alapage_db.role : ~2 rows (environ)
INSERT INTO `role` (`id_role`, `role_name`) VALUES
	(1, 'CLIENT'),
	(2, 'ADMINISTRATOR');

-- Listage des données de la table alapage_db.utilisateur : ~1 rows (environ)
INSERT INTO `utilisateur` (`id_utilisateur`, `adresse_utilisateur`, `naissance_utilisateur`, `email`, `nom_utilisateur`, `login`, `mdp`, `telephone_utilisateur`, `raison_ferme_utilisateur`, `prenom_utilisateur`) VALUES
	(1, NULL, NULL, 'Adam@adam.com', 'Adam', 'a', '$2a$10$OPBCl/Nw0HYBrTtp/.mi6O1BQqwDh8n07vMxMCeqoJQiJT7u870F.', NULL, NULL, 'Adam');

-- Listage des données de la table alapage_db.utilisateur_role : ~1 rows (environ)
INSERT INTO `utilisateur_role` (`id_utilisateur`, `id_role`) VALUES
	(1, 1);