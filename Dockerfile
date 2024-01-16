FROM openjdk:8
COPY target/docker-demo.jar.jar docker-demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","./docker-demo.jar"]