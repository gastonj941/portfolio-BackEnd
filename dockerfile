FROM amazoncorretto:11-alpine-jdk
MAINTAINER JRGN
COPY target/jrgn-0.0.1-SNAPSHOT jrgn-app.jar
ENTRYPOINT ["java","-jar","/jrgn-app.jar"]