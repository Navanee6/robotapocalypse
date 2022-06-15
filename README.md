# robotapocalypse

Pre-requesites :

* check java installed in the system min version required is 1.8
* check mysql server and workbench is installed on the system
* Eclipse IDE to run the application
* Postman application to verify the api endpoints and to view the api documentation

Execution Procedures:

Step 1 :

* clone in to the github repo for robot apocalypse spring boot project and open it in your eclipse by importing the projects
* Navigate to "application.properties" file in the path "springBoot/src/main/resources/application.properties" to configure database settings.
Details to be confgured in application.properties file :

* spring.datasource.driver-class-name= com.mysql.jdbc.Driver
* spring.datasource.url= jdbc:mysql://localhost:3306/robot - kindly change it to your database url
* spring.datasource.username= root - Kindly give your username
* spring.datasource.password= root - kindly use your password
* spring.jsp.show-sql = true
* spring.jpa.ddl-auto = update
* spring.jpa.generate-ddl = true
* spring.jpa.hibernate.ddl-auto = create
* spring.jpa.properties.hibernate.dialect =org.hibernate.dialect.MYSQL5InnoDBDialect
* serve.port = 9090 - change port if you are using 9090 anywhere in you project

Step 2 :

To verify the api endpoints and for the end points details and description, kindly check the below api documentation url
URL : https://documenter.getpostman.com/view/21475317/UzBiPUBb

Kindly verify the results and incase of any queries kindly mail me @ blnavanee@gmail.com

**Note :** From the robot api url(https://robotstakeover20210903110417.azurewebsites.net/robotcpu) givn, I am unable to find the locations of the robots. Even from th json which I received there after also I could not find the location details in the given json and as per the information from the concerned person to complete the task till which part it can be done, I have done so far.
Hence I have taken infected flag as a input from the user and executed the project.


