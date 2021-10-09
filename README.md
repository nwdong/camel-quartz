# to run
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
The class for Camel router

## src\main\resources\application.properties
```
# MAKING SURE CAMEL CONTEXT IS RUNNING IN STANDALONE SPRING BOOT
camel.springboot.main-run-controller = true
```