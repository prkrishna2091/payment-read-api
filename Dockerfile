FROM openjdk:17-oracle

MAINTAINER Ashok <ashokitschool@gmail.com>

COPY target/payment-read-api-0.0.1-SNAPSHOT.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 9091

ENTRYPOINT ["java", "-jar", "payment-read-api-0.0.1-SNAPSHOT.jar"]
