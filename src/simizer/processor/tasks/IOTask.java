/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simizer.processor.tasks;

import simizer.VM;

/**
 * Task for IO operations, 
 * Describes how to configure the next Data ready Event.
 * 
 * @author Sylvain Lefebvre
 */
public abstract class IOTask extends Task {
    
    
    
    private final int sz;
    
    public IOTask(int sz) {
        super(null);
        this.sz =  sz;
    }
    

    public int getSize() {
        return sz;
    }

    @Override
    public abstract void startTask(VM vm, long timestamp);
    
   
    
}