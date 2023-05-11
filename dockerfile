FROM amazoncorretto:11-alpine-jdk
MAINTAINER JRGN
COPY E:/Documents/Cursos/Argentina Programa/Proyecto/Backend/jrgn/target/jrgn-0.0.1-SNAPSHOT jrgn-app.jar
ENTRYPOINT ["java","-jar","/jrgn-app.jar"]