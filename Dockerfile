# syntax=docker/dockerfile:1
FROM openjdk:11
WORKDIR /app
COPY build/libs/*.jar ./application.jar
CMD ["java", "./application.jar"]