## PROJET CDA - APPLICATION ALAPAGE 

### 
- 
- 


## ENDPOINTS:
Starts by: /api/rest
## Authentification
1. Authenticate using user already registered in the system (DB)
/connection/authenticate
POST: send credentials
{
"email":"example@mail.mdr",
"password":"theSecretWord"
}
## User details
2.1 Register user in the system (DB)\
/user/registration\
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