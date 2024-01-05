FROM openjdk:11.0
COPY target/my-calculator.jar my-calculator.jar
CMD java -jar my-calculator.jar
