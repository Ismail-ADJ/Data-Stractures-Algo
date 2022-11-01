package com.mycompany.datastractures;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class DynamicArray {
 int size;
    int [] data ;
    public DynamicArray() {
    size=0;
    data = new int [1];
    }
public  int  getdata (int index){   
return data[index];
}   
public void put(int element){
ensurCapacity(size+1);
data[size++]=element;
}
public void ensurCapacity(int newSize){
    int oldSize= data.length;
    if(newSize>oldSize){
        int doubledSize=oldSize*2;
        data= Arrays.copyOf(data, doubledSize);
            
    }
}
public int getsize(){

return data.length;
}    
}
