package com.techreturners.cats;

public class AbstractCat implements Cat{
    private boolean isSleep=false;
    private String catSetting;
    private int avgHeight;
    private String eatingSound;

    public  AbstractCat(boolean isSleep,String catSetting,int avgHeight,String eatingSound){
        this.isSleep=isSleep;
        this.catSetting=catSetting;
        this.avgHeight=avgHeight;
        this.eatingSound=eatingSound;
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

   public String eat(){
       return this.eatingSound;
   }

}