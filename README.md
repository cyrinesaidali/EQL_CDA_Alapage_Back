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

### Security : 1 Bis - S'enregistrer - Client  :
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



## Catalog → Accéder au catalogue des manuels dispos et commencer à enregistrer une commande :
##Attention à bien veiller à mettre le bon token car la gestion des commandes sont dépendantes des tokens !!!

#### Affichage des manuels scolaires seulement disponibles
GET : localhost:8080/api/rest/catalog/displayTextbooks

#### Mise en place d'un ID commande + numéro → A placer par défaut lorsque le client commence la commande
POST : localhost:8080/api/rest/catalog/addOrder
{
  "priceOrder": 5555,
  "numberOrder": "111111",
  "pickUpCodeOrder": "22222222",
  "statusOrder": "EN_COURS",
  "reasonCancellationOrder": "REASON_CANCELLATION_ORDER_1"
}

#### Mise en place des lignes de commandes en fonction de la quantité de textbooks et des informations des textbooks rentrés 

POST : localhost:8080/api/rest/client/order/addTextbookToOrderline
Exemple utilisateur 1 :
[
{
"idTextbook": 1,
"priceTextbook": 3.99,
"titleTextbook": "Titre 5555555555555555",
"statusTextbook": "DISPONIBLE",
"isbn": "55555555555555",
"quantityTextbook":5
},
{
"idTextbook": 5,
"priceTextbook": 20.95,
"titleTextbook": "Titre 77777777777777777",
"statusTextbook": "DISPONIBLE",
"isbn": "77777777777777777",
"quantityTextbook":1
}
]

Exemple utilisateur 2 :

[
{
"idTextbook": 2,
"priceTextbook": 3.99,
"titleTextbook": "Titre 3333333333333",
"statusTextbook": "DISPONIBLE",
"isbn": "33333333333",
"quantityTextbook": 10
}
]