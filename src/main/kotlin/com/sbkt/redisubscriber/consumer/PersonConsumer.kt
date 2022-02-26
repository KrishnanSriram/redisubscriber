package com.sbkt.redisubscriber.consumer

import com.fasterxml.jackson.databind.ObjectMapper
import com.sbkt.redisubscriber.model.Person
import org.slf4j.LoggerFactory
import org.springframework.data.redis.connection.Message
import org.springframework.data.redis.connection.MessageListener
import org.springframework.stereotype.Component

@Component
class PersonConsumer: MessageListener{
    companion object {
        val logger = LoggerFactory.getLogger(PersonConsumer::class.java)
        val objectMapper = ObjectMapper()
    }

    override fun onMessage(message: Message, pattern: ByteArray?) {
        logger.info("Received message")
        val person: Person = objectMapper.readValue(message.toString(), Person::class.java)
        logger.info("Received Person - ${person}")
    }

}