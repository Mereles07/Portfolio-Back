FROM openjdk:17-oracle
MAINTAINER Orlando
COPY target/proyecto_integrador-0.0.1-SNAPSHOT.jar portfolio-app.jar
ENTRYPOINT ["java", "-jar", "/portfolio-app.jar"]

