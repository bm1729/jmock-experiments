package com.benmumford;

public interface IPublisher {
    
    void addSubscriber(ISubscriber subscriber);
    
    void notifySubscribers(int message);
}