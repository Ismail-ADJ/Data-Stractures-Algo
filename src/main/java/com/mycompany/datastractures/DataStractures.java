package com.mycompany.datastractures;




//import com.mycompany.datastractures.DynamicArray.DynamicArray;
//import com.mycompany.datastractures.LinkeList.LinkList;
//import com.mycompany.datastractures.LinkeList.Node;
//import com.mycompany.datastractures.StackArray.StackArray;
//import com.mycompany.datastractures.StackArray.StackArray;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 *
 * @author ADMIN
 */
public class DataStractures {

    public static void main(String[] args) {
    LinkedListQueue LinkQ= new  LinkedListQueue<String>(new DoubleNode<String>("A",null,null));
    LinkQ.Queue(new DoubleNode<String>("B",null,null));
    LinkQ.Queue(new DoubleNode<String>("C",null,null));
    LinkQ.Queue(new DoubleNode<String>("22",null,null)); 
    LinkQ.Queue(new DoubleNode<String>("S",null,null)); 
    System.out.println(LinkQ.DeQueue());
     
    System.out.println(LinkQ.DeQueue());
    System.out.println(LinkQ.DeQueue());
    System.out.println(LinkQ.DeQueue());
    }

}