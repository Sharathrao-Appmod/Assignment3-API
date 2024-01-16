#Program Demonstrate Create, UPDATE, DELETE, PUT, POST,GET method using spring boot,

GET : http://localhost:8080/api/v1/employees

RequestBody: 



ResponseBody: 

      [
    {
        "id": 4,
        "name": "Mark",
        "age": 25,
        "address": "Rich-Mond                                         ",
        "salary": 65000
    },
    {
        "id": 10,
        "name": "Abhishek",
        "age": 26,
        "address": "Udupi                                             ",
        "salary": 0
    },
    {
        "id": 3,
        "name": "Chethan",
        "age": 32,
        "address": "California                                        ",
        "salary": 15000
    },
    {
        "id": 11,
        "name": "Abhishek",
        "age": 26,
        "address": "Udupi                                             ",
        "salary": 0
    }
]

GET :http://localhost:8080/api/v1/employees/4

RequestBody: 


ResponseBody: 

{
    "id": 4,
    "name": "Mark",
    "age": 25,
    "address": "Rich-Mond                                         ",
    "salary": 65000
}


POST: http://localhost:8080/api/v1/employees
RequestBody: 

{
    "id": "12",
    "name": "Abhishek",
    "age": 26,
    "address": "Udupi",
    "salary": "00000"
}

ResponseBody: 
  [
    {
        "statusCode": "200",
        "statusMessage": "Record Inserted",
        "errorDescription": null
    }
  ]
  
  
 PUT:  http://localhost:8080/api/v1/employees/12
 
 RequestBody: 
 
 {
    "name": "Chethan",
    "age": "32",
    "address": "California                                        ",
    "salary": "46000"
}

ResponseBody: 

[
    {
        "statusCode": "200",
        "statusMessage": "UPDATED",
        "errorDescription": null
    }
]


DELETE: http://localhost:8080/api/v1/employees/12

RequestBody: 
{
    "id" : "12"
}

ResponseBody: 

{
    "DELETED": true
}



            
