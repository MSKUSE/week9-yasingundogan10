public abstract class Shape {

    private String color  = "white" ;


    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract double perimeter();

    public abstract double area();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}