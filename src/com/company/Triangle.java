package com.company;

import java.util.Random;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public static Triangle generate(){
        Random r = new Random();
        int a,b,c;
        do {
            a = r.nextInt(20)+1;
            b = r.nextInt(20)+1;
            c = r.nextInt(20)+1;
        }while(Triangle.Check(a,b,c) == false);
        return new Triangle(a,b,c);
    }

    public static boolean Check(int a, int b, int c){
        boolean check = false;
        if(a + b > c && a + c > b && b + c > a){
            check = true;
        }
        return check;
    }

    public double Angle1() {
        double angle1 = Math.acos((Math.pow(getA(),2)+Math.pow(getB(),2) - Math.pow(getC(),2))/(2*getA()*getB()));
        return Math.ceil(Math.toDegrees(angle1)*10)/10;
    }

    public double Angle2() {
        double angle2 = Math.acos((Math.pow(getA(),2)+Math.pow(getC(),2) - Math.pow(getB(),2))/(2*getA()*getC()));
        return Math.ceil(Math.toDegrees(angle2)*10)/10;
    }

    public double Angle3() {
        double angle3 = Math.acos((Math.pow(getB(),2)+Math.pow(getC(),2) - Math.pow(getA(),2))/(2*getC()*getB()));
        return Math.ceil(Math.toDegrees(angle3)*10)/10;
    }

    public int Perimetr(){
        int perimetr = getA()+getB()+getC();
        return perimetr;
    }

    // Пересчет нужен
    public double Area(){
        double area = Math.abs(0.5*getA()*getB()*Math.sin(Angle1()));
        return Math.ceil(area*10)/10;
    }

    @Override
    public String toString() {
        return "\n\nТреугольник{\n" +
                "\n\nСторона 1: " + getA() +
                "\nСторона 2: " + getB() +
                "\nСторона 3: " + getC() +
                "\n\nУгол 1: " + Angle1() +
                "\nУгол 2: " + Angle2() +
                "\nУгол 3: " + Angle3() +
                "\n\nПериметр: " + Perimetr() +
                "\nПлощадь: " + Area() +
                "\n}";
    }
}
