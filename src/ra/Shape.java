package ra;

public abstract class Shape {
    private String color;
    public Shape(){}
    public Shape(String color){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public void display(){
        System.out.println("Color: " + color);
    }
}
