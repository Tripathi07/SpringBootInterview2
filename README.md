# SpringBootInterview2
Interview questions
## Endpoint Supported by Project
### GET localhost:8080/users
Returns all users available in static List
### POST localhost:8080/users
Creates a new user and adds to the List
#### Example of Request Body:
{  
"name": "Minto",  
"birthDate": "1995-02-28T18:19:11.300192"  
}  
### PUT localhost:8080/users/{id}
Updates full user using PUT for the user Id passed in Path Variable
#### Example of request body:
{  
"name": "Jonathen",  
"birthDate": "1995-02-28T18:19:11.300192"  
}  
### PATCH localhost:8080/users/{id}
Updates partial user using Patch for the user Id passed in Path Variable
#### Example of request body:
{  
"name": "Timothy"  
}  
