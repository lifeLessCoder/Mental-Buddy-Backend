package com.mental.buddy.config

import com.typesafe.config.ConfigFactory

object AppConfig {
    lateinit var env: String
    var port: Int = 8080 // Default port

    fun init(env: String) {
        this.env = env
        val config = ConfigFactory.load("application-${this.env}.conf")
        this.port = config.getConfig("ktor.deployment").getInt("port")
    }

}