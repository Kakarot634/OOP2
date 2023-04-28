package OOP2_Buoi_3_Xu_Ly_Ngoai_Le;

import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
        String ptr = null;
        try{
        if ("GFG".equals("ptr"))
            System.out.print("Same");
        else
            System.out.print("Not Same");
        } catch (NullPointerException e){
            System.out.println("NullPointerException caught");
        }
    }
}
