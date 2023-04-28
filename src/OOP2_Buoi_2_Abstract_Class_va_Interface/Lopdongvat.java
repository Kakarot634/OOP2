package OOP2_Buoi_2_Abstract_Class_va_Interface;


public abstract class Lopdongvat{
     public abstract String makeSound();
}
class Sutu extends Lopdongvat{
    @Override
    public String makeSound() {
        return "Sư tử: gầm!";
    }
}
class Vit extends Lopdongvat{
    @Override
    public String makeSound() {
        return "Vịt: quác-quác!";
    }
}
class Testsoundanimal{
    public static void main(String[] args) {
        Lopdongvat[] dongvats = new Lopdongvat[2];
        dongvats[0] = new Sutu();
        dongvats[1] = new Vit();
        for (Lopdongvat lopdongvat : dongvats) {
            System.out.println(lopdongvat.makeSound());
        }
    }
}
class Testsoundanimal1{
    public static void main(String[] args) {
        Lopdongvat[] lopdongvats = new Lopdongvat[2];
        lopdongvats[0] = new Sutu();
        lopdongvats[1] = new Vit();
        for (Lopdongvat lopdongvat: lopdongvats) {
            System.out.println(lopdongvat.makeSound());
            if (lopdongvat instanceof Vit){
                Edible edibler = (Vit1) lopdongvat;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
interface Edible{
    String howToEat();
}

class Vit1 extends Lopdongvat implements Edible {
    @Override
    public String makeSound() {
        return "Vịt: quác-quác!";
    }

    @Override
    public String howToEat() {
        return "Có thể cho vào nổi lẩu";
    }
}
abstract class Hoaqua implements Edible{}
class Tao extends Hoaqua{
    @Override
    public String howToEat() {
        return "Táo có thể cắt và ăn như bình thường";
    }
}
class Thanhlong extends Hoaqua{
    @Override
    public String howToEat() {
        return "Thanhlong có thể làm nước ép";
    }
}
class Testhoaqua {
    public static void main(String[] args) {
        Hoaqua[] hoaquas= new Hoaqua[2];
        hoaquas[0] = new Tao();
        hoaquas[1] = new Thanhlong();
        for (Hoaqua hoaqua : hoaquas) {
            System.out.println(hoaqua.howToEat());
        }
    }
}
