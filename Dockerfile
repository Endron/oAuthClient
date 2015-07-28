FROM java:8

ADD ./build/libs/oAuthClient*.jar /app.jar

EXPOSE 8080

CMD ["java", "-jar", "-Djava.security.egd=file:/dev/urandom", "-Xmx256m", "/app.jar"]
