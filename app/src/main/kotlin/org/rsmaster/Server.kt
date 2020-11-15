package org.rsmaster

/**
* The server logger.
*/
private val logger = mu.KotlinLogging.logger {}

fun main() {
    val server = Server();
    server.start();
}

class Server() {
    fun start() {
        logger.info { "Starting up server..." }
    }
}