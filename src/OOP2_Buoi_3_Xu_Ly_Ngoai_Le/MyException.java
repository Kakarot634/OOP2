package OOP2_Buoi_3_Xu_Ly_Ngoai_Le;

class MyException extends Exception {
    public MyException(String s){
        super(s);
    }
}
class Main{
    public static void main(String[] args) {
        try{
            throw new MyException("GeeksGeeks");
        } catch (MyException ex){
            System.out.println(ex.getMessage());
        }
    }
}
