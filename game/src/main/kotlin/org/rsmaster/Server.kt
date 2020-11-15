package org.rsmaster

/**
* The server logger.
*/
private val logger = mu.KotlinLogging.logger {}

/**
 * The main function for initializing the game server
 */
fun main() {
    var start = System.currentTimeMillis()

    try {
        val server = Server()
        server.start()
    } catch (e: Exception) {
        System.exit(0)
    }

    logger.info { "Startup took ${System.currentTimeMillis() - start}ms" }
}

class Server() {
    init { logger.info { "Starting up server..." } }

    /**
     * 
     */
    fun start() {
        //...
    }
}