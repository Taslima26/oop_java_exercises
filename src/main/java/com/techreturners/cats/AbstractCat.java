package com.techreturners.cats;

public class AbstractCat implements Cat{
    private boolean isSleep=false;

    public  AbstractCat(boolean isSleep){
        this.isSleep=isSleep;
    }

    public void goToSleep() {
        this.isSleep = true;
        
    }

    public void wakeUp() {
        this.isSleep = false;
    }

    public boolean isAsleep() {
        return this.isSleep;
    }
}