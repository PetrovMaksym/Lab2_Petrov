package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(5)+1;
        Triangles triangles = new Triangles();
        triangles.fillRandom(n);
        System.out.println(triangles);
        System.out.println("\nСредняя площадь треугольников: " + triangles.AverageArea());

        n = r.nextInt(5)+1;
        Isosceles_triangles isosceles_triangles = new Isosceles_triangles();
        isosceles_triangles.fillRandom(n);
        System.out.println(isosceles_triangles);
        isosceles_triangles.MinArea();
    }
}
