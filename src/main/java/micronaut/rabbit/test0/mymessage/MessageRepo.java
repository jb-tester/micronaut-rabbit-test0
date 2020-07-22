package micronaut.rabbit.test0.mymessage;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class MessageRepo {

    List<String> messages = new ArrayList<>();
    public void save(String message){
        this.messages.add(message);
    }
    public List<String> display(){

        return messages;
    }
}
