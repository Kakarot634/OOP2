package OOP2_Buoi_1_Ke_Thua;

public class Lopconnguoi {
    private String name;
    private boolean gender;
    private int age;

    public Lopconnguoi(){
        this.name = "Tên mặc định";
        this.gender = false;
        this.age = 0;
    }

    public Lopconnguoi(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){
        System.out.println("Con người đang ăn");
    }
    public void sleep(){
        System.out.println("Con người đang ngủ");
    }

    @Override
    public String toString() {
        return "1 con người mang tên: "
                + getName()
                + ", tuổi: "
                +getAge()
                + " và giới tính là: "
                + (isGender() ? "Nam" : "Nữ");
    }
}
class ConnguoiTest{
    public static void main(String[] args) {
        Lopconnguoi Connguoi = new Lopconnguoi();
        System.out.println(Connguoi);
        Connguoi = new Lopconnguoi("Kiana Kaslana", false, 16);
        Connguoi.setAge(18);
        System.out.println(Connguoi);
    }
}
class HocSinh extends Lopconnguoi{
    private String classname;

    public HocSinh(){
        super();
        this.classname = "D101_C1K14";
    }
    public HocSinh(String classname){
        super();
        this.classname = classname;
    }
    public HocSinh(String name, boolean gender, int age, String classname){
        super(name, gender, age);
        this.classname = classname;
    }
    public String getClassname(){
        return classname;
    }
    public void setClassname(){
        this.classname = classname;
    }
    public void Hoc(){
        System.out.println("Đang học gõ code");
    }

    @Override
    public String toString() {
        return "1 học sinh mang tên lớp: "
                + getClassname()
                + " ,đó là một lớp con của "
                + super.toString();
    }
}
class HocsinhTest{
    public static void main(String[] args) {
        HocSinh hocsinh = new HocSinh();
        System.out.println(hocsinh);
        hocsinh = new HocSinh("D101_C2K14");
        System.out.println(hocsinh);
        hocsinh = new HocSinh("Son Goku", true, 18, "IBSK1D2");
        System.out.println(hocsinh);
    }
}
class Nguoilaodong extends Lopconnguoi{
    private String xinghiep;
    public  Nguoilaodong(){
        super();
        this.xinghiep = "CodeGym";
    }
    public Nguoilaodong(String xinghiep){
        super();
        this.xinghiep = xinghiep;
    }
    public Nguoilaodong(String name, boolean gender, int age, String xinghiep){
        super(name, gender, age);
        this.xinghiep = xinghiep;
    }
    public String getXinghiep(){
        return xinghiep;
    }
    public void setXinghiep(String xinghiep){
        this.xinghiep = xinghiep;
    }
    public void work(){
        System.out.println("Đang làm việc");
    }

    @Override
    public String toString() {
        return "1 người lao động làm việc tại: "
                + getXinghiep()
                + " ,đó là một lớp con của "
                + super.toString();
    }
}
class NguoilaodongTest{
    public static void main(String[] args) {
        Nguoilaodong nhanvien = new Nguoilaodong();
        System.out.println(nhanvien);
        nhanvien = new Nguoilaodong("Toshi", true, 35, "Viettel");
        System.out.println(nhanvien);
        nhanvien.work();
        nhanvien.setXinghiep("Bandainamco Entertainment");
        System.out.println(nhanvien);
    }
}

