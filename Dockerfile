FROM openjdk:11-jre-slim

COPY build/libs/java-docker-run.jar /app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
