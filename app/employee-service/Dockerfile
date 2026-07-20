# ===============================
# Stage 1 - Build Application
# ===============================
FROM maven:3.9.11-eclipse-temurin-17 AS builder

WORKDIR /app

COPY app/employee-service/pom.xml .

RUN mvn dependency:go-offline

COPY app/employee-service/src ./src

RUN mvn clean package -DskipTests

# ===============================
# Stage 2 - Runtime
# ===============================
FROM eclipse-temurin:17-jre

LABEL maintainer="Nilesh Wanare"

WORKDIR /app

COPY --from=builder /app/target/*.jar employee-service.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","employee-service.jar"]