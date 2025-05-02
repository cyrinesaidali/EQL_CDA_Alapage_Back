-- Listage des données de la table alapage_db.commande : ~1 rows (environ)

-- Listage des données de la table alapage_db.editeur : ~0 rows (environ)

-- Listage des données de la table alapage_db.ligne_commande : ~0 rows (environ)

-- Listage des données de la table alapage_db.manuel_scolaire : ~5 rows (environ)
INSERT INTO `manuel_scolaire` (`id_manuel`, `classe_sco_manuel`, `isbn`, `photo_manuel`, `prix_manuel`, `ref_manuel`, `statut_dispo_manuel`, `sujet_manuel`, `titre_manuel`, `annee_edition_manuel`, `id_editeur`) VALUES (1, 'CM2', '55555555555555', NULL, 3.99, 'REF-ABC-555555555555', 'DISPONIBLE', 'HISTOIRE_GEO', 'Titre 5555555555555555', '1970-01-01 00:00:01.999000', NULL);
INSERT INTO `manuel_scolaire` (`id_manuel`, `classe_sco_manuel`, `isbn`, `photo_manuel`, `prix_manuel`, `ref_manuel`, `statut_dispo_manuel`, `sujet_manuel`, `titre_manuel`, `annee_edition_manuel`, `id_editeur`) VALUES (2, 'CM2', '33333333333', NULL, 3.99, 'REF-ABC-3333333333', 'DISPONIBLE', 'HISTOIRE_GEO', 'Titre 3333333333333', '1970-01-01 00:00:01.999000', NULL);
INSERT INTO `manuel_scolaire` (`id_manuel`, `classe_sco_manuel`, `isbn`, `photo_manuel`, `prix_manuel`, `ref_manuel`, `statut_dispo_manuel`, `sujet_manuel`, `titre_manuel`, `annee_edition_manuel`, `id_editeur`) VALUES (3, 'CE1', '111111111111111111111', NULL, 20.95, 'REF-ABC-11111111111', 'NON_DISPONIBLE', 'HISTOIRE_GEO', 'Titre 11111111111', '1970-01-01 00:00:01.999000', NULL);
INSERT INTO `manuel_scolaire` (`id_manuel`, `classe_sco_manuel`, `isbn`, `photo_manuel`, `prix_manuel`, `ref_manuel`, `statut_dispo_manuel`, `sujet_manuel`, `titre_manuel`, `annee_edition_manuel`, `id_editeur`) VALUES (4, 'CE1', '444444444444444444444444', NULL, 20.95, 'REF-ABC-444444444444444444', 'NON_DISPONIBLE', 'HISTOIRE_GEO', 'Titre 4444444444444', '1970-01-01 00:00:02.005000', NULL);
INSERT INTO `manuel_scolaire` (`id_manuel`, `classe_sco_manuel`, `isbn`, `photo_manuel`, `prix_manuel`, `ref_manuel`, `statut_dispo_manuel`, `sujet_manuel`, `titre_manuel`, `annee_edition_manuel`, `id_editeur`) VALUES (5, 'CP', '77777777777777777', NULL, 20.95, 'REF-ABC-77777777777777777', 'DISPONIBLE', 'HISTOIRE_GEO', 'Titre 77777777777777777', '1970-01-01 00:00:02.005000', NULL);

-- Listage des données de la table alapage_db.role : ~2 rows (environ)
INSERT INTO `role` (`id_role`, `role_name`) VALUES (1, 'CLIENT');
INSERT INTO `role` (`id_role`, `role_name`) VALUES (2, 'ADMINISTRATOR');

-- Listage des données de la table alapage_db.utilisateur : ~3 rows (environ)
INSERT INTO `utilisateur` (`id_utilisateur`, `adresse_utilisateur`, `naissance_utilisateur`, `email`, `nom_utilisateur`, `login`, `mdp`, `telephone_utilisateur`, `raison_ferme_utilisateur`, `prenom_utilisateur`) VALUES (1, 'Streeeeeet', '1970-01-01 00:00:02.025000', 'mohamedAhmed@alapage.com', 'Mohamed', 'moh', '$2a$10$OJeyLesXOauhoC8UCGNmZOwlleR8kfygJRMvGC5/oZ1HC70mBAmXG', 255444, NULL, 'Ahmed');
INSERT INTO `utilisateur` (`id_utilisateur`, `adresse_utilisateur`, `naissance_utilisateur`, `email`, `nom_utilisateur`, `login`, `mdp`, `telephone_utilisateur`, `raison_ferme_utilisateur`, `prenom_utilisateur`) VALUES (2, NULL, NULL, 'melia@adam.com', 'Melia', 'b', '$2a$10$auFaHdX7TMzNyRDiFTn5s.fq15T9ifN/s/F/AHOoXRca1In2Klhcu', NULL, NULL, 'Melia');
INSERT INTO `utilisateur` (`id_utilisateur`, `adresse_utilisateur`, `naissance_utilisateur`, `email`, `nom_utilisateur`, `login`, `mdp`, `telephone_utilisateur`, `raison_ferme_utilisateur`, `prenom_utilisateur`) VALUES (3, NULL, NULL, 'Adam@adam.com', 'Adam', 'a', '$2a$10$KIb4Ml4vndlBXEdoDbeFUO.Mum67wNM2ePPTSWhNGMnAOu62Ju6Vy', NULL, NULL, 'Adam');

-- Listage des données de la table alapage_db.utilisateur_role : ~3 rows (environ)
INSERT INTO `utilisateur_role` (`id_utilisateur`, `id_role`) VALUES (1, 2);
INSERT INTO `utilisateur_role` (`id_utilisateur`, `id_role`) VALUES (2, 1);
INSERT INTO `utilisateur_role` (`id_utilisateur`, `id_role`) VALUES (3, 1);