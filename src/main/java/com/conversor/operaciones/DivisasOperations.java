package com.conversor.operaciones;

//@author duvan
public class DivisasOperations {
    
    private double convertText, valueOut;
    private int var1, var2;
    
    //Constructor

    public DivisasOperations() {
    }
      
    //Getters 
    public double getConvertText() {
        return convertText;
    }
    public int getVar1() {
        return var1;
    }
    public int getVar2() {
        return var2;
    }
    public double getValueOut() {
        return valueOut;
    }
    //Setters
    public void setConvertText(double convertText) {
        this.convertText = convertText;
    }   
    public void setVar1(int var1) {
        this.var1 = var1;
    }   
    public void setVar2(int var2) {
        this.var2 = var2;
    }
    public void setValueOut(double valueOut) {
        this.valueOut = valueOut;
    }
    
    //Operaciones de conversión
    public double convertirValue(){
        
        if(var1 == 0 && var2 == 0){
            valueOut = this.convertText;
        }else if(var1 == 0 && var2 == 1){
            valueOut = (this.convertText/4812.18);
        }else if(var1 == 0 && var2 == 2){
            valueOut = (this.convertText/3.37);
        }else if(var1 == 0 && var2 == 3){
            valueOut = (this.convertText/5529.01);
        }else if(var1 == 0 && var2 == 4){
            valueOut = (this.convertText/4495.5);
        }else if(var1 == 0 && var2 == 5){
            valueOut = (this.convertText/32.03);
        }else if(var1 == 1 && var2 == 0){
            valueOut = (this.convertText/0.00021);
        }else if(var1 == 1 && var2 == 1){
            valueOut = this.convertText;
        }else if(var1 == 1 && var2 == 2){
            valueOut = (this.convertText/0.00070);
        }else if(var1 == 1 && var2 == 3){
            valueOut = (this.convertText/1.15);
        }else if(var1 == 1 && var2 == 4){
            valueOut = (this.convertText/0.93);
        }else if(var1 == 1 && var2 == 5){
            valueOut = (this.convertText/0.0067);
        }else if(var1 == 2 && var2 == 0){
            valueOut = (this.convertText/0.30);
        }else if(var1 == 2 && var2 == 1){
            valueOut = (this.convertText/1426.12);
        }else if(var1 == 2 && var2 == 2){
            valueOut = this.convertText;
        }else if(var1 == 2 && var2 == 3){
            valueOut = (this.convertText/1638.74);
        }else if(var1 == 2 && var2 == 4){
            valueOut = (this.convertText/1330.66);
        }else if(var1 == 2 && var2 == 5){
            valueOut = (this.convertText/9.49);
        }else if(var1 == 3 && var2 == 0){
            valueOut = (this.convertText*5533.27);
        }else if(var1 == 3 && var2 == 1){
            valueOut = (this.convertText*1.15);
        }else if(var1 == 3 && var2 == 2){
            valueOut = (this.convertText*1639.57);
        }else if(var1 == 3 && var2 == 3){
            valueOut = this.convertText;
        }else if(var1 == 3 && var2 == 4){
            valueOut = (this.convertText*1.23);
        }else if(var1 == 3 && var2 == 5){
            valueOut = (this.convertText*172.68);
        }else if(var1 == 4 && var2 == 0){
            valueOut = (this.convertText*4495.00);
        }else if(var1 == 4 && var2 == 1){
            valueOut = (this.convertText*0.93);
        }else if(var1 == 4 && var2 == 2){
            valueOut = (this.convertText*1331.35);
        }else if(var1 == 4 && var2 == 3){
            valueOut = (this.convertText*0.81);
        }else if(var1 == 4 && var2 == 4){
            valueOut = this.convertText;
        }else if(var1 == 4 && var2 == 5){
            valueOut = (this.convertText*140.18);
        }else if(var1 == 5 && var2 == 0){
            valueOut = (this.convertText*32.04);
        }else if(var1 == 5 && var2 == 1){
            valueOut = (this.convertText*0.0067);
        }else if(var1 == 5 && var2 == 2){
            valueOut = (this.convertText*9.49);
        }else if(var1 == 5 && var2 == 3){
            valueOut = (this.convertText*0.0058);
        }else if(var1 == 5 && var2 == 4){
            valueOut = (this.convertText*0.0071);
        }else if(var1 == 5 && var2 == 5){
            valueOut = this.convertText;
        }      
        
        return valueOut;
    } 
    
}
