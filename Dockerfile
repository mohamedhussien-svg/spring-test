FROM maven:3.9.9-eclipse-temurin-21 AS builder

WORKDIR app

copy ./src ./src

copy ./pom.xml ./pom.xml

RUN mvn clean install

RUN mvn clean package spring-boot:repackage

FROM eclipse-temurin:21-jre-alpine AS runner

WORKDIR app

COPY --from=builder /app/target/spring-test-1.0.0.jar ./

RUN ls -l

EXPOSE 8080

CMD ["java","-jar","spring-test-1.0.0.jar"]
