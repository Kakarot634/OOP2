package OOP2_Buoi_1_Ke_Thua;

public class LopCircle {
    private double bankinh;

    private String color;
    public LopCircle(){
        this.bankinh = 0.0;
        this.color = "Màu đen";
    }
    public LopCircle(double bankinh, String color){
        this.bankinh = bankinh;
        this.color = color;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return bankinh * Math.PI;
    }
    @Override
    public String toString() {
        return " 1 hình tròn mang bán kính: "
                + getBankinh()
                + ", màu: "
                + getColor()
                + ", diện tích hình tròn là: "
                + getArea();
    }
}
class HinhtronTest{
    public static void main(String[] args) {
        LopCircle hinhtron = new LopCircle();
        System.out.println(hinhtron);
        hinhtron = new LopCircle(3.5,"Vàng");
        System.out.println(hinhtron);
    }
}
class Cylinder extends LopCircle{
    private double bankinh;
    private double height;
    public Cylinder(){
    }
    public Cylinder(double bankinh, double height){
        this.bankinh = bankinh;
        this.height = height;
    }
    public Cylinder(double height, double bankinh, String color){
        super(bankinh, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return this.height * bankinh * bankinh * Math.PI;
    }

    @Override
    public String toString() {
        return " 1 hình trụ với bán kính= "
                + getBankinh()
                + ", chiều cao= "
                + getHeight()
                + ", màu: "
                + getColor()
                + ", diện tích của hình trụ là: "
                + getVolume()
                + super.toString();
    }
}
class CylinderTest{
    public static void main(String[] args) {
        Cylinder hinhtru = new Cylinder();
        System.out.println(hinhtru);
        hinhtru = new Cylinder(6.8,3.6,"Đỏ");
        System.out.println(hinhtru);
    }
}
