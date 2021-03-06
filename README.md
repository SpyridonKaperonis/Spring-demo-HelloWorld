# Spring-demo-HelloWorld

## Description

In this Demo we will configure Spring Framework in Visual Studio Code and we will run a simple Hello World application.

### Requirements

- [Visual Studio Code](https://code.visualstudio.com/Download)

### Extensions

- Spring Boot Tools

![SpringBoot](springbootTools.jpg)

- Spring Initializr Java Support

![SpringInit](springInitSupport.jpg)

- Spring Boot Dashboard

![SpringDashboard](springbootDashboard.jpg)

## Create a project

Once you have the Extension pack installed you can proceed. 

1. Click ```Ctrl + p```
1. Type ```>Spring Initializr: Create a Maven Project...``` Enter

- Maven is our library manager. It has all the packages we need. In this way we don't need to download all the dependencies and add them manually.

![initializer](initialize.jpg)

3. Specify Spring Boot version. I chose ```2.4.2``` Enter
1. Specify project language. ```Java``` Enter
1. Input group id for your project. I choose the default for the demo
1. Input Artifact Id for your project. I choose the default for the demo
1. Specify packaging type. ```JAR```
1. Specify Java version. I chose ```11``` for this demo
1. Search for dependencies. Add the highlighted. For this demo we don't need more dependencies. But, for authentication or other functions we need to add more.

![Dependencies](dependencies.jpg)

 After you hit enter it will ask you to generate the project in the folder you are in. Generate it in any folder you like.

![Generate](generate.jpg)

#
## Hello World

Your demo project will look something like this

![Demo](helloW.jpg)

- Go to src/main/java
    - You will find the ```DemoApplication.java```
- Create a new file called  ```DemoController.java```

- Add these lines of code in DemoController.java  

```
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DemoController {

    @RequestMapping( value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld(){
        return "Hello World!";
    }
}

```

- Add another method in DemoController.java if you want to play with directories

```
    @RequestMapping( value = "/news", method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld(){
        return "";
    }

```

- Run your project with ```Spring boot dashboard``` which is located in the bottom left of the window.

![SpringDashboard](runspringDash.jpg)

#

- Click open in Browser

![Openinbrowser](clickOpen.jpg)


### Browser

![Browser](main.jpg)

![login](login.jpg)