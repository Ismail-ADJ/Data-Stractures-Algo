package com.mycompany.datastractures;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ADMIN
 */
public class StackArray<T>{
Object[] Stcarray;
int top;
int size;

    public StackArray(int size) {
       this.size = size;
       Stcarray = new  Object[this.size];
       top=-1;
 }
    
public void push(Object newItem){
   if(isFull()){
       
       System.out.println("stack is Full"); 
       return; }
   top++;
  Stcarray[top]=newItem;
}
public T pop(){
if(isEmpty()) {
    System.out.println("stack is Empity");
    return null;} 
T item = (T) Stcarray[top];
top--;
return item;}
 public Boolean isFull(){
  
 return (top==size);}
 public Boolean isEmpty(){
  
 return (top==-1);}
}
