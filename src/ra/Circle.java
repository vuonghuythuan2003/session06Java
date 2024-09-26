package ra;

import java.util.Scanner;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bán kính của hình tròn: ");
        this.radius = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập vào màu sắc của hình tròn: ");
        this.setColor(sc.nextLine());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Color: " + getColor());
        System.out.println("Bán kính: " + radius);
    }
}
