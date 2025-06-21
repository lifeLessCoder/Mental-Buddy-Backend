package com.mental.buddy

import com.mental.buddy.config.AppConfig
import com.mental.buddy.grpc.HelloServiceImpl
import io.grpc.Server
import io.grpc.ServerBuilder

fun main(args: Array<String>) {
    AppConfig.init(if (args.isNotEmpty()) args[0] else "local")
    val server: Server = ServerBuilder.forPort(AppConfig.port)
        .addService(HelloServiceImpl())
        .build()
    println("gRPC server started on port ${AppConfig.port} (env: ${AppConfig.env})")
    server.start()
    server.awaitTermination()
}
