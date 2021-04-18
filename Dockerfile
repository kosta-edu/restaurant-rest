FROM gradle:6.8.3-jdk8 as builder
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
ENV GRADLE_USER_HOME=~/.gradle
RUN gradle build

FROM openjdk:8-jre-alpine
COPY --from=builder /home/gradle/src/build/libs/*.jar /app.jar
ENV PORT 8080
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-Dserver.port=${PORT}","-jar","/app.jar"]