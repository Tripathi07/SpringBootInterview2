# SpringBootInterview2

### 1. Implement delete endpoint
### 2. We have got a new requirement that user should have city as well. But it is not a mandatory field and APIs should be backward compatible.
### 3. While creating a new user, I want "name" to be a mandatory parameter. If it is not passed, it should throw Bad_request error. How can we do changes in existing API version? If we want to make a new API version so that old api consumers are not impacted, how would we implement it?


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
