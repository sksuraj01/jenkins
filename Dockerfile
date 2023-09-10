FROM openjdk:17

EXPOSE 8080
 
COPY target/jenkins-git-maven.jar jenkins-git-maven.jar

ENTRYPOINT ["java","-jar", "jenkins-git-maven.jar"]