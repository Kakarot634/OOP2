package OOP2_Buoi_3_Xu_Ly_Ngoai_Le;

public class NemNgoaiLe {
    static void vui(){
        try{
            throw new NullPointerException("demo");
        } catch (NullPointerException e){
            System.out.println("Niem vui bi bat o ben trong().");
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            vui();
        } catch (NullPointerException e){
            System.out.println("Bi bat o main.");
        }
    }
}
