# demo-rest-api
Technical assignment:
## Installation
To use this repository, you need to download it and execute statement in src/main/resources/database/initDB.sql to create a table.

Usage       
This application has multiple entry points:       

--------------GET /clients/{id} - returns client by id.
--------------GET /clients/mail/{mail} - returns boclientsoks by mail..
--------------GET /clients/number/{number} - returns clients by phone number.
--------------GET /clients/firstname/{firstname} - search client by name.
--------------GET /clients/firstname/{firstname}/lastname/{lastname} - returns clients by firstname and lastname.
--------------POST /clients - create client.
--------------DELETE /clients/{id} - delete client by id.
--------------PUT /clients/{id} - update client by id.
