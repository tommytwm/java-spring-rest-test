# java-spring-rest-test

## Dependencies:
1. Maven 4.0.0
2. Java Development Kit 8 or higher
3. Spring 2.2.6

## How to run:
On Terminal, make sure the root is **/app**, then enter the following:
```
./mvnw spring-boot:run
 ```
Running this should host your Spring Boot application on your local host port. **For example: http://localhost:8080/**
Enter **http://localhost:{0000}/reverse/{string}** on your browser - replace **{0000}** with your local host port and **{string}** with the desired string to reverse.

The output should be a json representation of the reversed string. For example, given the URI: **http://localhost:{0000}/reverse/reverse**, it should output:
```
content: esrever
```

### Development Process:
I started by creating an empty Maven project on VSCode by making use of the extension in VSCode marketplace and pushing that
as an initial commit on my Github repo. After taking some cues from MVC (Model-View-Controller) design principles, I decided to start by making a model to store a string field, and a method to handle reversal of a string input. After that, I construced a controller that maps endpoints to the method(s) that call the model.

After implementation, I wrote some unit tests to ensure that core functionality works, as well as checking if the implementation was able to handle some edge cases, like if the input was simply integers, or if it had whitespace. This ensures that should this spring boot application be expanded, we will be able to detect if core functionality has been broken.

### TASK:

Implement a ReST API using Java and Spring Boot which has the following contract:
GET /reverse/<string> returns <string> reversed.

e.g. /reverse/orangepeel, returns leepegnaro

The code should be structured and built as a Maven project along with appropriate documentation and unit tests.

### Deliverables:
 • Complete Maven project.
 • A short explanation of your thought process – challenges, design choices.
 • Documentation where necessary.

If you have any questions or require clarification, please do not hesitate to reach out at any point.

### Submission:
Please provide a github repository link, or submit files directly to mateo@3dque.com