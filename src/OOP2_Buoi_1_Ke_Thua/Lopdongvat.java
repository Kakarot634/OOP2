package OOP2_Buoi_1_Ke_Thua;

public class Lopdongvat {
    private double weight;
    private double height;
    public Lopdongvat(){
        this.weight = 0.0;
        this.height = 0.0;
    }
    public Lopdongvat(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "1 động vật mang cân nặng: "
                + getWeight()
                + " và "
                + getHeight();
    }
}
class LopdongvatTest{
    public static void main(String[] args) {
        Lopdongvat dongvat = new Lopdongvat();
        System.out.println(dongvat);
        Lopdongvat dongvat1 = new Lopdongvat(7, 8);
        System.out.println(dongvat1);
        Lopdongvat dongvat2 = new Lopdongvat();
        dongvat2.setHeight(1);
        dongvat2.setWeight(10);
        System.out.println(dongvat2);
    }
}
class Cat extends Lopdongvat{
    private double age;
    public Cat(){
        super();
        this.age = 1.0;
    }
    public Cat(double age){
        super();
        this.age = age;
    }
    public Cat(double weight, double height, double age){
        super(weight, height);
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
    public String sound(){
        return "Meo meo";
    }
    public String eat(){
        return "Chuột!!!";
    }

    @Override
    public String toString() {
        return "1 con mèo mang tuổi: "
                + getAge()
                + ", đó là 1 lớp con của "
                + super.toString();
    }
}
class  CatTest {
    public static void main(String[] args) {
        Cat meo = new Cat();
        System.out.println(meo);
        meo = new Cat(3.5);
        System.out.println(meo);
        meo = new Cat(3.5, 5, 10);
        System.out.println(meo);
    }
}
