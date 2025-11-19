# Etapa 1 — Build da aplicação
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# Copiar todo o código
COPY . .

# Build do projeto (gera o .jar)
RUN mvn clean package -DskipTests

# Etapa 2 — Executar o JAR
FROM eclipse-temurin:21-jdk
WORKDIR /app

# Copia o .jar gerado na etapa build
COPY --from=build /app/target/*.jar app.jar

# Porta exposta
EXPOSE 8080

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
