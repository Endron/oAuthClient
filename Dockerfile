FROM java:8

ADD build/distributions/oAuthClient.tar /
RUN chmod +x /oAuthClient/bin/oAuthClient

EXPOSE 8080

CMD ["/oAuthClient/bin/oAuthClient"]
