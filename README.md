# soap-rest-exercise
Soap Consumer and Rest Producer for Peiky ws.

### Database  

To open database console go to:
```
http://localhost:8080/h2-console/
```

Use jdbc:h2:mem:testdb as database url

### Server
To run server go to soap.rest folder and execute
```
mvn spring-boot:run
```

### Angular Client
To run angular client go to client folder and execute
```
npm install
npm start
```
Client will run on
```
http://localhost:4200
```

Routes include:

/all  ->  renders all three tables with information
/users  -> renders all user information
/creditcards  -> renders all creditcards information
/movements  -> renders all movements information
