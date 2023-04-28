package OOP2_Buoi_3_Xu_Ly_Ngoai_Le;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách các phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException arrExample = new ArrayIndexOutOfBoundsException();
        Integer[] arr = arrExample.createRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Vui lòng nhập chỉ số của 1 phần tử bất kỳ: ");
        int x = sc.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5 " + x + "là " + arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
