package com.mental.buddy

import com.mental.buddy.grpc.HelloServiceImpl
import io.grpc.Server
import io.grpc.ServerBuilder

fun main() {
    val server: Server = ServerBuilder.forPort(50051)
        .addService(HelloServiceImpl())
        .build()
    println("gRPC server started on port 50051")
    server.start()
    server.awaitTermination()
}
