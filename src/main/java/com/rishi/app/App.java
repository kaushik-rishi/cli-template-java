package com.rishi.app;

import com.rishi.app.exceptions.WrongValueException;

public class App {
    private int val;
    
    public App() {
        this.val = 0;
    }
    
    public void setVal(int val) throws WrongValueException {
        if (val == 69) {
            throw new WrongValueException("69 value not allowed to be set");
        }
        this.val = val;
    }
    
    public int getVal() {
        return this.val;
    }
}
