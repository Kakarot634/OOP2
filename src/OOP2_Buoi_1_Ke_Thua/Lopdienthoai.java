package OOP2_Buoi_1_Ke_Thua;

public abstract class Lopdienthoai {
    public void downloadApp(){};
}
class Android extends Lopdienthoai{
    @Override
    public void downloadApp() {
        System.out.println("Download from CHplay");
    };
}
class IOS extends Lopdienthoai{
    @Override
    public void downloadApp() {
        System.out.println("Download from Appstore");
    };
}
class AndroidTest{
    public static void main(String[] args) {
        Android Xiaomi = new Android();
        IOS IphoneX = new IOS();
        Xiaomi.downloadApp();
        IphoneX.downloadApp();
    }
}
