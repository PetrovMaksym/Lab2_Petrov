package com.company;

import java.util.Random;

public class Isosceles_triangle extends Triangle {
    public Isosceles_triangle(int a, int b, int c) {
        super(a, b, c);
    }

    public static Isosceles_triangle generate(){
        Random r = new Random();
        int a,b,c;
        do {
            a = r.nextInt(20)+1;
            b = r.nextInt(20)+1;
            c = r.nextInt(20)+1;
        }while(Isosceles_triangle.Check(a,b,c) == false);
        return new Isosceles_triangle(a,b,c);
    }

    public static boolean Check(int a, int b, int c){
        boolean check = false;
        if((a + b > c && a + c > b && b + c > a) && (a==b || a==c || b==c)){
            check = true;
        }
        return check;
    }

    @Override
    public String toString() {
        return "\n\nРавнобедренный треугольник{\n" +
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
