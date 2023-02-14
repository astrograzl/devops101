FROM eclipse-temurin:8-jre-alpine
WORKDIR /devops101
COPY ./build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]