/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastractures;

/**
 *
 * @author ADMIN
 */
public class QueueArray<T> {
 Object[] QueueOFArray;
 int rear,front ,Size;

    public QueueArray(int Size) {
        this.Size = Size;
        rear=-1;
        front=-1;
        QueueOFArray = new Object[this.Size];
    }
 public void Queue(Object newItem){
 if(isFull()){
 System.out.println("Queue is full");
  return; }
 rear=rear+1;
 QueueOFArray[rear]=newItem;
 System.out.println("Adding"+ newItem);
    if(front==-1){
        front=0;
        System.out.println("Start Front"); }      
  }
 public T  DeQueue(){
  if(isEmpty()){
    System.out.println("Queue is Empty");
    return null; }
 T OutItem = (T) QueueOFArray[front];
 front++;
 System.out.println("displaying");
 return OutItem;
 }
 Boolean isFull(){
 return (rear==Size-1);
 }
  Boolean isEmpty(){
  
  return (front==-1 || front>rear);}
}
