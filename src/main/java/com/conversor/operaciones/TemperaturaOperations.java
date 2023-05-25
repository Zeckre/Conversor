package com.conversor.operaciones;

 //@author duvan
public class TemperaturaOperations {
    
    private double convertText, tempOut;
    private int temp1, temp2;
    
    //CONSTRUCTOR
    public TemperaturaOperations(){        
    }
    
    //GETTERS 
    public double getConvertText() {
        return convertText;
    }
    public double getTempOut() {
        return tempOut;
    }
    public int getTemp1() {
        return temp1;
    }
    public int getTemp2() {
        return temp2;
    }
    
    //SETTERS
    public void setConvertText(double convertText) {
        this.convertText = convertText;
    }
    public void setTempOut(double tempOut) {
        this.tempOut = tempOut;
    }
    public void setTemp1(int temp1) {
        this.temp1 = temp1;
    }
    public void setTemp2(int temp2) {
        this.temp2 = temp2;
    }
    
    //OPERACIONES DE CONVERSIÓN
    public double convertirTemp(){
        if(temp1 == 0 && temp2 == 0){
            tempOut = this.convertText;
        }else if(temp1 == 0 && temp2 == 1){
            tempOut = (this.convertText* 9 / 5) + 32;
        }else if(temp1 == 1 && temp2 == 0){
            tempOut =(this.convertText - 32)* 5 / 9;
        }else{
            tempOut = this.convertText;
        }
        
        return tempOut;
    }  
}