package com.benmumford;

import java.util.List;
import java.util.ArrayList;

public class Publisher {
    
    private List<ISubscriber> subscribers;
    
    public Publisher() {
        this.subscribers = new ArrayList<ISubscriber>();
    }
    
    public void addSubscriber(ISubscriber subscriber) {
        this.subscribers.add(subscriber);
    }
    
    public void notifySubscribers(int message) {
        for (ISubscriber subscriber : this.subscribers) {
            subscriber.notify(message);
        }
    }
}