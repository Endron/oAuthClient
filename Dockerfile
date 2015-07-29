FROM java:8

RUN groupadd -r java && useradd -r -g java java

ADD ./build/libs/oAuthClient*.jar /app.jar

EXPOSE 8080

USER java

CMD ["java", "-Djava.security.egd=file:/dev/urandom", "-Xmx256m", "-jar", "/app.jar"]
