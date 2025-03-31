## PROJET CDA - APPLICATION ALAPAGE
## ENDPOINTS
Starts by: /api/rest


## Security : 1 - Authentification - ADMIN ET CLIENT : 
/!\ CHANGER LES PARAMS A METTRE DANS LE JSON ET REGISTRATION SITE DTo

/api/rest/security/register 

- POST: Creation credentials Admin  :
{
"lastNameUser": "Doe",
"email": "djokdz",
"surnameUser": "John",
"login": "johndoe123",
"password": "MotDePasse123!",
"roleName": "ADMINISTRATOR"
}

- POST: Creation credentials Client :
{
"lastNameUser": "Doe",
"email": "djokdz",
"surnameUser": "John",
"login": "johndoe123",
"password": "MotDePasse123!",
"roleName": "CLIENT"
}



## ORDER GESTION FOR THE ADMIN :

- POST: Creation credentials Client :


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