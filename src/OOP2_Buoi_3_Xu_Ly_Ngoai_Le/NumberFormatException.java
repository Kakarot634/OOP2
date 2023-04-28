package OOP2_Buoi_3_Xu_Ly_Ngoai_Le;

import java.util.Scanner;

public class NumberFormatException extends Throwable {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hãy nhập x: ");
            int x = sc.nextInt();
            System.out.println("Hãy nhập y: ");
            int y = sc.nextInt();
            NumberFormatException calc = new NumberFormatException();
            calc.calculate(x, y);
        }
    private void calculate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Thương x / y = " + c);
            System.out.println("Tích x * y = " + d);
        } catch (Exception e){
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
