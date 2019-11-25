FROM java:8

VOLUME /tmp

ADD /target/*.jar /app.jar

EXPOSE 8103

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]