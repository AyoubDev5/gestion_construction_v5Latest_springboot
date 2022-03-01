FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR target/spring-boot-postgres-docker-0.0.1-SNAPSHOT.jar app.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]