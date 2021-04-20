FROM openjdk:11.0.8-jdk-slim AS builder
WORKDIR source
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} application.jar
RUN jar -xf ./application.jar

FROM openjdk:11.0.8-jre-slim
WORKDIR application
COPY --from=builder source/BOOT-INF/lib lib
COPY --from=builder source/META-INF app/META-INF
COPY --from=builder source//BOOT-INF/classes app

ENTRYPOINT ["java", "-cp", "app:lib/*", "edu.kosta.restaurant.RestaurantApplication"]