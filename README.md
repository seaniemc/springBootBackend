# springBootBackend
This is the back-end of practice web site which incorporates Angular2, Spring boot, MySql and JSON web Tokens

## Prerequisites 
#### Must have [***mysql***](https://dev.mysql.com/downloads/) installed.  

The application uses a db called *lagon* set in the application properties of the resource folder.   

    spring.datasource.url = jdbc:mysql://localhost:3307/lagoon
You can change this suit your own needs and likes.

## How to run

 - Start mysql sever.
 - Open up a console window. 
 - Navigate to project folder.
 - Run the following command.
 

     mvn spring-boot:run
## API  

The application can be tested using  [post man.](https://www.getpostman.com/apps) I have also completed [a Angular 2 webapp](https://github.com/seaniemc/angular2frontend), when ran will call API endpoints returning or posting necessary data. 

#### Register

    http://localhost:8080/user/register

#### Get user by name

    http://localhost:8080/rest/user/userName

#### Send Credential Login

    http://localhost:8080/user/login

#### Update user
    http://localhost:8080/rest/user/update
#### Upload photo

    http://localhost:8080/rest/photo/upload
#### Get all photos

    http://localhost:8080/photo/allPhotos
#### Get photo by ID

    http://localhost:8080/rest/photo/photoId
#### Get Photos By User

    http://localhost:8080/rest/photo/user
#### Update Photo

    http://localhost:8080/rest/photo/update
#### Send Photo

    http://localhost:8080/rest/photo/add

#### Add comment 

    http://localhost:8080/rest/comment/add
