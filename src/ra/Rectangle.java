package ra;

import java.util.Scanner;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public void inputDataRectangle() {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng của hình chữ nhật: ");
        this.width = src.nextDouble();
        System.out.println("Nhập vào chiều cao của hình chữ nhật: ");
        this.height = src.nextDouble();
        src.nextLine();
        System.out.println("Nhập vào màu sắc của hình chữ nhật: ");
        this.setColor(src.nextLine());
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void display() {
        System.out.println("Color: " + getColor());
        System.out.println("Chiều rộng: " + width + ", Chiều cao: " + height);
    }
}

