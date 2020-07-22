package micronaut.rabbit.test0.mymessage;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import javax.inject.Inject;
import java.util.List;

@Controller
public class MyMessageController {

    @Inject
    MessageRepo repo;
    @Inject
    MyMessageProducer producer;

    @Get("/all")
    public List<String> getAll(){

        return repo.display();
    }
    @Post("/add/{message}")
    public void addMessage(String message){
        producer.send(message);
    }

    @Post("/empty")
    public void sendEmptyMessage(){
        producer.send();
    }
}
