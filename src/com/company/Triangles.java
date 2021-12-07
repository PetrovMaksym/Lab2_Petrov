package com.company;

import java.util.ArrayList;
import java.util.List;

public class Triangles {

    private final List<Triangle> triangles;

    public Triangles(){triangles = new ArrayList<>();}

    public List<Triangle> getTriangles() {
        return triangles;
    }

    public void add(Triangle triangle){this.triangles.add(triangle);}

    public void remove(Triangle triangle){this.triangles.remove(triangle);}

    public void fillRandom(int n){
        for (int i = 0; i < n; i++) {
            triangles.add(Triangle.generate());
        }
    }

    public double AverageArea(){
        double averageArea = 0;
        for (Triangle triangle : this.triangles){
            averageArea += triangle.Area();
        }
        averageArea /= triangles.size();
        return Math.ceil(averageArea*10)/10;
    }

    @Override
    public String toString() {
        return "\n\n\nТреугольники" + triangles + "; ";
    }
}
