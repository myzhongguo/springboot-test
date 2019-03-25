FROM store/oracle/serverjre:8
ADD /home/jenkins/workspace/test/target/springboot-helloworld-0.0.1-SNAPSHOT.jar /opt/
EXPOSE 8080
CMD ["java", "-jar", "/opt/springboot-helloworld-0.0.1-SNAPSHOT.jar"]
