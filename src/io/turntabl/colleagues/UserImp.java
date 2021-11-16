package io.turntabl.colleagues;

import io.turntabl.mediators.ChatMediator;

public class UserImp extends User {

    public UserImp(ChatMediator mediator, int id, String name) {
        super(mediator, id, name);
    }

    @Override
    public void send(String msg){
        System.out.println(this.name+": Sending Message="+msg+"\n");
        mediator.sendMessage(msg, this);
    }
    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Received Message:"+msg);
    }

}