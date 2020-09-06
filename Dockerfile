FROM openjdk:8-jdk-alpine
COPY build/libs/*.jar app.jar
RUN chmod 775 app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]