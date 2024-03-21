FROM maven:3.9.6-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-jre-slim
COPY --from=build /target/quizzzz-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
EXPOSE 9090
ENTRYPOINT ["java","-jar","demo.jar"]
