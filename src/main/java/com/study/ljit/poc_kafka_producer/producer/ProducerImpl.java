package com.study.ljit.poc_kafka_producer.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;
import java.util.logging.Logger;

public class ProducerImpl implements Producer {

    @Override
    public void sendMessage(String topicName, String key, String message) {
        ProducerRecord<String, String> producerRecord =
                new ProducerRecord<>(topicName, key,message);

        getKafkaProducer().send(producerRecord);
        Logger.getLogger("Message sent");
    }

    private KafkaProducer<String, String> getKafkaProducer() {
        Properties properties = new Properties();
        return new KafkaProducer<>(properties);
    }

}
