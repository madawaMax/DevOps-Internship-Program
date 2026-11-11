FROM eclipse-temurin:21-jre
WORKDIR /app

# Copy executable JAR into container
COPY target/employee-management-api-0.0.1-SNAPSHOT.jar app.jar

# Application port
EXPOSE 8080

# Start Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]