FROM openjdk:17-alpine3.14

MAINTAINER Gid "gideon.watson@bbzbl-it.ch"

EXPOSE 7070

WORKDIR /usr/local/bin

COPY ./target/crm-web-maven-0.0.1-SNAPSHOT-shaded.jar webapp.jar


CMD ["java", "-jar", "webapp.jar"]
