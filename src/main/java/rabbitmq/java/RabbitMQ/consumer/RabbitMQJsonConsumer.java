package rabbitmq.java.RabbitMQ.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import rabbitmq.java.RabbitMQ.dto.User;
import rabbitmq.java.RabbitMQ.publisher.RabbitMQJsonProducer;

@Service
public class RabbitMQJsonConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonProducer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    private void consumeJsonMessage(User user){
        LOGGER.info(String.format("Received Json message -> %s", user.toString()));

    }
}
