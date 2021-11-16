package io.turntabl.mediators;

import io.turntabl.colleagues.User;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImp implements ChatMediator {

    private List<User> users;

    public ChatMediatorImp(){
        users=new ArrayList<>();
    }

    @Override
    public void addUser(User user){
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for(User u : this.users){
            if(u.getId() != user.getId()){
                u.receive(msg);
            }
        }
    }

}