package design_pattern.behavioral_Patterns.observer.after;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {
    Map<String, List<Subscribe>> subscribeMap = new HashMap<>();

    public void register(String subject , Subscribe subscriber){


        if(this.subscribeMap.containsKey(subject)){
            this.subscribeMap.get(subject).add(subscriber);
        }else{
            List<Subscribe> list = new ArrayList<>();
            list.add(subscriber);
            this.subscribeMap.put(subject, list);
        }
    }

    public void unregister(String subject, Subscribe subscribe){
        if(subscribeMap.containsKey(subject)){
            subscribeMap.get(subject).remove(subscribe);
        }

    }

    public void sendMessage(User user, String subject, String message){
        if (this.subscribeMap.containsKey(subject)) {
            String userMessage = user.getName() + ": " + message;
            this.subscribeMap.get(subject).forEach(s -> s.handleMessage(userMessage));
    }
}}
