package com.company;

import java.util.ArrayList;
import java.util.List;

public class Isosceles_triangles {
    private final List<Isosceles_triangle> isosceles_triangles;

    public Isosceles_triangles(){isosceles_triangles = new ArrayList<>();}

    public List<Isosceles_triangle> getIsosceles_triangles() {
        return isosceles_triangles;
    }

    public void add(Isosceles_triangle isosceles_triangle){this.isosceles_triangles.add(isosceles_triangle);}

    public void remove(Isosceles_triangle isosceles_triangle){this.isosceles_triangles.remove(isosceles_triangle);}

    public void fillRandom(int n){
        for (int i = 0; i < n; i++) {
            isosceles_triangles.add(Isosceles_triangle.generate());
        }
    }

    public void MinArea(){
        double minArea = 160;
        for (Isosceles_triangle isosceles_triangle : this.isosceles_triangles){
            if(isosceles_triangle.Area()<minArea){
                minArea = isosceles_triangle.Area();
            }
        }

        System.out.println("\nРавнобедренный треугольник с минимальной площадью: ");
        for (Isosceles_triangle isosceles_triangle : this.isosceles_triangles){
            if(minArea == isosceles_triangle.Area()){
                System.out.println(isosceles_triangle);
            }
        }
    }

    @Override
    public String toString() {
        return "\n\n\nРавнобедренные треугольники" + isosceles_triangles + "; ";
    }
}
