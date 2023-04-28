package OOP2_Buoi_3_Xu_Ly_Ngoai_Le;
import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        System.out.println("Giải Phương Trình Tuyến Tính");
        System.out.println("Có một phương trình là: 'a * x + b = 0', Hãy tìm x?");
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        double a = sc.nextDouble();
        System.out.println("b: ");
        double b = sc.nextDouble();
        if (a != 0){
            double phuongphap = -b / a;
            System.out.println("Nghiệm của x là: " + phuongphap);
        } else {
            System.out.println("X có tất cả nghiệm x!");
        } if (-b / a == 0){
            System.out.println("Không có nghiệm");
        }
    }
}