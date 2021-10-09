# to run
```
mvmw spring-boot:run
```

# key code

## pom.xml
dependencies
- camel-spring-boot-starter (to add camel core)
- camel-spring-boot-bom (to resolve potential dependency conflict)
- camel-quartz-starter (to introduce quartz component)

camel.version
- the proper Camel version to use can be found through spring initializr

## DemoRoute.java
The class for Camel router

## src\main\resources\application.properties
```
camel.springboot.main-run-controller = true
```
MAKING SURE CAMEL CONTEXT IS RUNNING IN STANDALONE SPRING BOOT