List of Commands:
----------------
1. .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
2. .\bin\windows\kafka-server-start.bat .\config\server.properties
3. .\bin\windows\kafka-topics.bat --create --topic demo --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
4. .\bin\windows\kafka-topics.bat --describe --bootstrap-server localhost:9092 --topic demo
should show Topic: demo     TopicId: 3EkhycSaR6-K3F8EG44eYw PartitionCount: 1       ReplicationFactor: 1    Configs:
        Topic: demo     Partition: 0    Leader: 0       Replicas: 0     Isr: 0  Elr: N/A        LastKnownElr: N/A
5. .\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic veda --from-beginning
6. push the events/messages .\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic demo
>hello   



Postman URL:
------------
http://localhost:8085/location/update
