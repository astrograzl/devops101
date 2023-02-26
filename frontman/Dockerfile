FROM eclipse-temurin:8-jdk-alpine as builder
WORKDIR /building
COPY . .
RUN ["./gradlew", "bootJar"]
#ENTRYPOINT ["/bin/sh"]

FROM eclipse-temurin:8-jre-alpine
WORKDIR /devops101
COPY --from=builder /building/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]