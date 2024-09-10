package com.study.ljit.poc_kafka_producer.producer;

public interface Producer {

    void sendMessage(String topicName, String key, String message);

}
