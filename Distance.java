package com.example.intellijpushdemo;

public class Distance {
    public int feet;
    public int inches;

    public Distance(){
        feet = 5;
        inches = 8;
    }
    public Distance(int a, int b){
        feet = a;
        inches = b;
    }
    public void display(){
        System.out.println(feet+" feet "+inches+" inches ");
    }
    public static void main(String[] args){
        Distance d1 = new Distance();
        d1.display();
        Distance d2 = new Distance(6,2);
        d2.display();
    }
}
