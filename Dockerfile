#FROM gradle:5 as build

#CMD ["./gradlew", "build"]

FROM artifactory.cd-tech26.de/docker/n26/openjdk-11:latest

COPY build/libs/app.jar /app.jar

#ENTRYPOINT ["java -jar app.jar"]

CMD ["run_jar", "app.jar"]
