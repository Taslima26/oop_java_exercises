package com.techreturners.cats;

public class AbstractCat implements Cat{
    private boolean isSleep=false;
    private String catSetting="domestic";

    public  AbstractCat(boolean isSleep,String catSetting){
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

    public String getSetting(){
        return this.catSetting;
    }
}