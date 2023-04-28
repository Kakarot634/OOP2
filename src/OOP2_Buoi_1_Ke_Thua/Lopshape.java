package OOP2_Buoi_1_Ke_Thua;

public class Lopshape {
    private String color;
    private boolean filled;

    public Lopshape(){
        this.color = "Green";
        this.filled = true;
    }
    public Lopshape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "1 hình với màu của "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
class ShapeTest {
    public static void main(String[] args) {
        Lopshape shape = new Lopshape();
        System.out.println(shape);
        shape = new Lopshape("Red", false);
        System.out.println(shape);
    }
}
class Circle extends Lopshape{
    private double radius;
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "1 hình trong với bán kính= "
                + getRadius()
                + ", đó là 1 lớp con của "
                + super.toString();
    }
}
class CircleTest{
    public static void main(String[] args) {
        Circle hinhtron1 = new Circle();
        System.out.println(hinhtron1);
        hinhtron1 = new Circle(3.5);
        System.out.println(hinhtron1);
        hinhtron1 = new Circle(3.5, "Purple", false);
        System.out.println(hinhtron1);
    }
}
class Rectangle extends Lopshape{
    private double width;
    private double length;

    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width * this.length;
    }
    public double getPerimeter(){
        return 2 * (width + this.length);
    }
    public String toString(){
        return "1 hình chữ nhật với chiều rộng="
                + getWidth()
                + " và chiều dài="
                + getLength()
                + ", đó là 1 lớp con của "
                + super.toString();
    }
}
class RectangleTest{
    public static void main(String[] args) {
        Rectangle Hinhchunhat = new Rectangle();
        System.out.println(Hinhchunhat);
        Hinhchunhat = new Rectangle(2.4, 5.6);
        System.out.println(Hinhchunhat);
        Hinhchunhat = new Rectangle(4.6, 6.4,"Gold",true);
        System.out.println(Hinhchunhat);
    }
}
class Square extends Rectangle{
    public Square(){
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double width){
        setSide(width);
    }
    public void setLength(double length){
        setSide(length);
    }
    public String toString(){
        return "1 hình vuông có cạnh="
                + getSide()
                + ", đó là 1 lớp con của "
                + super.toString();
    }
}
class SquareTest {
    public static void main(String[] args) {
        Square hinhvuong = new Square();
        System.out.println(hinhvuong);
        hinhvuong = new Square(2);
        System.out.println(hinhvuong);
        hinhvuong = new Square(4,"Black",true);
        System.out.println(hinhvuong);
    }
}