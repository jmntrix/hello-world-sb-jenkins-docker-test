#!/usr/bin/env sh

java -Djava.net.preferIPv4Stack=true -Djava.security.egd=file:/dev/./urandom -jar /app/hello-world-0.0.1-SNAPSHOT.jar
