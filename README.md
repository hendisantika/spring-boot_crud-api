# Spring Boot CRUD API

Registration

`$ curl http://localhost:8080/api/whisky -v -X POST -H "Content-Type:application/json" -d "{\"name\":\"laphroaig\", \"price\":3000}"`

Update

`$ curl http://localhost:8080/api/whisky/1 -v -X PUT -H "Content-Type:application/json" -d "{\"name\":\"JohnnieWalerRed\", \"price\":1500}"`

Delete

`$ curl http://localhost:8080/api/whisky/1 -v -X DELETE`

Reference (all cases)

`http://localhost:8080/api/whisky`

Referring to (a)

`http://localhost:8080/api/whiskies/1`
