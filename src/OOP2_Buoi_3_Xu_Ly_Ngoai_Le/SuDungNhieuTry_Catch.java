package OOP2_Buoi_3_Xu_Ly_Ngoai_Le;

import java.util.Scanner;

public class SuDungNhieuTry_Catch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        try {
            int n = Integer.parseInt(scn.nextLine());
            if (99%n == 0)
                System.out.println(n + " is a factor of 99");
        } catch (java.lang.NumberFormatException | ArithmeticException ex) {
            System.out.println("Exception encountered " + ex);
        }
    }
}
