# Java Kafka Producer example

Simple Kafka Producer that publishes an example json message to given topic with given message key 

## System Requirements / Dependencies
* java 1.7+
* Kafka 0.9+

## Installation
### Checkout the repository

    git clone git@github.com:kgorski/java-kafka-producer.git

### Run maven package

    mvn package

## Setup
Copy config.properties.dist file into config.properties file and set Kafka ip and port:

    bootstrap.servers=localhost:9092

## Running

java -jar target\kafka.producer-X.X.X.jar config.properties
