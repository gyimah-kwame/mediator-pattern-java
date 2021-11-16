package io.turntabl;

import io.turntabl.colleagues.User;
import io.turntabl.colleagues.UserImp;
import io.turntabl.mediators.ChatMediator;
import io.turntabl.mediators.ChatMediatorImp;

public class Main {

    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediatorImp();
        User userOne = new UserImp(mediator, 1,"Kwame");
        User userTwo = new UserImp(mediator, 2, "Edem");
        User userThree = new UserImp(mediator, 3, "Jennifer");

        mediator.addUser(userOne);
        mediator.addUser(userTwo);
        mediator.addUser(userThree);


        userOne.send("Hi All");



    }
}
