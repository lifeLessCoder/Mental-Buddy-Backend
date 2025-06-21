package com.mental.buddy.grpc

import io.grpc.stub.StreamObserver

class HelloServiceImpl : HelloServiceGrpc.HelloServiceImplBase() {
    override fun sayHello(request: HelloRequest, responseObserver: StreamObserver<HelloReply>) {
        val reply = HelloReply.newBuilder()
            .setMessage("Hello ${request.name} from Ktor gRPC microservice!")
            .build()
        responseObserver.onNext(reply)
        responseObserver.onCompleted()
    }
}
