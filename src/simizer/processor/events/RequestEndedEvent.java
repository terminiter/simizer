/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simizer.processor.events;

import simizer.event.Event;
import simizer.requests.RequestFinisher;
import simizer.requests.Request;

/**
 *
 * @author isep
 */
public class RequestEndedEvent extends Event<Request, RequestFinisher> {
    
    public RequestEndedEvent(long timestamp, Request r, RequestFinisher p) {
        super(timestamp, r,p);
    }
    @Override
    public void dispatch() {
       this.target.onRequestEnded(timestamp, this.data);
    }
    
}