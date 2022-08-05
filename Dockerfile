FROM openjdk:8-jdk-alpine
COPY target/Jar-CICD-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]



#FROM openjdk:16-alpine3.13
#
#WORKDIR /app
#
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:go-offline
#COPY src ./src
#EXPOSE 8080
#CMD ["./mvnw", "spring-boot:run"]