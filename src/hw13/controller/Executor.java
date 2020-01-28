package hw13.controller;

import hw13.model.Request;
import hw13.service.WebService;

public class Executor {
    public static void start() {
        Thread firstThreadRequestOfPost = new Thread(new WebService(new Request("Director")));
        firstThreadRequestOfPost.start();
        Thread secondThreadRequestOfPost = new Thread(new WebService(new Request("Secretary")));
        secondThreadRequestOfPost.start();
        Thread thirdThreadRequestOfPost = new Thread(new WebService(new Request("Accountant")));
        thirdThreadRequestOfPost.start();
        Thread firstThreadRequestOfName = new Thread(new WebService(new Request("Victor")));
        firstThreadRequestOfName.start();
        Thread secondThreadRequestOfName = new Thread(new WebService(new Request("Andrey")));
        secondThreadRequestOfName.start();
        Thread thirdThreadRequestOfName = new Thread(new WebService(new Request("Alex")));
        thirdThreadRequestOfName.start();

    }
}
