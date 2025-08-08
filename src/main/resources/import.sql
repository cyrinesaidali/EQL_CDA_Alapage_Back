-- Listage des données de la table alapage_db.manuel_scolaire : ~5 rows (environ)
INSERT INTO `manuel_scolaire` (`id_manuel`, `editeur_manuel`, `classe_sco_manuel`, `isbn`, `photo_manuel`, `prix_manuel`, `ref_manuel`, `statut_dispo_manuel`, `sujet_manuel`, `titre_manuel`, `annee_edition_manuel`) VALUES (1, 'HACHETTE_LIVRE', 'CP', '9782011165435', 'https://media.hachette.fr/fit-in/780x1280/imgArticle/HACHETTEEDUCATION/2006/9782011165435-T.jpg?source=web', 8.00, 'EAN-CP-1', 'NON_DISPONIBLE', 'MATHÉMATIQUES', 'Mathémathiques CP', '2006-07-12 00:00:00.000000')
INSERT INTO `manuel_scolaire` (`id_manuel`, `editeur_manuel`, `classe_sco_manuel`, `isbn`, `photo_manuel`, `prix_manuel`, `ref_manuel`, `statut_dispo_manuel`, `sujet_manuel`, `titre_manuel`, `annee_edition_manuel`) VALUES (2, 'EDITIS', 'CE2', '9782725631455', 'UUUUUUUU', 29.99, 'EAN-CE2-1', 'DISPONIBLE', 'SCIENCES_DE_LA_VIE_ET_DE_LA_TERRE', 'Sciences CE2', '2012-05-01 00:00:00');
INSERT INTO `manuel_scolaire` (`id_manuel`, `editeur_manuel`, `classe_sco_manuel`, `isbn`, `photo_manuel`, `prix_manuel`, `ref_manuel`, `statut_dispo_manuel`, `sujet_manuel`, `titre_manuel`, `annee_edition_manuel`) VALUES (3, 'MADRIGALL', 'CE2', '9782849260784', 'UUUUUUUU', 10.00, 'EAN-CE2-2', 'DISPONIBLE', 'ANGLAIS', 'Anglais au CE2', '2009-05-01 00:00:00');
INSERT INTO `manuel_scolaire` (`id_manuel`, `editeur_manuel`, `classe_sco_manuel`, `isbn`, `photo_manuel`, `prix_manuel`, `ref_manuel`, `statut_dispo_manuel`, `sujet_manuel`, `titre_manuel`, `annee_edition_manuel`) VALUES (4, 'EDITIS', 'CE1', '9782218720796', 'UUUUUUUU', 8.99, 'EAN-CE1-1', 'NON_DISPONIBLE', 'MATHÉMATIQUES', 'Connaître - Géométrie CE1', '1998-01-30 00:00:00');
INSERT INTO `manuel_scolaire` (`id_manuel`, `editeur_manuel`, `classe_sco_manuel`, `isbn`, `photo_manuel`, `prix_manuel`, `ref_manuel`, `statut_dispo_manuel`, `sujet_manuel`, `titre_manuel`, `annee_edition_manuel`) VALUES (5, 'MADRIGALL', 'CM1', '9782822234696', 'UUUUUUUU', 7.50, 'EAN-CM1-2', 'DISPONIBLE', 'PHYSIQUE_CHIMIE', 'Vive le CM1', '2021-09-01 00:00:00');
INSERT INTO `manuel_scolaire` (`id_manuel`, `editeur_manuel`, `classe_sco_manuel`, `isbn`, `photo_manuel`, `prix_manuel`, `ref_manuel`, `statut_dispo_manuel`, `sujet_manuel`, `titre_manuel`, `annee_edition_manuel`) VALUES (6, 'LEXIS_NEXIS', 'CM2', '9782725634678', 'UUUUUUUU', 20.00, 'EAN-CM2-2', 'NON_DISPONIBLE', 'HISTOIRE_GÉOGRAPHIE', 'Géographie CM2 Posters', '2016-10-01 00:00:00');



-- Listage des données de la table alapage_db.role : ~2 rows (environ)
INSERT INTO `role` (`id_role`, `role_name`) VALUES (1, 'CLIENT');
INSERT INTO `role` (`id_role`, `role_name`) VALUES (2, 'ADMINISTRATOR');


-- Listage des données de la table alapage_db.utilisateur : ~3 rows (environ)
INSERT INTO `utilisateur` (`id_utilisateur`, `adresse_utilisateur`, `naissance_utilisateur`, `email`, `nom_utilisateur`, `login`, `mdp`, `telephone_utilisateur`, `raison_ferme_utilisateur`, `prenom_utilisateur`) VALUES (1, '18 Rue Mamoudzou - 97600 MAMOUDZOU ', '1985-05-05 00:00:00.000000', 'MohamedAhmed@alapage.com', 'Mohamed', 'AdminLibrairieAlapage', '$2a$10$VzIdf/QSWBunx6tFrCE.qO4UUFAPdMcEr/NK1i6G2wRwPFviHvVaG', 33770060414, NULL, 'Ahmed');
INSERT INTO `utilisateur` (`id_utilisateur`, `adresse_utilisateur`, `naissance_utilisateur`, `email`, `nom_utilisateur`, `login`, `mdp`, `telephone_utilisateur`, `raison_ferme_utilisateur`, `prenom_utilisateur`) VALUES (2, '1 Rue de la Grande Traversée - 97600 MAMOUDZOU ', '1999-01-12 00:00:00.000000', 'milenakames@gmail.com', 'Milena', 'MilenaKamesLogin', '$2a$10$Pymal2PO0LOTWSjpXZ1xMu2k5dCnXzdwRIad4Yke8e84xFfRgu/cm', 33747107410, NULL, 'Kames');
INSERT INTO `utilisateur` (`id_utilisateur`, `adresse_utilisateur`, `naissance_utilisateur`, `email`, `nom_utilisateur`, `login`, `mdp`, `telephone_utilisateur`, `raison_ferme_utilisateur`, `prenom_utilisateur`) VALUES (3, '30 Rue du Lycée - 97600 MAMOUDZOU ', '1978-02-02 00:00:00.000000', 'Kender25@gmail.com', 'Heida', 'Kender25', '$2a$10$3GoW6k5Yog/UTUEtykaodeSfmVO5yKNuwZJw9f3/tG5WBuWfxvcJK', 33741036318, NULL, 'Kender');
INSERT INTO `utilisateur` (`id_utilisateur`, `adresse_utilisateur`, `naissance_utilisateur`, `email`, `nom_utilisateur`, `login`, `mdp`, `telephone_utilisateur`, `raison_ferme_utilisateur`, `prenom_utilisateur`) VALUES (4, '56 Rue Tanamalaza - 97600 MAMOUDZOU ', '1987-02-10 00:00:00.000000', 'JChatain@gmail.com', 'Jerrine', 'JChatain01', '$2a$10$UV5cD9E3xbULoHkMbpr7/ecxZjhRurX9IyWvc9heLgZVR80ETynF2', 33781555896, NULL, 'Chatain');


-- Listage des données de la table alapage_db.utilisateur_role : ~3 rows (environ)
INSERT INTO `utilisateur_role` (`id_utilisateur`, `id_role`) VALUES (1, 2);
INSERT INTO `utilisateur_role` (`id_utilisateur`, `id_role`) VALUES (2, 1);
INSERT INTO `utilisateur_role` (`id_utilisateur`, `id_role`) VALUES (3, 1);
INSERT INTO `utilisateur_role` (`id_utilisateur`, `id_role`) VALUES (4, 1);