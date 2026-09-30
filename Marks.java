package com.example.intellijpushdemo;

public class Marks {
    public int stud1;
    public int stud2;
    public int stud3;

    public Marks(){
        stud1 = 70;
        stud2 = 68;
        stud3= 84;
    }
    public Marks(int a, int b, int c){
        stud1= a;
        stud2= b;
        stud3= c;
    }
    public int total(){
        return stud1+stud2+stud3;
    }
    public static void main(String[] args){
        Marks m1 = new Marks();
        System.out.println("Total 1 = "+m1.total());
        Marks m2 = new Marks(82,78,77);
        System.out.println("Total 2 = "+m2.total());
    }
}
