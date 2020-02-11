package hw13.service;

import hw13.model.Request;

public class WebService extends Thread {
    Request request;

    public WebService(Request request) {
        this.request = request;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("This request is " + request.getName());
    }
}
