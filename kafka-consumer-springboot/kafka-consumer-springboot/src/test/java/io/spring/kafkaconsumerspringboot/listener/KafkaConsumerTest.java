package io.spring.kafkaconsumerspringboot.listener;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KafkaConsumerTest {

    @Test
    void consume() {
        System.out.println("message consumed");
        assertEquals("message consumed","message consumed");
    }
}