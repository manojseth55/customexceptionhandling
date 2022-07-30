# CustomExceptionHandling

# CustomExceptionHandling Example of Spring-Boot-REST-API (User)


### 1. You can clone it from github by running following command 

```

$ git clone https://github.com/manojseth55/customexceptionhandling.git

```

### 2. Import project into eclipse

```

  File -> Import -> Maven -> Existing Maven Projects -> Browse Project from cloned location
  
```

### 3. Right click on project in eclipse and then Maven -> Update Projects

### 4. Right click on CustomexceptionhandlingApplication.java file and run as Java Application

Once Sprint Boot Application will be started successfully then we
can call following Endpoints by using POSTMAN


### 5. To get list of users call following endpoint with GET Request

```

  http://localhost:8080/users
  
```
  
  
  you will get the following output
  
  ```
  
  [
    {
        "id": 1,
        "name": "Jhon",
        "dateOfBirth": "2022-07-30T17:19:19.570+00:00"
    },
    {
        "id": 2,
        "name": "James",
        "dateOfBirth": "2022-07-30T17:19:19.570+00:00"
    }
]

```
  

### 6. To Create New User use following url with POST Request

```

  http://localhost:8080/users
  
```
  
####  set content type as in header as application/json

#### set request body as raw with JSON payload


  
  ```
  
    {
        "name": "Mathew",
        "dateOfBirth": "2022-07-30T17:19:19.570+00:00"
    }

```
  
  
### 7. To get a particular user details, use following url with GET request type in postman

```

  http://localhost:8080/users/<id>
  
```
  
  For Example, you are searching for user id 1 user below endpoint url
  
  ```

  http://localhost:8080/users/1
  
```

#### For Example, If you are searching user that is not present then you will get below custom exception  
  
  
```
  
{
    "timestamp": "2022-07-30T17:46:47.368+00:00",
    "message": "user id - 10000 not found",
    "details": "uri=/users/10000"
}

```
  
