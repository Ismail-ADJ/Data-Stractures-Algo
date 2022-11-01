/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastractures;

/**
 *
 * @author ADMIN
 */
public class ArrayClass {
        
    public ArrayClass() {
        

  
    }
public void intArray()    {
    int [] array = new int[5];
        array[0]=10;
        array[1]=11;
        array[2]=12;
        array[3]=13;
        array[4]=14;
for(int i=0;i< array.length; i++)
            System.out.println(array[i]);
}
public void ObjectArray()    {
Student[] std = new Student[3];  
std[0]= new Student("ISM",01,31);
std[1]= new Student("FAC",02,25);
std[2]= new Student("SOF",03,8);

 System.out.println("first per is: "+ std[0].name+ " his age is: "+ std[0].age + " secend per is : " + std[1].name+ " his age is : "+ std[1].age );
}
public void TowdimArray(){
int [][] todimarry= new int [2][3];

todimarry[0][0]=0;
todimarry[0][1]=1;
todimarry[0][2]=4;
todimarry[1][0]=2;
todimarry[1][1]=3;
todimarry[1][2]=5;

for(int i=0;i<2; i++)
    for(int j =0 ; j< 3 ; j++)
        System.out.println(todimarry[i][j]+ "\t");
}


    
}
