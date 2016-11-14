FROM java:8

RUN mkdir /poc-application-deployment
ADD ./poc-application-deployment/hc-analytics-aws-autoscaling-poc-1.0-SNAPSHOT.jar /target/hc-analytics-aws-autoscaling-poc-1.0-SNAPSHOT.jar
CMD ["java", "-jar", "hc-analytics-aws-autoscaling-poc-1.0-SNAPSHOT.jar"]

EXPOSE 8080