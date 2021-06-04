package com.microservices.demo.kafka.admin.exception;

/**
 * Exception class for Kafka Client Error
 */
public class KafkaClientException extends RuntimeException{

    public KafkaClientException() {
    }

    public KafkaClientException(String message) {
        super(message);
    }

    public KafkaClientException(String message, Throwable cause) {
        super(message, cause);
    }
}
