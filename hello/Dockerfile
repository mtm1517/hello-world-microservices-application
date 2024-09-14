FROM maven AS build

WORKDIR /app/
ADD target/hello-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]