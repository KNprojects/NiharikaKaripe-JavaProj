FROM openjdk:17

COPY target/MySpringBootApplication-0.0.1-SNAPSHOT.jar  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "MySpringBootApplication-0.0.1-SNAPSHOT.jar"]