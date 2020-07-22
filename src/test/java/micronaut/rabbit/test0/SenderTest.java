package micronaut.rabbit.test0;

import io.micronaut.context.ApplicationContext;
import micronaut.rabbit.test0.mymessage.MyMessageProducer;
import org.junit.jupiter.api.Test;

class SenderTest {

    @Test
    void sendMessage() {
        ApplicationContext context = ApplicationContext.run();
        MyMessageProducer sender = context.getBean(MyMessageProducer.class);
        sender.send("this is my message");

    }


}