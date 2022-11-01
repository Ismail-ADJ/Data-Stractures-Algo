/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastractures;

/**
 *
 * @author ADMIN
 */
public class LinkedListQueue<T> {
DoubleNode<T> rear;
DoubleNode<T> front;
    public LinkedListQueue(DoubleNode firstNode) {
    rear=firstNode;
    front = firstNode;
    }
public void Queue(DoubleNode  newNode){
newNode.next=null;
rear.next=newNode;
newNode.prevous=rear;
rear=newNode;
}
public T DeQueue(){
T value= front.value;
  front=front.next;
  front.prevous=null;

return value;}
}
