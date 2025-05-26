package Lecture2;

public class circle {
    private double radius;

    public double calcArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        circle c1 = new circle();
        c1.radius = 3.0;
        System.out.println("Area of circle with " + c1.radius + " is : " + c1.calcArea());
    }
}
