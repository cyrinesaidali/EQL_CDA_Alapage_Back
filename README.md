## PROJET CDA - APPLICATION ALAPAGE
## ENDPOINTS
Starts by: /api/rest

## ADMINISTRATEUR : 
### Security : 1 - S'enregistrer - ADMIN :
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

### Security : S'authentifier :
- POST : localhost:8080/api/rest/security/authenticate
  {
  "login": "moh",
  "password": "moh"
  *tokenAdmin à renseigner*
  }

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
-   *token à renseigner*

}

- Affichage des manuels scolaires
- GET : localhost:8080/api/rest/client/displayTextbook
- *token à renseigner*


- Suppression de manuels scolaires: 
- DEL : localhost:8080/api/rest/administrator/deleteTextbook
*token à renseigner*

{
"isbn": "333333333333"
}


################################################
## CLIENT : 

## Security : 1 Bis - S'enregistrer - Client  :
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

### Security : S'authentifier :
- POST : localhost:8080/api/rest/security/authenticate
  {
  "login": "pi",
  "password": "pi"
  *tokenClient à renseigner*
  }



### Catalog → Accéder au catalogue des manuels dispos et commencer à enregistrer une commande :

- Affichage des manuels scolaires seulement disponibles
- GET : localhost:8080/api/rest/catalog/displayTextbooks

- POST : localhost:8080/api/rest/catalog/addOrder
{
  "priceOrder": 5555,
  "numberOrder": "111111",
  "pickUpCodeOrder": "22222222",
  "statusOrder": "EN_COURS",
  "reasonCancellationOrder": "REASON_CANCELLATION_ORDER_1"
}

- POST : localhost:8080/api/rest/catalog/
