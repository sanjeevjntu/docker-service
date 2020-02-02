FROM openjdk:11
ADD build/libs/docker-service.jar docker-service.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "docker-service.jar"]