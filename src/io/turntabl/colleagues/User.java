package io.turntabl.colleagues;

import io.turntabl.mediators.ChatMediator;

public abstract class User {
    protected ChatMediator mediator;
    protected int id;
    protected String name;

    public User(ChatMediator mediator, int id, String name){
        this.mediator=mediator;
        this.id = id;
        this.name=name;
    }

    public abstract void send(String message);

    public abstract void receive(String message);

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}