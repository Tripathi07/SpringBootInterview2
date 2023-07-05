# SpringBootInterview2

## Task
1. Implement delete endpoint
2. We have got a new requirement that user should have city as well. But it is not a mandatory field .
3. While creating a new user, I want "name" to be a mandatory parameter. If it is not passed, it should throw Bad_request error.


## Endpoints
### GET /users

Response

```
[
    {
        "id": "string",
        "name": "string",
        "birthDate": "string"
    },
    {
        "id": "string",
        "name": "string",
        "birthDate": "string"
    },
]
```


### POST /users
Creates a new user and adds to the List
#### Request:
```
{  
"name": "Minto",  
"birthDate": "1995-02-28T18:19:11.300192"  
}  
```
### PUT localhost:8080/users/{id}
Updates full user using PUT for the user Id passed in Path Variable
#### Request:
```
{  
"name": "Jonathen",  
"birthDate": "1995-02-28T18:19:11.300192"  
}  
```
### PATCH localhost:8080/users/{id}
Updates partial user using Patch for the user Id passed in Path Variable
#### Request:
```
{  
"name": "Timothy"  
}  
``` 