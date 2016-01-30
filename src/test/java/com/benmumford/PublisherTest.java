package com.benmumford;

import org.junit.*;
import org.jmock.*;

public class PublisherTest {
    
    private Publisher target;
    private Mockery context;
    private ISubscriber mockSubscriber;
    
    @Before
    public void before() {
        this.target = new Publisher();
        
        this.context = new Mockery();
        this.mockSubscriber = context.mock(ISubscriber.class);
    }
    
    @Test
    public void testNotifySubscribers() {
        final String message = "Hello!";
        
        context.checking(new Expectations() {{
            oneOf(mockSubscriber).notify(message);
        }});
        
        this.target.addSubscriber(this.mockSubscriber);
        this.target.notifySubscribers(message);
        
        context.assertIsSatisfied();
    }
}
