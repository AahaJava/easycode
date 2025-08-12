# 1. Use an official Java runtime as a base image
FROM eclipse-temurin:17-jdk-alpine

# 2. Set working directory inside container
WORKDIR /first

# 3. Copy JAR file into container
COPY target/easytser-0.0.1-SNAPSHOT.jar app.jar

# 4. Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]