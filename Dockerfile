FROM dannybastos/openjdk11
MAINTAINER Danny Bastos <danny.bastos.br@gmail.com>
WORKDIR /app
COPY . /app
RUN ./mvnw clean package && \
    mv /app/target/spring-boot*.jar /app/app.jar

ENTRYPOINT java -jar /app/app.jar

