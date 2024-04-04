FROM maven:3.8.4-amazoncorretto-17 as build
WORKDIR /app
COPY . .
RUN mvn clean package -X -DskipTests

FROM openjdk:17-ea-10-jdk-slim
WORKDIR /app
COPY --from=build ./app/target/*.jar ./intelligentcare.jar

ENTRYPOINT java -jar intelligentcare.jar
