FROM amazoncorretto:8
MAINTAINER JRGN
COPY target/jrgn-0.0.1-SNAPSHOT jrgn-app.jar
ENTRYPOINT ["java","-jar","/jrgn-app.jar"]