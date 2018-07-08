FROM java:8-jre

USER root

ADD ./target/payments-0.1-SNAPSHOT.jar /opt/payments-0.1-SNAPSHOT.jar
CMD ["java", "-Xmx200m", "-jar", "/opt/payments-0.1-SNAPSHOT.jar"]

EXPOSE 8080

