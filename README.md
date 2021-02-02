# Spring-demo-HelloWorld

## Description

In this Demo we will configure Spring Framework in Visual Studio Code and we will run a simple Hello World application. 

### Requirements

- [Visual Studio Code](https://code.visualstudio.com/Download)

### Extensions

- Spring Boot Extension Pack. That pack includes all the extensions you need.

![SpringPack](/images/spring-pack.png)


### Create a project

Once you have the Extension pack installed you can proceed. 

1. Click ```Ctrl + p```
1. Type ```>Spring Initializr: Create a Maven Project...``` Enter

- Maven is our library manager. It has all the packages we need. In this way we don't need to download all the dependencies and add them manually.

![initializer](images/initialize.png)

3. Specify Spring Boot version. I chose ```2.4.2``` Enter
1. Specify project language. ```Java``` Enter
1. Input group id for your project. I choose the default for the demo
1. Input Artifact Id for your project. I choose the default for the demo
1. Specify packaging type. ```JAR```
1. Specify Java version. I chose ```11``` for this demo
1. Search for dependencies. Add the highlighted. For this demo we don't need more dependencies. But, for authentication or other functions we need to add more.

![Dependencies](images/dependencies.png)

 After you hit enter it will ask you to generate the project in the folder you are in. Generate it in any folder you like.


