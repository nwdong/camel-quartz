# Demo Camel Quartz with Spring Boot

# to run
Firstly, to open terminal and making sure JAVA_HOME is set to JDK11 firstly

Then run below command in terminal
```
mvmw spring-boot:run
```


# key code

## pom.xml
dependencies
- camel-spring-boot-bom (to introduce Camel BOM)
- camel-spring-boot-starter (to add Camel core)
- camel-quartz-starter (to add Camel quartz component)

camel.version
- the proper Camel version to use can be found through spring initializr

## DemoRoute.java
The demo class for Camel quartz route

## src\main\resources\application.properties
```
# MAKING SURE CAMEL CONTEXT IS RUNNING IN STANDALONE SPRING BOOT
camel.springboot.main-run-controller = true
```