#FROM eclipse-temurin:17-jdk AS build
#WORKDIR /app
#COPY . /app
#RUN mvn package -DskipTests

FROM eclipse-temurin:17-jre
WORKDIR /work
COPY --from=build /app/target/*-runner.jar app.jar
ENTRYPOINT ["java","-jar","/work/app.jar"]
