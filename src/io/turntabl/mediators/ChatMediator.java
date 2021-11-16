package io.turntabl.mediators;

import io.turntabl.colleagues.User;

public interface ChatMediator {

    void sendMessage(String message, User user);

    void addUser(User user);
}