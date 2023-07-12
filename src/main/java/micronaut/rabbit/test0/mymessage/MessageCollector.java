package micronaut.rabbit.test0.mymessage;

import jakarta.inject.Inject;

public abstract class MessageCollector {
  @Inject MessageRepo repo;
  public void saveMessage(String message){
      repo.save(message);
  }

}
