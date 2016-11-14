FROM java:8

RUN mkdir /poc-application-deployment
ADD /target/hc-analytics-aws-autoscaling-poc-1.0-SNAPSHOT.jar ./poc-application-deployment/hc-analytics-aws-autoscaling-poc-1.0-SNAPSHOT.jar
CMD ["java", "-jar", "poc-application-deployment/hc-analytics-aws-autoscaling-poc-1.0-SNAPSHOT.jar"]

EXPOSE 8080