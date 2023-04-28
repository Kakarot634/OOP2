package OOP2_Buoi_3_Xu_Ly_Ngoai_Le;
import java.io.*;

import static java.lang.reflect.Array.getLength;

public class IllegalArgumentException {
    public static void main(String[] args) {
        String s = "";
        try {
            System.out.println(getLength(s));
        } catch (java.lang.IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
        s = "GeeksforGeeks";
        try {
            System.out.println(getLength(s));
        } catch (java.lang.IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
        s = null;
        try {
            System.out.println(getLength(s));
        } catch (java.lang.IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
    }

    public static int getLength(String s) {
        if (s == null) {
            throw new java.lang.IllegalArgumentException("The argument cannot be null");
        }
            return s.length();
    }
}
