FROM openjdk:8
EXPOSE 8080
ADD target/ipl-dashboard-0.0.1-SNAPSHOT.jar ipl-dashboard-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ipl-dashboard-0.0.1-SNAPSHOT.jar"]