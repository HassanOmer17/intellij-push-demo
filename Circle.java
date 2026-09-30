package com.example.intellijpushdemo;

public class Circle {
    public double rad;

    public Circle(){
        rad = 5.0;
    }
    public Circle(double a){
        rad = a;
    }
    public double Circumference(){
        return 2 * Math.PI * rad;
    }
    public static void main(String[] args){
        Circle c1 = new Circle();
        System.out.println(c1.Circumference());
        Circle c2 = new Circle(10.0);
        System.out.println(c2.Circumference());
    }
}
