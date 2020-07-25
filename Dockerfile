FROM openjdk:14.0.2-slim-buster

ADD target/hello-world-0.0.1-SNAPSHOT.jar start.sh /app/

EXPOSE 8090

CMD ["/app/start.sh"]
