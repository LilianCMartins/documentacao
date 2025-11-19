# Etapa 1 — Build da aplicação (Maven + Java 21)
FROM maven:3.9-amazoncorretto-21 AS build
WORKDIR /app

# Copia o código
COPY . .

# Compila e empacota o jar
RUN mvn clean package -DskipTests

# Etapa 2 — Runtime (imagem leve)
FROM amazoncorretto:21-alpine
WORKDIR /app

# Copia o jar gerado na etapa de build
COPY --from=build /app/target/*.jar app.jar

# Porta padrão Spring Boot
EXPOSE 8080

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
