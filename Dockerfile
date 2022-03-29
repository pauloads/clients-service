FROM openjdk:11
COPY target/clients-service-0.0.1-SNAPSHOT.jar /usr/src/clients-service/
WORKDIR /usr/src/clients-service
ENTRYPOINT ["java","-jar","clients-service-0.0.1-SNAPSHOT.jar"]