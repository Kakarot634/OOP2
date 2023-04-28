package OOP2_Buoi_3_Xu_Ly_Ngoai_Le;

public class Ternary_Operator {
    public static void main (String[] args)
    {
        String str = null;
        String message = (str == null) ? "" :
                str.substring(0,5);
        System.out.println(message);

        str = "Geeksforgeeks";
        message = (str == null) ? "" : str.substring(0,5);
        System.out.println(message);
    }
}
