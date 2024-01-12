#Program Demonstrate Create, UPDATE, DELETE, PUT, POST,GET method using spring boot,

Method: GET
http://localhost:8080/api/v1/employees

Request body:

Response body:

[
{
        "id": 12,
        "name": "Rajesh",
        "age": 26,
        "address": "Udupi",
        "salary": 0
    },
    {
        "id": 4,
        "name": "Satyesh",
        "age": 25,
        "address": "Malpe",
        "salary": 65000
    },
    {
        "id": 3,
        "name": "Harish",
        "age": 32,
        "address": "Manipal",
        "salary": 15000
    },
    {
        "id": 11,
        "name": "Raj",
        "age": 28,
        "address": "Kodibengre",
        "salary": 0
    }
]

![Screenshot from 2024-01-11 00-48-29](https://github.com/Sharathrao-Appmod/Assignment3-API/assets/155999647/23d78592-937e-4508-afee-d3365a583f1f)



Method: GET
http://localhost:8080/api/v1/employees/4

Request Body: 


Response Body:
{
    "id": 4,
    "name": "Satyesh",
    "age": 25,
    "address": "Malpe",
    "salary": 65000
}

![Screenshot from 2024-01-11 01-04-22](https://github.com/Sharathrao-Appmod/Assignment3-API/assets/155999647/639ff1ec-50e9-4c69-b32d-eb4d9b54340f)


Method: POST
http://localhost:8080/api/v1/employees

Request Body: 
{
    "id": "18",
    "name": "Rudresh",
    "age": 28,
    "address": "Udupi",
    "salary": "45000"
}

Response Body:
[
    {
        "statusCode": "200",
        "statusMessage": "Record Inserted",
        "errorDescription": null
    }
]

![Screenshot from 2024-01-11 00-33-42](https://github.com/Sharathrao-Appmod/Assignment3-API/assets/155999647/4fa169f2-f0a7-4158-93e4-12031f3e5761)

  
Method: PUT
http://localhost:8080/api/v1/employees/3

Request Body:
 
{
    "id": 3,
    "name": "Hardeep",
    "age": 33,
    "address": "Punjab",
    "salary": 35000
}

Response Body:
[
    {
        "statusCode": "200",
        "statusMessage": "UPDATED",
        "errorDescription": null
    }
]


![Screenshot from 2024-01-11 01-21-37](https://github.com/Sharathrao-Appmod/Assignment3-API/assets/155999647/cf3e9d09-0abc-483b-aad6-56ff31188cd2)


Method: DELETE
http://localhost:8080/api/v1/employees/11

Request Body:
 
{
    "id": 11
}

Response Body:
{
    "DELETED": true
}

![Screenshot from 2024-01-11 01-29-59](https://github.com/Sharathrao-Appmod/Assignment3-API/assets/155999647/267c4d67-1795-470c-b9cd-ad0d77439c0a)




            
