# RabbitMQ
#Learn RabbitMQ 

What is RabbitMQ?
![image](https://github.com/HangPhan-18/RabbitMQ/assets/89575378/06f9bf3b-e16b-4006-8e01-ba360373e9bf)

- RabbitMQ is an open-source message broker software used to tranfer data between processes, applications, systems or servers. RabbitMQ receives messages from different components in a system, stored them safety, and then pushes them to their destinations.
#Key Features of RabbitMQ
1. Message Broker
   - RabbitMQ acts an intermediary for messaging, enabling applications to communicate by sending and receiving messages through queues.

2. Queues
   - Queues are used to store message until they are processed and acknowledged by consumers. Producers send messages to queues, and consumers retrieve messages from them.

3. Exchanges
   - Exchanges are reponsible for routing messages to queues based on routing rules.
     There are different types of exchanges:
      - Direct Exchange: Routest messages to queues based on an exact match between the routing key and the queue binding key.
      - Fanout Exchange: Routes messages to all bound queues without considering the routing key
      - Topic Exchange: Routes messages to queues based on pattern matching between the routing key and the queue binding pattern.
      - Header Exchange: Routes messages based on headers instead of the routing key.

4. Bindings:
   - Bindings are the links between exchanges and queues. They define the routing rules the determine how messages are routed from an exchange to a queue.

5. Consumers and Producers:
   - Consumers: are application that recieve message from queues
   - Producers: sre application that send message from exchanges.


# Basic Workflow
1. Producer sends a message to a exchange
2. Exchange routes the message to one or more queues based on routing rules
3. Consumer retrieves the message from the queue and processes it.
