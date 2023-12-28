package com.islandparadise14.mintlab

import com.islandparadise14.mintlab.configure.configureRouting
import com.islandparadise14.mintlab.configure.configureSerialization
import io.ktor.server.application.Application
import io.ktor.server.netty.EngineMain

/** resources/application.conf 필요 */
fun main(args: Array<String>): Unit = EngineMain.main(args)

fun Application.module() {
    configureRouting()
    configureSerialization()
}
