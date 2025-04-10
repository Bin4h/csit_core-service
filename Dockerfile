FROM openjdk:17-jdk-slim
COPY ./target/core-service-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8082
CMD ["java", "-jar", "/app.jar"]