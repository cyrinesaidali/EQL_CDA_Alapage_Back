## PROJET CDA - APPLICATION ALAPAGE
## ENDPOINTS
Starts by: /api/rest


## Security : 1 - S'enregistrer - ADMIN ET CLIENT : 
/!\ CHANGER LES PARAMS A METTRE DANS LE JSON ET REGISTRATION SITE DTo

- POST: Création identifiants : localhost:8080/api/rest/security/register
{
"lastNameUser": "Mohamed",
"surnameUser": "Ahmed",
"email": "mohamedAhmed@alapage.com",
"phoneNumber": 255444,
"birthdateUser":"2025",
"address":"Streeeeeet",
"login": "moh",
"password": "moh",
"roleName": "ADMINISTRATOR"
}

- POST :
{
"lastNameUser": "Pilou",
"email": "pilou@pilou.com",
"surnameUser": "Pilou",
"phoneNumber": 888888888888,
"birthdateUser":"1997",
"address":"Streeeeeet",
"login": "pi",
"password": "pi",
"roleName": "CLIENT"
}

- POST : localhost:8080/api/rest/security/authenticate
{
"login": "moh",
"password": "moh"
}

################################################

## ADMINISTRATEUR /
- Ajout de manuels scolaires
- POST : localhost:8080/api/rest/administrator/addTextbook
{
"priceTextbook": 255.99,
"referenceTextbook": "REF-ABC-55555568",
"titleTextbook": "Titre C",
"educationLevelTextbook": "SIXIEME",
"subjectTextbook": "ESPAGNOL",
"isbn": "978-2-00-000000-0",
"yearEditionTextbook": "20151",
"userId": 1,
"editorTextbook": null
}

- Affichage des manuels scolaires
- GET : localhost:8080/api/rest/client/displayTextbook
