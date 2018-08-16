FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD spring-boot-prac-1.0-SNAPSHOT.jar app.jar
#RUN bash -c 'touch /app.jar'
RUN echo "Asia/Shanghai" > /etc/timezone;
#ENTRYPOINT ["mvn", "java", "$JAVA_OPTS", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
ENTRYPOINT  exec  java $JAVA_OPTS  -Djava.security.egd=file:/dev/./urandom -jar /app.jar