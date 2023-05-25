package com.conversor.operaciones;

 //@author duvan
public class LongitudesOperations {

    private double convertText, meterOut;
    private int meter1, meter2;
    
    //CONSTRUCTOR
    public LongitudesOperations(){        
    }
    
    //GETTERS
    public double getConvertText() {
        return convertText;
    }
    public double getMeterOut(){
        return meterOut;
    }
    public int getMeter1(){
        return meter1;
    }
    public int getMeter2() {
        return meter2;
    }
    
    //SETTERS
    public void setConvertText(double convertText){
        this.convertText = convertText;
    }
    public void setMeterOut(double meterOut) {
        this.meterOut = meterOut;
    }
    public void setMeter1(int meter1){
        this.meter1 = meter1;
    }
    public void setMeter2(int meter2) {
        this.meter2 = meter2;
    }
    
    //OPERERACIONES
    
    public double convertirMeter(){
        if(meter1 == 0 && meter2 == 0){
            meterOut = this.convertText;
        }else if(meter1 == 0 && meter2 == 1){
            meterOut = this.convertText / 1.609344;
        }else if(meter1 == 0 && meter2 == 2){
            meterOut = this.convertText * 3280.84;
        }else if(meter1 == 0 && meter2 == 3){
            meterOut = this.convertText * 1093.61;
        }else if(meter1 == 1 && meter2 == 0){
            meterOut = this.convertText / 0.621371;
        }else if(meter1 == 1 && meter2 == 1){
            meterOut = this.convertText;
        }else if(meter1 == 1 && meter2 == 2){
            meterOut = this.convertText * 5280;
        }else if(meter1 == 1 && meter2 == 3){
            meterOut = this.convertText * 1760;
        }else if(meter1 == 2 && meter2 == 0){
            meterOut = this.convertText / 3280.84;
        }else if(meter1 == 2 && meter2 == 1){
            meterOut = this.convertText / 5280;
        }else if(meter1 == 2 && meter2 == 2){
            meterOut = this.convertText;
        }else if(meter1 == 2 && meter2 == 3){
            meterOut = this.convertText / 3;
        }else if(meter1 == 3 && meter2 == 0){
            meterOut = this.convertText * 0.0009144;
        }else if(meter1 == 3 && meter2 == 1){
            meterOut = this.convertText / 1760;
        }else if(meter1 == 3 && meter2 == 2){
            meterOut = this.convertText * 3;
        }else if(meter1 == 3 && meter2 == 3){
            meterOut = this.convertText;
        }
        
        return meterOut;
    }   
}
