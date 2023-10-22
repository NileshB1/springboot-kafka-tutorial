# Spring Boot + Apache Kafka + Simple project

## The Project

This project demonstrates how to integrate Apache Kafka in Spring Boot application  
- Create Kafka Topic, Producer and Consumer
- Exchange simple String messages between Producer and Consumer using Kafka broker
- Exchange JSON messages between Producer and Consumer using Kafka broker

## Setup
#### Requirements
- Java 17
- Spring Boot 3.x
- Apache Kafka 2.13
  - https://kafka.apache.org/quickstart
- Maven 3.x
- Junit 5.x

## The Solution
Implemented microservice in Springboot talking to Kafka as messaging solutions

## How to run
- Start Kafka zookeeper service:
  - [root@osboxes kafka]# bin/zookeeper-server-start.sh config/zookeeper.properties
- Start Kafka server:
  - [root@osboxes kafka]# bin/kafka-server-start.sh config/server.properties
- Start Spring Boot project:
  - [root@osboxes target]# /opt/jdk-17/bin/java -jar springboot-kafka-tutorial-0.0.1-SNAPSHOT.jar
