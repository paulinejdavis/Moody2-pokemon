# MoodyToo

<img width="90" alt="arrow" src="https://user-images.githubusercontent.com/19231569/213458967-d77d1ede-cbb8-4cda-8d58-7ac2a1c70503.png">

![pokeapi](https://github.com/user-attachments/assets/ac7ca92b-a4db-437f-b42c-a07c885872e7)


## Summary

This project provides a basic `REST API` skeleton built using `Java` and `Spring Boot`. It integrates with the 
`PokéAPI` provides to fetch detailed Pokémon data such as types and stats. Locally, the application begins with a 
static dataset
containing only Pokemon names. The plan is to enhance the skeleton by introducing a risk/skills
assessment mechanism to calculate and track Pokemon characters attributes dynamically, such as skill levels and 
performance metrics. 

To facilitate communications with external APIs, the project uses  HTTP client libraries like `RestTemplate` or 
`WebClient`, enabling processing of API requests (e.g., GET, POST, PUT, DELETE) 



## How it works: 
### **Check in browser**

```
http://localhost:8080
```

```
http://localhost:8080/actuator/health
```

```
http://localhost:8080/pokemon/names
```


### **Running in Curl**:

```
 curl -X GET "http://localhost:8080/api/pokemon/local
```

```
 curl -X POST -H "Content-Type: application/json" -d '{"name": "Pikachu"}' http://localhost:8080/api/pokemon
```

```
 curl -X DELETE "http://localhost:8080/api/pokemon/Pikachu"
```

```
curl -X GET "http://localhost:8080/api/pokemon/names?limit=10" -H "Content-Type: application/json"
```
### **Running in Postman**:

#### Summary of Postman Requests:
```

Check Local Storage: GET http://localhost:8080/api/pokemon/local
Add a Pokémon: POST http://localhost:8080/api/pokemon with body:
{
"name": "Pikachu"
}
Check Added Pokémon: GET http://localhost:8080/api/pokemon/local
Delete a Pokémon: DELETE http://localhost:8080/api/pokemon/Pikachu
Check After Deletion: GET http://localhost:8080/api/pokemon/local

```

#### Next steps - improvements:

ResponseEntity - for consistency in responses and error handling `404 not found or 400 bad request` - 
using response entity `https://www.baeldung.com/spring-response-entity`
ResponseEntity - for consistency in responses

Testing validation `PokemonName` ensure data is valid prior to processing 
`https://www.baeldung.com/spring-boot-bean-validation`

Extend the Pokemon Entity - skill level `https://spring.io/guides/tutorials/rest/`

Update local storage to accommodate skill level `https://spring.io/guides/tutorials/rest/`

Test Coverage - tests for endpoints covering successful operations, missing Pokémon and 
invalid input baeldung.com/spring-boot-testing

### Useful commands

to check what servers are running `lsof -i :8080`

to kill a server `kill -9 {PID NUMBER}`


