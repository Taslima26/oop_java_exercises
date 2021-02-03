package com.techreturners.cats;

public class AbstractCat implements Cat{
    private boolean isSleep=false;
    private String catSetting;
    private int avgHeight;

    public  AbstractCat(boolean isSleep,String catSetting,int avgHeight){
        this.isSleep=isSleep;
        this.catSetting=catSetting;
        this.avgHeight=avgHeight;
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

    public int getAverageHeight(){
        return this.avgHeight;
    }

}