package com.example.intellijpushdemo;

public class Time {
    public int hr;
    public int min;
    public int sec;

    public Time(){
        hr = 6;
        min = 30;
        sec = 39;
    }
    public Time(int a, int b, int c){
        hr = a;
        min = b;
        sec = c;
    }
    public void SetTime(){
        if (hr >= 0 && hr < 24) {
            this.hr = hr;
        }
        else {
            System.out.println("Invalid hour value (" + hr + "). Setting hour to 0.");
            this.hr = 0;
        }
        if (min >= 0 && min < 60) {
            this.min = min;
        }
        else {
            System.out.println("Invalid minute value (" + min + "). Setting minute to 0.");
            this.min = 0;
        }
        if (sec >= 0 && sec < 60) {
            this.sec = sec;
        }
        else {
            System.out.println("Invalid second value (" + sec + "). Setting second to 0.");
            this.sec = 0;
        }
    }
    public void display(){
        System.out.println(hr+":"+min+":"+sec);
    }
    public static void main(String[] args){
        Time t1 = new Time();
        t1.display();
        Time t2 = new Time(12,56,30);
        t2.display();
    }
}