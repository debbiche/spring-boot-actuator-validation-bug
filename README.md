# spring-boot-actuator-validation-bug

Creating a custom actuator using @RestControllerEndpoint and adding validation logic to it seems to be broken:

Issues I have encountered:

1. Adding @Validated to the class causes it to not be exposed anymore. All rest calls return 404. Using the annotation
on a method level seems to work.

2. Validating a path parameter with for instance @Size does not work. Not sure if this is because of my set up or due to a bug
