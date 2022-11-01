package com.mycompany.datastractures;


import com.mycompany.datastractures.Node;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ADMIN
 */
public class LinkList {
    Node head ;

    public LinkList(Node head) {
        this.head = head;
    }
public void ADD(Node newNode){
newNode.next=head;
head=newNode;
}
public void Delete(){
head=head.next;
} 
public  void Display(){
//Node n= head;
while(head!=null){
    System.out.println(head.value);
    head=head.next;}
}
}
