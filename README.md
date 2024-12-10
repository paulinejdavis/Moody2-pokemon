# MoodyToo

<img width="90" alt="arrow" src="https://user-images.githubusercontent.com/19231569/213458967-d77d1ede-cbb8-4cda-8d58-7ac2a1c70503.png">

![pokeapi](https://github.com/user-attachments/assets/ac7ca92b-a4db-437f-b42c-a07c885872e7)


## Summary

A backend basic REST API skeleton in Java using Spring Boot provides endpoints (e.g., GET, POST, PUT, DELETE) 
to manage Pokémon data locally while leveraging the PokéAPI to fetch additional details, such as Pokémon types 
and stats. Using Moody entities, the application can extend functionality to calculate and track Pokémon names, 
skills  dynamically, integrating business logic to enhance local data with attributes like skill levels and 
mood-based performance metrics.

An HTTP client library, such as `RestTemplate` or `WebClient`, allows the application to communicate with external 
APIs by sending and processing HTTP requests seamlessly.


## How it works: 
### **Check in browser**

``
http://localhost:8080/pokemon/names
``


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


