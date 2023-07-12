package micronaut.rabbit.test0.signals;

import jakarta.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class SignalRepo {
    List<String> signals = new ArrayList<>();
    public void save(String pr){
        this.signals.add(pr);
    }
    public List<String> display(){
        return signals;
    }
}
