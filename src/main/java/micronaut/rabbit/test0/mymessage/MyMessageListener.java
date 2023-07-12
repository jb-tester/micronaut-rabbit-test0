package micronaut.rabbit.test0.mymessage;


import io.micronaut.rabbitmq.annotation.Queue;
import io.micronaut.rabbitmq.annotation.RabbitListener;

@RabbitListener(connection = "foo-connection")
public class MyMessageListener extends MessageCollector {


    @Queue(value = "micronaut-test0", connection = "foo-connection")
    public void receive(String data){


        System.out.println("************************");
        System.out.println(data);
        System.out.println("************************");
        saveMessage(data);
    }

}