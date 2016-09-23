package kgorski.kafka.producer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

/**
 * Kafka message Producer.
 * 
 * @author kgorski
 */
public class KafkaMsgProducer
{
    /**
     * Application entry point.
     * 
     * @param args the application arguments
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException
    {
        // Settings
        String topic = "example.topic";
        String key = "example.key";
        String message = "{\"example\":\"json message\"}";

        // Get Kafka configuration
        Properties kafkaProperties = new Properties();
        FileInputStream file = new FileInputStream(args[0]);
        kafkaProperties.load(file);
        file.close();

        // Create Kafka producer
        Producer<String, String> producer = new KafkaProducer<>(kafkaProperties);

        // Publish message
        producer.send(new ProducerRecord<String, String>(topic, key, message));
        System.out.printf("Message published '%s' messsage to '%s' topic with '%s' key\n", message, topic, key);

        // Close producer
        producer.close();
    }
}
