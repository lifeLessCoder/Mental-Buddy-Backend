# Ktor gRPC Microservice Example

This project is a simple Kotlin microservice using Ktor and gRPC. It exposes a single gRPC procedure that returns a hardcoded string.

## How to Build and Run

1. Make sure you have Java 17+ and Maven installed.
2. Generate gRPC and protobuf sources:
   ```sh
   mvn compile
   ```
3. Run the application:
   ```sh
   mvn exec:java -Dexec.mainClass="com.example.ApplicationKt"
   ```

## gRPC Service
- Service: `HelloService`
- Method: `SayHello` (returns a hardcoded string)

## Proto Definition
See `src/main/proto/hello.proto`.
