## PROJET CDA - APPLICATION ALAPAGE

## ENDPOINTS
Starts by: /api/rest


## Security : 1 - Authentification - ADMIN : 
/api/rest/security/register
- POST: Put the credentials of the admin :
{
"id_utilisateur" : "1",
"adresse_utilisateur" : "a",
"naissance_utilisateur":1997-01-25,
"email":"aaa",
"nom_utilisateur":"Cycy",
"mdp":"aaaaaa",
"telephone_utilisateur":144411,
"raison_ferme_utilisateur":"",
"prenom_utilisateur":"ddddd",
"roleName":"ADMINISTRATOR"
}


## User details

POST:\
{
"name":"myName",
"surname":"mySillySurname",
"birthdate":"1990-08-01",
"email":"example@mail.mdr",
"password":"theSecretWord", // pour les autres utilisateurs password : form330
"address":"141 Boulevard Mortier",
"phone_number":"123456-89",
"city":"Paris",
"postal_code":"75020"
}