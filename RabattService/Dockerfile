FROM openjdk:11-jre-slim
LABEL authors="finkm"

WORKDIR /app

COPY target/travel-service.jar /app/travel-service.jar

ENV CLASSPATH=/app/classes:/app/lib/*

CMD ["java", "-cp", "$CLASSPATH", "travelservice.discountservice.RabattServiceApplication"]

ENTRYPOINT ["top", "-b"]